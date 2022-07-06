package com.zhdoyu.demo;
import com.zhdoyu.demo.util.PortUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Application {
    static {
        PortUtil.checkPort(6379,"Redis服务端",true);
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);    
    }
}