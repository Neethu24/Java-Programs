package org.java.prog;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int i = sc.nextInt();
		int n=i,j,rev=0;
		while(i!=0) {
			j=i%10;
			rev=rev*10+j;
			i=i/10;
		}
		if(n==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		
	}


}
