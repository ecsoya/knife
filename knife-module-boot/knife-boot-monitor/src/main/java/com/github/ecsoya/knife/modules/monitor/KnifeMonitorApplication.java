package com.github.ecsoya.knife.modules.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * 监控中心
 * 
 * @author AngryRED (angryred@qq.com)
 */
@EnableAdminServer
@SpringBootApplication
public class KnifeMonitorApplication {
	public static void main(String[] args) {
		SpringApplication.run(KnifeMonitorApplication.class, args);
		System.out.println("Knife - 监控中心启动成功");
	}
}
