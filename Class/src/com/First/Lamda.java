package com.First;



interface Student{
	String info();
}
public class Lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=()->{return "pooja";   };
		System.out.println(s.info());
	}

}
