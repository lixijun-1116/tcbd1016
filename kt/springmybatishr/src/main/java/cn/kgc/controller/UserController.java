package cn.kgc.controller;

import cn.kgc.entity.Dept;
import cn.kgc.entity.Emp;
import cn.kgc.entity.Login;
import cn.kgc.service.DeptService;
import cn.kgc.service.EmpService;
import cn.kgc.service.LoginService;
import cn.kgc.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Scanner;

@Controller("userController")
public class UserController {
    Scanner sc = new Scanner(System.in);
    @Autowired
    private LoginService loginService;

    @Autowired
    private DeptService deptService;

    @Autowired
    private EmpService empService;

    private static Integer eid;

    private static String lastName;

    public void index() {
        System.out.println("欢迎进入唐城员工管理系统");
        login();
    }

    /**
     * 登录（账号或手机号和密码登录）
     */
    private void login() {
        Login login = new Login();
        System.out.print("请输入账号或手机号>>>");
        String mobile = sc.next();
        System.out.print("\n请输入密码>>>");
        String password = sc.next();
        String pattern = "^[0-9]*$";
        if (mobile.matches(pattern)) {
            Emp emp = new Emp();
            emp.setMobile(mobile);
            login.setEmp(emp);
        } else {
            login.setAccount(mobile);
        }
        login.setPassword(password);
        Login login1 = loginService.login(login);
        System.out.println("正在登录，请稍后...");
        if (login1 != null) {
            System.out.println("登陆成功,正在进入系统...");
            lastName = login1.getEmp().getLastName();
            eid = login1.getEid();
            queryDeptByEid(login1.getEid());
        } else {
            System.out.println("账号或密码错误，请重新登录!!!");
            login();
        }
    }

    /**
     * 根据eid查询部门
     *
     * @param eid 员工id
     */
    public void queryDeptByEid(Integer eid) {
        System.out.println("操作人>>>" + lastName);
        System.out.println("部门列表如下>>>");
        List<Dept> depts = deptService.queryDeptByEid(eid);
        if (depts != null) {
            Integer did1 = 0;
            for (Dept dept : depts) {
                if (dept.getId() == 2) {
                    queryAllDept();
                }else if(dept.getId() == 1){
                    System.out.println("部门未分配无法登录,请联系人事部门处理!!!");
                    login();
                } else {
                    System.out.println("序号" + dept.getId() + ":" + dept.getName());
                }
            }
            queryAllEmp();
        }
    }

    /**
     * 查询全部部门
     */
    public void queryAllDept() {
        List<Dept> list = deptService.queryAllDept();
        if (list != null) {
            for (Dept dept : list) {
                System.out.println("序号" + dept.getId() + ":" + dept.getName());
            }
        }
    }

    /**
     * 根据部门查询员工
     */
    public void queryAllEmp() {
        System.out.print("输入部门序号查询该部门下员工简略信息列表,输入q或者Q退出系统,请输入>>>");
        String did1 = sc.next();
        String pattern = "^[0-9]*$";
        if (did1.matches(pattern)) {
            queryAllEmpPage(Integer.parseInt(did1));
        } else {
            if (did1.equalsIgnoreCase("q")) {
                login();
            } else {
                queryAllEmp();
            }
        }
    }

    /**
     * 分页
     * @param did
     */
    public void queryAllEmpPage(Integer did) {
        Integer pageNo = 1;
        Integer pageSize = 5;
        query(did,pageNo,pageSize);
    }
    public void query(Integer did,Integer pageNo,Integer pageSize) {
        PageUtil<Emp> pageUtil = empService.queryAllEmpPage(did, pageNo, pageSize);
        List<Emp> list = pageUtil.getList();
        if (list != null) {
            Integer xu = 1;
            for (Emp emp : list) {
                String gender = "女";
                if (emp.getGender() == 1) {
                    gender = "男";
                }
                System.out.println("序号：" + xu + "\t姓名：" + emp.getLastName() + "\t性别：" + gender + "\t手机号：" + emp.getMobile() + "\t邮箱：" + emp.getMail());
                xu++;
            }
            if (pageUtil.getPageNo() != 1) {
                System.out.print("上一页请输入字母p");
            }
            for (int i = 1; i <= pageUtil.getTotalPageCount(); i++) {
                System.out.print("\t" + i);
                if (i == pageUtil.getPageNo()) {
                    System.out.print("*");
                }
            }
            if (pageUtil.getPageNo() != pageUtil.getTotalPageCount()) {
                System.out.print("\t下一页请输入字母n\t");
            }
            System.out.println("共" + pageUtil.getPageNo() + " | " + pageUtil.getTotalPageCount() + "页\t总记录数  >>> " + pageUtil.getCount());
            System.out.print("输入r返回显示部门列表,输入q或者Q退出系统,请翻页 >>>");
            String a = sc.next();
            if (a.equals("p")){
                query(did,pageNo-1,pageSize);
            }else if(a.equals("n")){
                query(did,pageNo+1,pageSize);
            }else if(a.equals("r")){
                queryDeptByEid(eid);
            }else if(a.equalsIgnoreCase("q")){
                login();
            }else{
                System.out.println("输入错误，重新输入！！！");
                query(did,pageNo,pageSize);
            }
        }
    }
}
