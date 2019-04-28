package org.java.prog;

import java.util.Scanner;

public class ReverseOfNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int i = sc.nextInt();
		int j,rev=0;
		while(i!=0) {
			j=i%10;
			rev=rev*10+j;
			i=i/10;
		}
		System.out.println(rev);
	}


}
