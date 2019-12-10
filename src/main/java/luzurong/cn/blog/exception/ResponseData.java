package luzurong.cn.blog.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import luzurong.cn.blog.constant.RespCodeEnum;

/**
 * @Description: 统一返回结果
 * @Author: xiaoXin
 * @Date: 2019/12/10 23:33
 */
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseData {
    /**
     * 判断访问是否正常，比如登录成功、正常返回数据等都为true，有错误抛出则为false,前端只需要判断该值即可
     */
    private Boolean status = true;
    /**
     * 错误代码和错误信息，统一放在枚举中
     */
    private String code = RespCodeEnum.OK.getCode();
    private String message;
    private Object data;

    public static ResponseData success() {
        return success(null);
    }

    public static ResponseData error() {
        return error(false, RespCodeEnum.ILLEGAL_PARAMS.getMessage());
    }

    public static ResponseData error(Boolean status, String message) {
        return new ResponseData(status, message);
    }

    public static ResponseData success(Object data) {
        return new ResponseData(data);
    }

    public ResponseData(Object data) {
        super();
        this.data = data;
    }

    public ResponseData(Boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResponseData() {
        super();
    }
}
