package org.java.prog;

import java.util.Scanner;

public class RevWordsInSent {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	String string = sc.nextLine();
	String[] str = string.split(" ");
	for (int i = str.length-1; i >=0 ; i--) {
		System.out.print(str[i]+ " ");
		
	}
	}
}
