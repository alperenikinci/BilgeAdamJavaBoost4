package com.bilgeadam.boost.week03.lecture001;

public class SmartPhone 
{
	private String brand;
	private int cameraMp;
	private int batteryCapacity;
	private double screenSize;
	
	
	public SmartPhone() {
		super();
	}
	
	public SmartPhone(String brand, int cameraMp, int batteryCapacity, double screenSize) {
		super();
		this.brand = brand;
		this.cameraMp = cameraMp;
		this.batteryCapacity = batteryCapacity;
		this.screenSize = screenSize;
	}

	void connectWeb() 
	{
		System.out.println(brand + " has connected to internet.");
	}
	void showFeatures() 
	{
		System.out.println("SmartPhone [brand=" + brand + ", cameraMp=" + cameraMp + ", batteryCapacity=" + batteryCapacity
				+ ", screenSize=" + screenSize + "]");
	}
	void remainingBattery() 
	{
		System.out.println(brand + " has "+batteryCapacity+"%"+ " battery left.");
	}
	void takePicture() 
	{
		System.out.println(brand + " has taken a picture with the quality of: "+cameraMp+ " Megapixels.");
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCameraMp() {
		return cameraMp;
	}
	public void setCameraMp(int cameraMp) {
		this.cameraMp = cameraMp;
	}
	public int getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
}
