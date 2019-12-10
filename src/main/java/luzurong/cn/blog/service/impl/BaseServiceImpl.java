package luzurong.cn.blog.service.impl;

import com.github.pagehelper.PageInfo;
import luzurong.cn.blog.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Author: xiaoXin
 * @Date: 2019/12/10 23:03
 */
public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    private Mapper<T> baseMapper;

    @Override
    public T selectOne(T t) {
        return baseMapper.selectOne(t);
    }

    @Override
    public T selectByPrimaryKey(String id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<T> selectAll() {
        return baseMapper.selectAll();
    }

    @Override
    public PageInfo<T> selectPageByAll(int page, int rows) {
        return null;
    }

    @Override
    public int insert(T t) {
        return baseMapper.insert(t);
    }

    @Override
    public int insertSelective(T t) {
        return baseMapper.insertSelective(t);
    }

    @Override
    public int updateByPrimaryKey(T t) {
        return baseMapper.updateByPrimaryKey(t);
    }

    @Override
    public int updateByPrimaryKeySelective(T t) {
        return baseMapper.updateByPrimaryKeySelective(t);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return baseMapper.deleteByPrimaryKey(id);
    }
}
