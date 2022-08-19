package cn.ut;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.ManagedBean;

/**
 * @author PuTongjiao
 * @date 2022/8/20 0:26
 */
@SpringBootApplication
@MapperScan("cn.ut.mapper")
public class FrontApplication {
    public static void main(String[] args) {
        SpringApplication.run(FrontApplication.class, args);
    }
}
