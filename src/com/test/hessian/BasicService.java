package com.test.hessian;

import com.caucho.hessian.server.HessianServlet;

/**
 *  在这里下载jar包。 http://hessian.caucho.com/#Java
 */	
public class BasicService extends HessianServlet implements Basic {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String hello(String name) {
		return "Hello " + name;
	}

	@Override
	public String say(String msg) {
		return "Say:" + msg;
	}

	@Override
	public int sum(int a, int b) {
		return a + b;
	}

}
