package org.java.prog;

import java.util.Scanner;

public class arrayArranging01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of value: ");
		int n = sc.nextInt(), cnt=0;
		int[] a= new int[n];
		System.out.println("Array numbers : ");
		for (int i = 0; i < n; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0) {
				cnt++;
			}
		}
		for (int i = 0; i < cnt; i++) {
			a[i]=0;
		}
		for (int i = cnt; i < a.length; i++) {
			a[i]=1;
		}
		for (int i : a) {
			System.out.println(i);
		}
	}
}
