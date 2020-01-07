package cn.kgc.dao;

import cn.kgc.entity.Blog;

import java.util.List;

public interface BlogMapper {
    /**
     * 2. 查询所有微博功能
     */
    public List<Blog> selectAll();
    /**
     * 3. 删除指定id的一条博客
     */
    public Integer deleteBlog(Integer id);
    /**
     * 4. 发布一条微博功能
     */
    public Integer insertBlog(Blog blog);
    /**
     * 5. 修改微博内容功能（注意只修改博客内容）
     */
    public Integer updateBlog(Blog blog);
}
