package com.java;

import java.util.Scanner;

public class Reverse_num {

    public static void reversevaluePrint(int num) {
	int reverse = 0;
	int remainder = 0;
	int num1 = num;
	while (num1 != 0) {
	    remainder = num1 % 10;
	    reverse = reverse * 10 + remainder;
	    num1 = num1 / 10;
	}
	System.out.println(reverse);
    }

    public static void main(String[] args) {
	System.out.println("Enter the number to reverse ");
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt();
	System.out.println("the reverse of given number is");
	reversevaluePrint(num);
	scanner.close();
    }
}

