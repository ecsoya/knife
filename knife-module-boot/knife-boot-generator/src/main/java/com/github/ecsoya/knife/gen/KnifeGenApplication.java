package com.github.ecsoya.knife.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.ecsoya.knife.common.security.annotation.EnableCustomConfig;
import com.github.ecsoya.knife.common.security.annotation.EnableRyFeignClients;
import com.github.ecsoya.knife.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 代码生成
 * 
 * @author AngryRED (angryred@qq.com)
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class KnifeGenApplication {
	public static void main(String[] args) {
		SpringApplication.run(KnifeGenApplication.class, args);
		System.out.println("Knife - 代码生成模块启动成功");
	}
}
