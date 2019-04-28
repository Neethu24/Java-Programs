package org.java.prog;

import java.util.Scanner;

public class SumOfDigit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num = sc.nextInt();
	int j,rev=0;
	while(num!=0) {
		j=num%10;
		rev=rev+j;
		num=num/10;
	}
	System.out.println(rev);
}
}
