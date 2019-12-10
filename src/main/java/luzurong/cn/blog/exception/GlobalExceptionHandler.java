package luzurong.cn.blog.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


/**
 * @Description:
 * @Author: xiaoXin
 * @Date: 2019/12/10 23:33
 */
@ControllerAdvice(annotations = RestController.class)
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value = GlobalException.class)
    @ResponseBody
    public ResponseData jsonErrorHandler(HttpServletRequest req, GlobalException e) throws Exception {
        ResponseData responseData = new ResponseData();
        responseData.setMessage(e.getMessage());
        responseData.setCode(e.getCode());
        responseData.setData(null);
        responseData.setStatus(false);
        return responseData;
    }
}
