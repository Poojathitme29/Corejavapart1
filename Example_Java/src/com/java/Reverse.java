package com.java;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int m, n, sum = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number:");
	        m = sc.nextInt();
	        while(m > 0)
	        {
	            n = m % 10;
	            sum = sum * 10 + n;
	            m = m / 10;
	        }
	        System.out.println("Reverse:"+sum);
	}

}
