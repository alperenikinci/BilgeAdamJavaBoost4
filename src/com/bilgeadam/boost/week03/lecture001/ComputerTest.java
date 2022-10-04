package com.bilgeadam.boost.week03.lecture001;

public class ComputerTest 
{

	public static void main(String[] args) 
	{
		Computer computer = new Computer();
		computer.setBrand("Monster");
		computer.setOperatingSystem("Windows");
		computer.setRamSize(32);
		computer.setSceenSize(13.2);
		computer.setSsdCapacity(512);
		
		computer.showFeatures();
		computer.connectWeb();
		
		Computer computer2 = new Computer("Dell",16,256,12.0,"Linux");
		computer2.showFeatures();
	}
	

}
