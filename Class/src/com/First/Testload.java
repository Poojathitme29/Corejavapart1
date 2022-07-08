package com.First;

class addition
{
	void add(int a,int b)
	{
		System.out.println(a+b);
		System.out.println("1st method with 2 para");
	}
	void add(int a,int b ,int c)
	{
		System.out.println(a+b+c);
		System.out.println("2nd method with 3 para");
	}

}
public class Testload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition a1=new addition();
	a1.add(10, 29);
		a1.add(10, 28, 360);
	}

}

