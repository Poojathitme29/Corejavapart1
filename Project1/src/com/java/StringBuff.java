package com.java;

public class StringBuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sc=new StringBuffer("java");
		System.out.println("capacity           :" +sc.capacity());
		System.out.println("append       :" +sc.append("Angular"));
		System.out.println("reverse    :" +sc.reverse());
		System.out.println("replce    :" +sc.replace(2,5,"c++"));
		System.out.println("insert    :" +sc.insert(2,"dbms"));
		System.out.println("delete     :" +sc.delete(2,4));
		
		sc.ensureCapacity(20);
		System.out.println("ensuecapacity:" +sc.capacity());
	
		
		
		
		StringBuffer sb=new StringBuffer();  
        System.out.println(sb.capacity());  
        sb.append("DataFlair");  
        System.out.println(sb.capacity());
        sb.append("DataFlair is company that teaches programming!!!");  
        System.out.println(sb.capacity()); 
        sb.ensureCapacity(150);
        System.out.println(sb.capacity());  
        sb.ensureCapacity(505);
        System.out.println(sb.capacity());

	}

}
