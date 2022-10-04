package com.bilgeadam.boost.week03.lecture001;

public class Computer 
{
	private String brand;
	private int ramSize;
	private int ssdCapacity;
	private double sceenSize;
	private String operatingSystem;
	
	public Computer() {
		super();
	}
	
	public Computer(String brand, int ramSize, int ssdCapacity, double sceenSize, String operatingSystem) {
		super();
		this.brand = brand;
		this.ramSize = ramSize;
		this.ssdCapacity = ssdCapacity;
		this.sceenSize = sceenSize;
		this.operatingSystem = operatingSystem;
	}

	void connectWeb()
	{
		System.out.println(brand + " connected to web.");
	}
	
	void showFeatures()
	{
		System.out.println("Computer [brand=" + brand + ", ramSize=" + ramSize + ", ssdCapacity=" + ssdCapacity + ", sceenSize="
				+ sceenSize + ", operatingSystem=" + operatingSystem + "]");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public int getSsdCapacity() {
		return ssdCapacity;
	}

	public void setSsdCapacity(int ssdCapacity) {
		this.ssdCapacity = ssdCapacity;
	}

	public double getSceenSize() {
		return sceenSize;
	}

	public void setSceenSize(double sceenSize) {
		this.sceenSize = sceenSize;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
}

