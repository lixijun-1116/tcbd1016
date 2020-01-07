import cn.kgc.entity.Questions;
import cn.kgc.service.QuestionsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class QuestionsServiceTest {
    @Autowired
    private QuestionsService questionsService;
    @Test
    public void test(){
        List<Questions> list = questionsService.queryAll();
        if (list != null){
            for (Questions questions : list) {
                System.out.println(questions);
            }
        }
    }
    @Test
    public void test01(){
        Questions q = new Questions();
        q.setTitle("什么是mybatis");
        q.setDetailDesc("mybatis的描述");
        Integer count = questionsService.insert(q);
        if (count > 0){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }

    }
}
