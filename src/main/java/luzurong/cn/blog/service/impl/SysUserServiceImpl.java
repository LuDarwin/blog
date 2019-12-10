package luzurong.cn.blog.service.impl;

import lombok.extern.slf4j.Slf4j;
import luzurong.cn.blog.dao.SysUserMapper;
import luzurong.cn.blog.entity.SysUser;
import luzurong.cn.blog.service.SysUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author: xiaoXin
 * @Date: 2019/12/10 23:10
 * 用户操作类，包含用户的CURD和用户的角色分配等
 */
@Transactional(rollbackFor = Exception.class)
@Service
@Slf4j
public class SysUserServiceImpl extends BaseServiceImpl<SysUser> implements SysUserService {



}
