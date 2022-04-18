package com.github.ecsoya.knife.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.github.ecsoya.knife.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 文件服务
 * 
 * @author AngryRED (angryred@qq.com)
 */
@EnableCustomSwagger2
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class KnifeFileApplication {
	public static void main(String[] args) {
		SpringApplication.run(KnifeFileApplication.class, args);
		System.out.println("Knife - 文件服务模块启动成功");
	}
}
