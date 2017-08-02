package com.yxsj.cacheservice.service;

import com.alibaba.boot.dubbo.annotation.EnableDubboConfiguration;
import com.alibaba.dubbo.rpc.RpcException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author xiaofei.wxf(teaey)
 * @since 0.0.0
 */
@SpringBootApplication
@EnableDubboConfiguration
public class Client {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext run = SpringApplication.run(Client.class, args);
        while (true) {
            AbcService bean = run.getBean(AbcService.class);
            if (bean != null && bean.echoService != null) {
                try {
                    System.out.println(bean.echoService.echo("abccc"));
                } catch (RpcException e) {
                    System.out.println("RpcException:"+e.getMessage());
                } catch (Exception e) {
                    System.out.println("Exception:"+e.getClass());
                }
            }

            Thread.sleep(1000);
        }
    }
}
