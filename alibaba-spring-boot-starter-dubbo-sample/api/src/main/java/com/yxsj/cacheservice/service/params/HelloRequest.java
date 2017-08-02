package com.yxsj.cacheservice.service.params;

/**
 * Created by renminchewei on 2017/6/17.
 */
public class HelloRequest {
    private Long id;
    private String version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
