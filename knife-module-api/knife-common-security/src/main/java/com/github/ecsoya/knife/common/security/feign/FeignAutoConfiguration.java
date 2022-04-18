package com.github.ecsoya.knife.common.security.feign;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.RequestInterceptor;

/**
 * Feign 配置注册
 *
 * @author AngryRED (angryred@qq.com)
 **/
@Configuration
public class FeignAutoConfiguration {
	@Bean
	public RequestInterceptor requestInterceptor() {
		return new FeignRequestInterceptor();
	}
}
