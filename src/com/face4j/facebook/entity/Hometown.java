package com.face4j.facebook.entity;

import java.io.Serializable;

public class Hometown implements Serializable {

	private static final long serialVersionUID = 140766500508933899L;
	
	private String id;
	
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
