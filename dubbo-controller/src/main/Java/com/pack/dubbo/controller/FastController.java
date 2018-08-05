package com.pack.dubbo.controller;

import com.pack.dubbo.service.FastInterface;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @author 娃哈哈
 * 前端控制层
 */
@Controller
@RequestMapping("/user")
public class FastController {

    @Resource
    private FastInterface fastInterface;

    @RequestMapping(value = "/fast",method = RequestMethod.POST)
    public void FastController(String name)throws Exception{

       String value =  fastInterface.addQueryClass(name);

        System.out.println("请求获取的参数为："+value);
    }

}
