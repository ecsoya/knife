package com.github.ecsoya.knife.common.core.exception.user;

import com.github.ecsoya.knife.common.core.exception.base.BaseException;

/**
 * 用户信息异常类
 * 
 * @author AngryRED (angryred@qq.com)
 */
public class UserException extends BaseException {
	private static final long serialVersionUID = 1L;

	public UserException(String code, Object[] args) {
		super("user", code, args, null);
	}
}
