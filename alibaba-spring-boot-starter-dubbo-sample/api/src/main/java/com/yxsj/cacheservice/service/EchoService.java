package com.yxsj.cacheservice.service;

import com.yxsj.cacheservice.service.params.HelloBodyParams;
import com.yxsj.cacheservice.service.params.HelloRequest;
import com.yxsj.cacheservice.service.params.HelloRet;

/**
 * @author xiaofei.wxf(teaey)
 * @since 0.0.0
 */
public interface EchoService {
    String echo(String str);

    String test(String request, String params);

    HelloRet test(HelloRequest request, HelloBodyParams params);

}
