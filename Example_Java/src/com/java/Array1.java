package com.java;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the array element");
		 int num[]=new int[10];
		 for(int i=0;i<num.length;i++)
		 {
			 num[i]=sc.nextInt();
		 }
		System.out.println("element of array are");
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
	}

}
