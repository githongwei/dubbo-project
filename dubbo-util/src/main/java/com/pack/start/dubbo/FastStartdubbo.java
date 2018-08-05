package com.pack.start.dubbo;


import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 娃哈哈
 * 启动dubbo服务
 */
public class FastStartdubbo {

    private static Logger logger = Logger.getLogger(FastStartdubbo.class);

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"dubbo-start-provide.xml"});

        context.start();

        logger.info("dubbo服务启动成功！");

        System.out.print("dubbo服务启动成功！");

    }
}
