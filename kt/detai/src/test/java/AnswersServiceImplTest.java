import cn.kgc.entity.Answers;
import cn.kgc.service.AnswersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class AnswersServiceImplTest {
    @Autowired
    private AnswersService answersService;
    @Test
    public void test(){
        List<Answers> list = answersService.query(1);
        if(list != null) {
            for (Answers answers : list) {
                System.out.println(answers);
            }
        }
    }
}
