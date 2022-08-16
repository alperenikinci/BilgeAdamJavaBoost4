package week01.lecture02;

public class HelloWorld {
	//Execution time is experimented in this drill.
	public static void main(String[] args) 
	{
		long startTime = System.nanoTime();
		System.out.println("Hello, World");
		long endTime = System.nanoTime();
		long timeElapsed = endTime - startTime;
		
		System.out.println("Execution time in nanoseconds: " + timeElapsed);
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
	}
}		