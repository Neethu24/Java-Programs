package org.java.prog;

import java.util.Scanner;

public class Pattern_4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
