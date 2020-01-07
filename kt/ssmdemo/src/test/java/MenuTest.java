import cn.kgc.entity.Menu;
import cn.kgc.service.MenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MenuTest {
    @Autowired
    private MenuService menuService;
    @Test
    public void test(){
        List<Menu> list = menuService.queryAllMenuName(1);
        if (list != null) {
            for (Menu menu : list) {
                System.out.println(menu);
            }
        }
    }
}
