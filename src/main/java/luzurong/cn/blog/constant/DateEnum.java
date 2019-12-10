package luzurong.cn.blog.constant;

import lombok.Getter;
import org.apache.commons.lang3.builder.ToStringBuilder;


/**
 * @Description:
 * @Author: xiaoXin
 * @Date: 2019/12/10 23:33
 */

@Getter
public enum DateEnum {
    //日期格式枚举
    DATE_TIME("yyyy-MM-dd HH:mm:ss"), DATE("yyyy-MM-dd"), TIME("HH:mm:ss");

    private String pattern;

    DateEnum(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
