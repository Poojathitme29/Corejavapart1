package com.java;
import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,col,i,j;
		int arr[][]=new int[10][10];
		int arr1[][]=new int[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row element");
		row=sc.nextInt();
		System.out.println("Enter the col element");
		col=sc.nextInt();
		System.out.println("Enter"+(row+col)+"Array Elements:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("The array is :");
		{
			for(i=0;i<row;i++)
			{
				for(j=0;j<col;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
		}

	}
