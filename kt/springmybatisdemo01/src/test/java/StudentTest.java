import cn.kgc.entity.Student;
import cn.kgc.service.StudentService;
import cn.kgc.util.PageUtil;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class StudentTest {
    @Test
    public void queryAllPage(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = context.getBean("studentService",StudentService.class);
        Integer pageNo = 4;
        Integer pageSize = 5;

        PageUtil<Student> pageUtil = studentService.queryAllPage(pageNo,pageSize);
        System.out.println("当前第" + pageUtil.getPageNo() + "页");
        System.out.println("共" + pageUtil.getTotalPageCount() + "页");
        List<Student> list = pageUtil.getList();
        if (list !=null){
            for (Student student : list) {
                System.out.println(student);
            }
        }

    }
}
