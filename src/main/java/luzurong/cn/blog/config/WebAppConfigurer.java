package luzurong.cn.blog.config;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @Author: xiaoXin
 * @Date: 2019/12/10 23:29
 * @Description: 因为SpringBoot上传文件后不能直接访问文件，要设置资源路径
 */
@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {


    /**
     * thymeleaf布局用
     *
     * @param
     * @return nz.net.ultraq.thymeleaf.LayoutDialect
     * @author dingdongliang
     * @date 2018/8/31 10:03
     */
    @Bean
    public LayoutDialect layoutDialect() {
        return new LayoutDialect();
    }
}
