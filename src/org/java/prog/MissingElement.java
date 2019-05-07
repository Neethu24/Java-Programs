package org.java.prog;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MissingElement {
	public static void main(String[] args) {
		int[] a = { 3, 2, 6, 5, 10 };
//	Set<Integer> s= new TreeSet<>();
//		Arrays.sort(a);
//	for (Integer x : a) {
//		s.add(x);
//	}
//	for (int i = a[0]; i < a[a.length-1]; i++) {
//		if (s.contains(i)) {
//			
//		}else {
//			System.out.println(i);
//		}
//	}
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		int k = 0;
		for (int i = a[0]; i < a[a.length - 1]; i++) {
			for (int l = 0; l < a.length; l++) {
				if (i == a[l]) {
					break;
				} else {
					k++;
				}
			}
			if (k == a.length) {
				System.out.println(i);
			}
			k=0;
		}

	}
}
