package com.qa.testing;

public class Door {

		protected boolean isOpen;
		
	public Door() {
		super();
		isOpen = false;
	}
	
	public Door(boolean isOpen) {
		this();
		this.isOpen = isOpen;
	}
}
