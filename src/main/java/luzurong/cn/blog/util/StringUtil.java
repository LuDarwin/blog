package luzurong.cn.blog.util;


import java.util.UUID;

/**
 * @Description:字符串工具类，包含生成32位UUID方法
 * @Author: xiaoXin
 * @Date: 2019/12/10 23:33
 */

public class StringUtil {
    private StringUtil() {
    }

    public static boolean isNullOrEmpty(String str) {
        return null == str || "".equals(str) || "null".equals(str);
    }

    public static boolean isNullOrEmpty(Object obj) {
        return null == obj || "".equals(obj);
    }

    /**
     * 根据用户名和密码进行两次MD5加密
     *

     */
    /**
     * @Description:根据用户名和密码进行两次MD5加密
     * @param pwd  原始密码
     * @param salt 盐
     * @Author: xiaoXin
     * @Date: 2019/12/10 23:33
     *
     */

//    public static String encryptPassword(String pwd, String salt) {
//        return new SimpleHash(SystemConstant.ALGORITHMNAME, pwd, ByteSource.Util.bytes(salt),
//                SystemConstant.HASHITERATIONS).toHex();
//    }

    /**
     * @Description:获取一个32位UUID主键
     * @Author: xiaoXin
     * @Date: 2019/12/10 23:33
     */

    public static String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * @Description: 生成number个主键
     * @Author: xiaoXin
     * @Date: 2019/12/10 23:33
     */
    public static String[] getUUID(int number) {
        if (number < 1) {
            return null;
        }
        String[] ss = new String[number];
        for (int i = 0; i < number; i++) {
            ss[i] = getUUID();
        }
        return ss;
    }
}
