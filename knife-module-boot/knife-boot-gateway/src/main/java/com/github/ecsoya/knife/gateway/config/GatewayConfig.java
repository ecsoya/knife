package com.github.ecsoya.knife.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import com.github.ecsoya.knife.gateway.handler.SentinelFallbackHandler;

/**
 * 网关限流配置
 * 
 * @author AngryRED (angryred@qq.com)
 */
@Configuration
public class GatewayConfig {
	@Bean
	@Order(Ordered.HIGHEST_PRECEDENCE)
	public SentinelFallbackHandler sentinelGatewayExceptionHandler() {
		return new SentinelFallbackHandler();
	}
}