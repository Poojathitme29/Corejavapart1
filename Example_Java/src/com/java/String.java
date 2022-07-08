package com.java;

public class String {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			 java.lang.String text = "Java is a fun programming language";

			    // split string from space
			    java.lang.String[] result = text.split(" ");


			    System.out.print("result = ");
			    for (java.lang.String str : result) {
			      System.out.print(str + ", ");
			    }
	}

}
