package com.tinysquare.api.img_server.vo;

import java.io.Serializable;

public class QiNiuVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String token;

	private String urlPrefix;

	public QiNiuVo(String token, String urlPrefix) {
		super();
		this.token = token;
		this.urlPrefix = urlPrefix;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUrlPrefix() {
		return urlPrefix;
	}

	public void setUrlPrefix(String urlPrefix) {
		this.urlPrefix = urlPrefix;
	}

}
