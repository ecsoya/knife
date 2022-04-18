package com.github.ecsoya.knife.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.ecsoya.knife.common.security.annotation.EnableCustomConfig;
import com.github.ecsoya.knife.common.security.annotation.EnableRyFeignClients;
import com.github.ecsoya.knife.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 定时任务
 * 
 * @author AngryRED (angryred@qq.com)
 */
@EnableCustomConfig
@EnableCustomSwagger2   
@EnableRyFeignClients
@SpringBootApplication
public class KnifeJobApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(KnifeJobApplication.class, args);
        System.out.println("Knife - 定时任务模块启动成功");
    }
}
