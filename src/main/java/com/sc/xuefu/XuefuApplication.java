package com.sc.xuefu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class XuefuApplication {

    public static void main(String[] args) {
        SpringApplication.run(XuefuApplication.class, args);
    }

}
