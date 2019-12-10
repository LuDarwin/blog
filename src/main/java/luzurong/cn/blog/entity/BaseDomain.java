package luzurong.cn.blog.entity;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Date;


/**
 *@Description: 实体类基类，重写toString()方法，实现序列化接口， 否则Spring将对象存入Redis时会报错
 * @Author: xiaoXin
 * @Date: 2019/12/10 22:37
 */
@Getter
@Setter
public class BaseDomain implements Serializable {

    /**
     * 创造日期
     */
    protected Date created = new Date();
    /**
     * 修改日期
     */
    protected Date lastmod = new Date();
    /**
     * 创建人
     */
    protected String creater;
    /**
     * 修改人
     */
    protected String modifyer;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    /**
     * @Author: xiaoXin
     * @Date: 2019/12/10 22:38
     * 数据库记录字段赋值，新添加记录时调用
     *
     */
    public static void createLog(BaseDomain domain) {
        createLog(domain, true);
    }

    /**
     * @Author: xiaoXin
     * @Date: 2019/12/10 22:38
     * 数据库记录字段赋值，修改记录时调用
     */
    public static void updateLog(BaseDomain domain) {
        createLog(domain, false);
    }

    /**
     * @Author: xiaoXin
     * @Date: 2019/12/10 22:38
     * 数据库记录字段赋值，统一处理方法,TODO 这里包含测试数据userId，需要更改
     *
     * @param domain 子类对象
     * @param flag   true为新数据，false为修改数据
     */
    private static void createLog(BaseDomain domain, boolean flag) {

//        Session session = SecurityUtils.getSubject().getSession();
//        SysUser sysUser = (SysUser) session.getAttribute(SystemConstant.SESSION_USER_INFO);
//        String userId;
//        if (sysUser == null) {
//            userId = SystemConstant.TEST_USER_ID;
//        } else {
//            userId = sysUser.getUserId();
//        }
//
//        if (flag) {
//            domain.setCreated(new Date());
//            domain.setLastmod(new Date());
//            domain.setCreater(userId);
//            domain.setModifyer(userId);
//        } else {
//            domain.setLastmod(new Date());
//            domain.setModifyer(userId);
//        }

    }
}

