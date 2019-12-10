package luzurong.cn.blog.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * @Author: xiaoXin
 * @Date: 2019/12/10 22:41
 */
@Getter
@Setter
public class SysUser extends BaseDomain {
    private String userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 登录帐号
     */
    private String account;

    /**
     * 密码，默认6个1
     */
    private String userPwd;


    private String phone;

    /**
     * 是否有效，E有效，I无效
     */
    private String status = "E";

    private Set<String> menuList;

    private Set<String> pmsnList;
}