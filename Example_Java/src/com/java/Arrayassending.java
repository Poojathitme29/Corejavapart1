package com.java;
import java.util.Scanner;
public class Arrayassending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						 {
						        int i,j,n, temp;
						        Scanner sc = new Scanner(System.in);
						        System.out.print("Enter no. of elements you want in array:");
						        n = sc.nextInt();
						        int a[] = new int[n];
						        System.out.println("Enter all the elements:");
						        for ( i = 0; i < n; i++) 
						        {
						            a[i] = sc.nextInt();
						        }
						        for ( i = 0; i < n; i++) 
						        {
						            for ( j = i + 1; j < n; j++) 
						            {
						                if (a[i] > a[j]) 
						                {
						                    temp = a[i];
						                    a[i] = a[j];
						                    a[j] = temp;
						                }
						            }
						        }
						        System.out.print("Ascending Order:");
						        for ( i = 0; i < n - 1; i++) 
						        {
						            System.out.print(a[i] + ",");
						        }
						        System.out.print(a[n - 1]);
					}

	}
}
