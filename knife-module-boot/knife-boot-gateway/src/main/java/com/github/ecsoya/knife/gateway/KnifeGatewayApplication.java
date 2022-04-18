package com.github.ecsoya.knife.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 * 
 * @author AngryRED (angryred@qq.com)
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class KnifeGatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(KnifeGatewayApplication.class, args);
		System.out.println("Knife - 网关启动成功");
	}
}
