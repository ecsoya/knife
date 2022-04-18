package com.github.ecsoya.knife.common.core.exception.file;

import com.github.ecsoya.knife.common.core.exception.base.BaseException;

/**
 * 文件信息异常类
 * 
 * @author AngryRED (angryred@qq.com)
 */
public class FileException extends BaseException {
	private static final long serialVersionUID = 1L;

	public FileException(String code, Object[] args) {
		super("file", code, args, null);
	}

}
