package com.github.ecsoya.knife.common.security.config;

import java.util.TimeZone;

import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * 系统配置
 *
 * @author AngryRED (angryred@qq.com)
 */
public class ApplicationConfig {
	/**
	 * 时区配置
	 */
	@Bean
	public Jackson2ObjectMapperBuilderCustomizer jacksonObjectMapperCustomization() {
		return jacksonObjectMapperBuilder -> jacksonObjectMapperBuilder.timeZone(TimeZone.getDefault());
	}
}
