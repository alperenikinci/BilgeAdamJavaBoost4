package com.bilgeadam.boost.week03.lecture001;

public class SmartPhoneTest {

	public static void main(String[] args) 
	{
		SmartPhone phone = new SmartPhone();
		phone.setBrand("Apple");
		phone.setCameraMp(50);
		phone.setBatteryCapacity(82);
		phone.setScreenSize(6.4);
	
		phone.showFeatures();
		phone.connectWeb();
		phone.takePicture();
		phone.remainingBattery();
		System.out.println();
		
		SmartPhone phone1 = new SmartPhone("Samsung",40,65,6.9);
		phone1.showFeatures();
		phone1.connectWeb();
		phone1.takePicture();
		phone1.remainingBattery();
		
	}

}
