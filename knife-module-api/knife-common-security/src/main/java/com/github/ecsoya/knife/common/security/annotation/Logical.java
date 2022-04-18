package com.github.ecsoya.knife.common.security.annotation;

/**
 * 权限注解的验证模式
 * 
 * @author AngryRED (angryred@qq.com)
 *
 */
public enum Logical {
	/**
	 * 必须具有所有的元素
	 */
	AND,

	/**
	 * 只需具有其中一个元素
	 */
	OR
}
