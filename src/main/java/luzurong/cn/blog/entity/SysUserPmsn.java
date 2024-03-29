package luzurong.cn.blog.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: xiaoXin
 * @Date: 2019/12/10 22:41
 */
@Getter
@Setter
public class SysUserPmsn extends BaseDomain {
    private String upmId;

    private String userId;

    private String pmsnId;
    /**
     * 是否有效，E有效，I无效
     */
    private String status = "E";


}