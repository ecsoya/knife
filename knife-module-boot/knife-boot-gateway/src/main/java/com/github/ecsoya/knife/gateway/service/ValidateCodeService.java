package com.github.ecsoya.knife.gateway.service;

import java.io.IOException;

import com.github.ecsoya.knife.common.core.exception.CaptchaException;
import com.github.ecsoya.knife.common.core.web.domain.AjaxResult;

/**
 * 验证码处理
 *
 * @author AngryRED (angryred@qq.com)
 */
public interface ValidateCodeService {
	/**
	 * 生成验证码
	 */
	public AjaxResult createCaptcha() throws IOException, CaptchaException;

	/**
	 * 校验验证码
	 */
	public void checkCaptcha(String key, String value) throws CaptchaException;
}
