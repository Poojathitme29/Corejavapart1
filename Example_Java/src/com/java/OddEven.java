package com.java;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number you want to check:");
	        n = sc.nextInt();
	        if(n % 2 == 0)
	        {
	            System.out.println("The given number "+n+" is Even ");
	        }
	        else
	        {
	            System.out.println("The given number "+n+" is Odd ");
		}
	}

}
