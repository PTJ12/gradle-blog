package cn.ut;

import cn.ut.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author PuTongjiao
 * @date 2022/8/20 0:45
 */
@SpringBootTest
public class TestFrontApplication {

    @Resource
    private TestService testService;

    @Test
    void test() {
        System.out.println(testService.test());
    }
}
