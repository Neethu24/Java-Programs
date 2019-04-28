package org.java.prog;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Overloading {
	private void name(String str) {
		System.out.println(str);
	}
	private void name(String fn, String ln) {
		System.out.println(fn+" "+ln);
	}
	private void name(String fn, String mn, String ln) {
		System.out.println(fn+" "+mn+" "+ln);
	}
	private String name() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		return str;
	}
	private void name(String str,int n) {
		System.out.println(str+" Roll No : "+n);
	}
	public static void main(String[] args) {
		Overloading ol = new Overloading();
		System.out.println(ol.name());
		ol.name("Nivethaa");
		ol.name("Nivethaa", "Srinivasan");
		ol.name("Nivethaa", "K", "Srinivasan");
		ol.name("Nivethaa", 10);
	}
}
