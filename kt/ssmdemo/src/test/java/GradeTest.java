import cn.kgc.entity.Grade;
import cn.kgc.service.GradeService;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class GradeTest {
    @Autowired
    private GradeService gradeService;
    @Test
    public void test(){
        String gradeName = "a";
        List<Grade> list = gradeService.queryGradeByGradeName(gradeName);
        if (list != null){
            for (Grade grade : list) {
                System.out.println(grade.getGradeName());
            }
        }
    }

    @Test
    public void test01(){
        String gradeName = "a";
        PageInfo<Grade> pageInfo = gradeService.queryGradeByGradeName1(gradeName,1,2);
        System.out.println("当前：" + pageInfo.getPageNum());
        System.out.println("共：" + pageInfo.getPages() + "页");
        List<Grade> list = pageInfo.getList();
        if (list != null){
            for (Grade grade : list) {
                System.out.println(grade);
            }
        }

    }
    @Test
    public void test02(){
        String gradeName = "";
        String colName = "grade_name";
        PageInfo<Grade> pageInfo = gradeService.queryGradeByGradeNamePaiXu(gradeName,colName,1,5);
        System.out.println("当前：" + pageInfo.getPageNum());
        System.out.println("共：" + pageInfo.getPages() + "页");
        List<Grade> list = pageInfo.getList();
        if (list != null){
            for (Grade grade : list) {
                System.out.println(grade);
            }
        }

    }
}
