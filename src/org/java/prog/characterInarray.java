package org.java.prog;

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
		for (char c : lc) {
			System.out.println(c);
		}
		System.out.println("UpperCase:");
		char[] uc = n.toCharArray();
		for (char c : uc) {
			System.out.println(c);
		}
		System.out.println("Digit:");
		char[] d = o.toCharArray();
		for (char c : d) {
			System.out.println(c);
		}
		System.out.println("SpecialChar:");
		char[] sc = p.toCharArray();
		for (char c : sc) {
			System.out.println(c);
		}

	}
}
