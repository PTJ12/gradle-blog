package cn.ut.controller;

import cn.ut.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author PuTongjiao
 * @date 2022/8/20 0:36
 */
@RestController
public class TestController {

    @Resource
    private TestService testService;

    @GetMapping("test")
    public String test() {
        return testService.test();
    }
}
