package com.qa.testing;


public class House {

	public static void main (String[] args) {
		protected String address;
		protected Door frontDoor;
		protected List<Window> propertyWindows;
		protected Garage attachedGarage;
	
		public House() {
			super();
		}
	
			public House(String address, Door frontDoor, List<Window> propertyWindows, Garage attachedGarage) {
			this();
			this.address = address;
			this.frontDoor = frontDoor;
			this.propertyWindows = propertyWindows;
			this.address = address;
			this.attachedGarage = attachedGarage;
			
		
	}
	
			
			public boolean openFrontDoor() {
				return this.frontDoor.openDoor();
			}
			
			public boolean closeFrontDoor() {
				return this.frontDoor.closeDoor();
	}
			
}

	

