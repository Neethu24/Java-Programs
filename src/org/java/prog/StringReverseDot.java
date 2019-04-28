package org.java.prog;

import java.util.Scanner;

public class StringReverseDot {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	String string = sc.nextLine();
	char[] str=string.toCharArray();
	char[] rev= new char[str.length];
	for (int i = 0; i < str.length; i++) {
		if(str[i]==' ') {
			rev[i]=' ';
		}
	}
	
	int j=rev.length-1;
	for (int i = 0; i < str.length; i++) {
		if(str[i]!=' ') {
			if(rev[j]==' ') {
				j--;
			}
			rev[j]=str[i];
			j--;
		}
	}
	System.out.println(rev);

	

}
}
	
