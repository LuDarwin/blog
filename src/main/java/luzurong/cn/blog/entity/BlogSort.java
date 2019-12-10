package luzurong.cn.blog.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: xiaoXin
 * @Date: 2019/12/10 22:41
 */
@Getter
@Setter
public class BlogSort extends BaseDomain {
    private String sortId;

    /**
     * 文章分类名称
     */
    private String sortName;

    public BlogSort(String sortId, String sortName) {
        this.sortId = sortId;
        this.sortName = sortName;
    }
}