package com.github.ecsoya.knife.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.ecsoya.knife.common.security.annotation.EnableCustomConfig;
import com.github.ecsoya.knife.common.security.annotation.EnableRyFeignClients;
import com.github.ecsoya.knife.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 系统模块
 * 
 * @author AngryRED (angryred@qq.com)
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class KnifeSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(KnifeSystemApplication.class, args);
		System.out.println("Knife - 系统模块启动成功");
	}
}
