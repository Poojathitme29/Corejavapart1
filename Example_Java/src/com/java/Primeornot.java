package com.java;
import java.util.Scanner;
public class Primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to check Prime or Not");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 2, count =0;
        while (i <= number / 2) {
            if (number % i == 0) {
                count++;
                break;
            }
            i++;
        }
        if (count == 0) {
            System.out.println(number + " is prime number");
        }
        else 
        {
            System.out.println(number + " is not a prime number");
        }
	}

}
