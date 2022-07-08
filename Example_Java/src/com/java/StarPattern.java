package com.java;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the print");
		 n=sc.nextInt();
		 for(i=0;i<n;i++)
		 {
			 for(j=0;j<i;j++)
			 {
				 System.out.print("* ");
			 }
			 System.out.println("");
		 }
	}

}
