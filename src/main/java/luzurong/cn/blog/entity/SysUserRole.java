package luzurong.cn.blog.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: xiaoXin
 * @Date: 2019/12/10 22:41
 */
@Getter
@Setter
public class SysUserRole extends BaseDomain {
    private String urId;

    private String roleId;

    private String userId;

    /**
     * 是否有效，E有效，I无效
     */
    private String status = "E";

}