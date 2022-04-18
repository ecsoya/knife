package com.github.ecsoya.knife.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.github.ecsoya.knife.common.security.annotation.EnableRyFeignClients;

/**
 * 认证授权中心
 * 
 * @author AngryRED (angryred@qq.com)
 */
@EnableRyFeignClients
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class KnifeAuthApplication {
	public static void main(String[] args) {
		SpringApplication.run(KnifeAuthApplication.class, args);
		System.out.println("Kinfe - 认证授权中心启动成功");
	}
}
