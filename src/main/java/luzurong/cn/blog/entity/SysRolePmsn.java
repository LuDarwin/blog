package luzurong.cn.blog.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: xiaoXin
 * @Date: 2019/12/10 22:41
 */
@Getter
@Setter
public class SysRolePmsn extends BaseDomain {
    private String rpId;

    private String roleId;

    private String pmsnId;

    /**
     * 角色权限映射可用性，E为可用，I为不可用
     */
    private String status = "E";
}