package org.java.prog;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of values to be entered in an array:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Set<Integer> s = new HashSet<Integer>();
		for (Integer num : arr) {
			if (s.contains(num)) {

			} else {
				s.add(num);
				System.out.println(num);
			}
		}

}
}
