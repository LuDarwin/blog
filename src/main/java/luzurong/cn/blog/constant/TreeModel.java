package luzurong.cn.blog.constant;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Description:递归菜单模型
 * @Author: xiaoXin
 * @Date: 2019/12/10 23:33
 */

@Getter
@Setter
public class TreeModel {
    private String text;
    private String id;
    private String pid;
    private List<TreeModel> nodes;
}
