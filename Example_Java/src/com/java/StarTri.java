package com.java;

import java.util.Scanner;

public class StarTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the print");
		 n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=1;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{ 
				System.out.print( " * " );
			}
			System.out.println();
		}
	}

}
