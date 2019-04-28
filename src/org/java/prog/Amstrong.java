package org.java.prog;

import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int i = sc.nextInt();
	int n=i,j,rev=0;
	while(i!=0) {
		j=i%10;
		rev=rev+(j*j*j);
		i=i/10;
		System.out.println(j +" "+ rev);
	}
	if(n==rev) {
		System.out.println("Amstrong Number");
	}else {
		System.out.println("Not Amstrong");
	}
	}
}
