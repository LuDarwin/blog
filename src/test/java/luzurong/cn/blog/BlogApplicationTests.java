package luzurong.cn.blog;

import luzurong.cn.blog.entity.SysUser;
import luzurong.cn.blog.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogApplicationTests {

    @Autowired
    private SysUserService sysUserService;

    @Test
    public void contextLoads() {
        List<SysUser> sysUsers = sysUserService.selectAll();
        System.out.println(sysUsers);
    }

}
