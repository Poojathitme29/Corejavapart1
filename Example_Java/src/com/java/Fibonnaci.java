package com.java;
import java.util.Scanner;
public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int t1 = 0, t2 = 2;
	        System.out.print("Enter the number of terms: ");
	        int n=sc.nextInt();   
	        System.out.println("First " + n + " terms of fibonnaci series: ");
	        
	        for (int i = 2; i <= n; ++i)
	        {
	            System.out.print(t1 + " ");
	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }
	}

}
