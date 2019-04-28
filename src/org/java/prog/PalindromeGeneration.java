package org.java.prog;

import java.util.Scanner;

public class PalindromeGeneration {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int num = sc.nextInt();
	for (int i = 1; i < num; i++) {
		int n=i,pal=i,j,rev=0;
		while(n!=0) {
			j=n%10;
			rev=rev*10+j;
			n=n/10;
		}
		if(rev==pal) {
			System.out.println(rev);
		}
	}
}
}
