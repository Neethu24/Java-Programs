package org.java.prog;

import java.util.Scanner;

public class CaseChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		String res="";
		for (int j = 0; j < str.length(); j++) {
			char res1 = str.charAt(j);
			if(Character.isUpperCase(res1)) {
				res=res.concat(Character.toLowerCase(res1)+"");
			}else {
				res=res.concat(Character.toUpperCase(res1)+"");
			}
		}
		System.out.println(res);

	}

}
