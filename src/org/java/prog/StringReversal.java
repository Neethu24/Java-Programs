package org.java.prog;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		String[] str= s.split(" ");
		for (int i = 0; i < str.length; i++) {
		char[] char1= str[i].toCharArray();
		for (int j = char1.length-1; j >= 0; j--) {
			System.out.print(char1[j]);
		}
		System.out.print(" ");
		}

	}

}
