import cn.kgc.entity.Student;
import cn.kgc.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class StudentServiceImplTest {
    @Autowired
    private StudentService studentService;
    @Test
    public void queryByGradeName(){
        String gradeName = "";
        List<Student> list = studentService.queryByGradeName(gradeName);
        if (list != null){
            for (Student student : list) {
                System.out.println("姓名：" + student.getStudentName() + "，班级：" + student.getGrade().getGradeName());
            }
        }
    }
}
