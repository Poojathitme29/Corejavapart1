package com.java;
import java.util.Scanner;
public class PoNeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number you want to check:");
	        n = sc.nextInt();
	       
	        if(n > 0)
	        {
	            System.out.println(n+" is positive number");
	        }
	        else if(n < 0)
	        {
	            System.out.println(n+" is negative number");
	        }
	        else
	        {
	            System.out.println(n+" is neither positive nor negative");
	        }
	}

}
