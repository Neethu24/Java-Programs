package org.java.prog;

public class pyramid {
public static void main(String[] args) {
	int num=5;
	for (int i = 0; i < num; i++) {
		for (int j = 1; j < num-i; j++) {
			System.out.print(" ");
		}
//		for (int k = num-i; k <=num ; k++) {
//			System.out.print(k);
//		}
//		int k=1;
//		for (int m=0; m<i ; m++) {
//			int x=num-k;
//			System.out.print(x);
//			k++;
//		}
		for (int j =0; j < i*2+1; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
