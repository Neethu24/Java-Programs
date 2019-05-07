package org.java.prog;

public class Ascii {
public static void main(String[] args) {
	String s="NiVethaa";
	for (int i = 0; i < s.length(); i++) {
		char c=s.charAt(i);
		if(c>=65 && c<=90) {
			c=(char) (c+32);
		}else if(c>=97 && c<=122) {
			c=(char) (c-32);
		}else {
			c=c;
		}
		System.out.println(c);
	}
}
}
