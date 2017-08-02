package com.yxsj.cacheservice.service;
//
import com.alibaba.dubbo.config.annotation.Service;
import com.yxsj.cacheservice.service.params.HelloRequest;
import com.yxsj.cacheservice.service.params.HelloBodyParams;
import com.yxsj.cacheservice.service.params.HelloRet;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

/**
 * @author xiaofei.wxf(teaey)
 * @since 0.0.0
 */
//@Service(version = "1.0.0")
@Component
@Service(interfaceClass = EchoService.class)
public class EchoServerImpl implements EchoService {

    public String echo(String str) {
        System.out.println(str);
        return str;
    }

    public String test(String request, String params) {
        return request+":"+params;
    }

    public HelloRet test(HelloRequest request, HelloBodyParams params) {
        HelloRet ret = new HelloRet();
        ret.setMsg(JSONObject.toJSONString(request)+JSONObject.toJSONString(params));
        return ret;
    }
}
