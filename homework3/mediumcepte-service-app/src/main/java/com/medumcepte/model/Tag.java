package com.medumcepte.model;

public class Tag {
	
	private String name;

	public Tag() {
		super();
	}

	public Tag(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tag [name=" + name + "]";
	}
	
	

}
