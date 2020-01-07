package cn.kgc;

import cn.kgc.entity.Grade;
import cn.kgc.service.GradeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private GradeService gradeService;
    @Test
    public void contextLoads() {
        List<Grade> list = gradeService.queryAll();
        if (list != null){
            for (Grade grade : list) {
                System.out.println(grade);
            }
        }

    }

}
