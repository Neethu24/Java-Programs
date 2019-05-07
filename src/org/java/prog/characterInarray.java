package org.java.prog;

import java.util.Arrays;
import java.util.Scanner;

public class characterInarray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String m="",n="",o="",p="";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLowerCase(ch)) {
				m=m+ch;
			} else if (Character.isUpperCase(ch)) {
				n=n+ch;
			} else if (Character.isDigit(ch)) {
				o=o+ch;
			} else {
				p=p+ch;
			}
		}
		System.out.println("LowerCase:");
		char[] lc = m.toCharArray();
			System.out.println(lc);
		System.out.println("UpperCase:");
		char[] uc = n.toCharArray();
			System.out.println(uc);
		System.out.println("Digit:");
		char[] d = o.toCharArray();
			System.out.println(d);
		System.out.println("SpecialChar:");
		char[] sc = p.toCharArray();
			System.out.println(sc);

	}
	
	
}
