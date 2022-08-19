package cn.ut.service.impl;

import cn.ut.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @author PuTongjiao
 * @date 2022/8/20 0:42
 */
@Service("TestService")
public class TestServiceImpl implements TestService {
    @Override
    public String test() {
        return "test framework";
    }
}
