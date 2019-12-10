package luzurong.cn.blog.service;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Author: xiaoXin
 * @Date: 2019/12/10 22:59
 */
public interface BaseService<T> {


    T selectOne(T t);

    /**
     * 根据id查询实体
     */
    T selectByPrimaryKey(String id);

    /**
     * 查询所有
     */
    List<T> selectAll();

    /**
     * 全部分页
     */
    PageInfo<T> selectPageByAll(int page, int rows);

    /**
     * 插入
     */
    int insert(T t);

    /**
     * 新增非空字段
     */
    int insertSelective(T t);

    /**
     * 根据主键更新
     */
    int updateByPrimaryKey(T t);

    /**
     * 根据主键更新非空字段
     */
    int updateByPrimaryKeySelective(T t);

    /**
     * 根据主键删除
     */
    int deleteByPrimaryKey(String id);
}
