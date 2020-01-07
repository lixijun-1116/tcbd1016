import cn.kgc.dao.BlogMapper;
import cn.kgc.entity.Blog;
import cn.kgc.util.BaseDateUitls;
import cn.kgc.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class BlogTest {
    @Test
    public void selectAllTest(){
        SqlSession sqlSession = null;
        List<Blog> list = null;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            list = sqlSession.getMapper(BlogMapper.class).selectAll();
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (list != null){
            for (Blog blog : list) {
                System.out.println(blog);
            }
        }
    }
    @Test
    public void deleteBlogTest(){
        SqlSession sqlSession = null;
        Integer id = 3;
        Integer count = 0;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            count = sqlSession.getMapper(BlogMapper.class).deleteBlog(id);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(count > 0 ? "删除成功" : "删除失败");
    }
    @Test
    public void insertBlogTest() throws ParseException {
        SqlSession sqlSession = null;
        Blog blog = new Blog();
        blog.setContent("asdfghghjghggf");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String format = df.format(new Date());
        blog.setPublishTime(BaseDateUitls.parse(format,"yyyy-MM-dd"));
        blog.setUserId(2);
        Integer count = 0;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            count = sqlSession.getMapper(BlogMapper.class).insertBlog(blog);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(count > 0 ? "添加成功" : "添加失败");
    } @Test
    public void updateBlogTest() throws ParseException {
        SqlSession sqlSession = null;
        Blog blog = new Blog();
        blog.setId(6);
        blog.setContent("九九九垃圾垃圾");
        blog.setPublishTime(BaseDateUitls.parse("2018-11-14","yyyy-MM-dd"));
        blog.setUserId(1);
        Integer count = 0;
        try {
            sqlSession = MyBatisUtil.creatSqlSession();
            count = sqlSession.getMapper(BlogMapper.class).updateBlog(blog);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(count > 0 ? "修改成功" : "修改失败");
    }
}
