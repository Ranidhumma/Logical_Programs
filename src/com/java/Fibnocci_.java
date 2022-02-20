package com.java;

import java.util.Scanner;

public class Fibnocci_ {

	public static void fibonacci()
	{    
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the range");
		int range = scanner.nextInt();
		System.out.println("the fibonacci series with in range are");
		 int n1=0,n2=1,n3; int i;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2; i<range; ++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		  
	scanner.close();
	}
	public static void main(String[] args) {
     System.out.println("Welcome");
     fibonacci();
     
   
	}

}