package com.buka.entity;

import java.io.Serializable;

/**
 * 搜索时候分类实体
 */
public class CateEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Integer id;
	public String name;
	public String img_url;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg_url() {
		return img_url;
	}

	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}

}