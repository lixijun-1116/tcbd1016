import cn.kgc.entity.Student;
import cn.kgc.service.StudentService;
import cn.kgc.service.StudentService1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = (StudentService) context.getBean("studentService");
        Student student = (Student)context.getBean("student");
        studentService.save(student);
    }
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService1 studentService = (StudentService1) context.getBean("studentService1");
        Student student = (Student)context.getBean("student");
        studentService.save(student);
    }
}
