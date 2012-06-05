package org.rscnation.msc.ls.auth.impl;

import org.rscnation.msc.ls.auth.Auth;

public class AuthFactory {

	public static Auth create(String className) throws Exception {
		return Class.forName(className).asSubclass(Auth.class)
				.newInstance();
	}

}
