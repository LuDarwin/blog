package luzurong.cn.blog.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: xiaoXin
 * @Date: 2019/12/10 22:41
 */
@Getter
@Setter
public class SysRole extends BaseDomain {
    private String roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色代码
     */
    private String roleCode;

    /**
     * 是否可用，E为可用，I为不可用
     */
    private String status = "E";

    /**
     * 是否默认，Y为默认角色，N为非默认角色
     */
    private String isDefault = "N";

}