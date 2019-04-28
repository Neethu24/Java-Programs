package org.java.prog;

import java.util.Scanner;

public class SwapThreeTemp {
public static void main(String[] args) {
	int temp,a,b,c;
	Scanner sc = new Scanner(System.in);
	 a=sc.nextInt();
	 b=sc.nextInt();
	 c=sc.nextInt();
	 temp=a;
	 a=b;
	 b=c;
	 c=temp;
	 System.out.println("****"+a+"*****"+b+"****"+c);
}
}
