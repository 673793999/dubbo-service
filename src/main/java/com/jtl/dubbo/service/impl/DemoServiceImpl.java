package com.jtl.dubbo.service.impl;

import com.jtl.dubbo.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/11/17 0017.
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {
    public String demoFun() {
        System.out.println("dubbo hello");
        return "dubbo server success";
    }
}
