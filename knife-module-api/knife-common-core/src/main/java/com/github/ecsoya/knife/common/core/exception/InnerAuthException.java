package com.github.ecsoya.knife.common.core.exception;

/**
 * 内部认证异常
 * 
 * @author AngryRED (angryred@qq.com)
 */
public class InnerAuthException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InnerAuthException(String message) {
		super(message);
	}
}
