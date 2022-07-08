package com.java;

import java.util.Scanner;

public class OnePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n,count=1;
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the print");
		 n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(count +" ");
				count++;
			}
			
			System.out.println();
		}
	}

}
