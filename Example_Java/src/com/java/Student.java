package com.java;

class Std
{
int rno=50;//instance variable
static int batchno=23;

 void m1()
{
	int unipuneno=100;//local variable
	int batchno1;	
	System.out.println(unipuneno);
}
}
public class Student {
	public static void main(String[] args) {
		Std s1=new Std();System.out.println(s1.rno);
		System.out.println(Std.batchno);
		s1.m1();

	}

}

