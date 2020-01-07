import cn.kgc.entity.Grade;
import cn.kgc.service.GradeService;
import cn.kgc.service.GradeService1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GradeTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-Grade.xml");
        GradeService gradeService = (GradeService)context.getBean("gradeService");
        Grade grade = (Grade) context.getBean("grade");
        gradeService.save(grade);
    }
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-Grade.xml");
        GradeService1 gradeService1 = (GradeService1)context.getBean("gradeService1");
        Grade grade = (Grade) context.getBean("grade");
        gradeService1.save(grade);
    }
}
