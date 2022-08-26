package com.bilgeadam.boost.week02.lecture003;

public class TryThis {
	
	int variable; //sınıfın içindeki değişken,
	
	//sınıfın metodu
	int method(int variable) 
	{
	//	System.out.println(variable);
		return this.variable;
	}
	
	
	public static void main(String[] args) 
	{
	int variable = 10; //metodun içindeki variable.	
	
	TryThis tryThis = new TryThis();
	//	System.out.println(tryThis.variable);
	
	System.out.println(tryThis.method(variable));
	}

	
}
