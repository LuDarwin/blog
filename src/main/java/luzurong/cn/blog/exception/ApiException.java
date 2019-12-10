package luzurong.cn.blog.exception;


import luzurong.cn.blog.constant.RespCodeEnum;


/**
 * @Description: RESTFULL API异常类
 * @Author: xiaoXin
 * @Date: 2019/12/10 23:33
 */
public class ApiException extends GlobalException {

    public ApiException(RespCodeEnum respCodeEnum) {
        super(respCodeEnum.getMessage(), respCodeEnum.getCode());
    }
}
