package com.yxsj.cacheservice.service;

import com.alibaba.boot.dubbo.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.HashSet;
import java.util.Set;

/**
 * @author xiaofei.wxf(teaey)
 * @since 0.0.0
 */
@SpringBootApplication
@EnableDubboConfiguration
public class Server {
    private static final String CATALINA_BASE_KEY = "catalina.base";
    private static final String APPLICATION_CONTEXT_SETTING_FILE_NAME = "classpath:applicationContext.xml";

    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);
    }
//
//        try {
////            String classPath = Server.class.getClassLoader().getResource("").getPath();
////            if (System.getProperty(CATALINA_BASE_KEY) == null) {
////                System.setProperty(CATALINA_BASE_KEY, classPath);
////            }
//
////            SpringApplication appliction = new SpringApplication(Server.class);
////            Set<Object> set = new HashSet<Object>();
////            set.add(APPLICATION_CONTEXT_SETTING_FILE_NAME);
////            appliction.setSources(set);
////
////            appliction.run(args);
//            SpringApplication.run(Server.class, args);
//        }
//        catch (Exception ex) {
//            ex.printStackTrace();
//            System.out.print("exception (" + ex.getMessage() + ")");
//        }
////        SpringApplication.run(Server.class, args);
//    }
}
