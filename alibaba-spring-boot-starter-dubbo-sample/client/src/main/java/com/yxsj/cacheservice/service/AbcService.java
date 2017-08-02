package com.yxsj.cacheservice.service;


import com.alibaba.boot.dubbo.annotation.DubboConsumer;
import org.springframework.stereotype.Component;

/**
 * @author xiaofei.wxf(teaey)
 * @since 0.0.0
 */
@Component
public class AbcService {
    @DubboConsumer(check = false, lazy = true)
    public EchoService echoService;
}
