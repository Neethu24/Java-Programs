package org.java.prog;

public class HdfcBAnk extends AxisBank{
	public void deposit() {
		System.out.println("Deposit : 8%");
	}
	public void premium() {
		System.out.println("Prem : 10%");

	}
	public static void main(String[] args) {
		HdfcBAnk b =new HdfcBAnk();
		b.deposit();
		b.savings();
		b.pension();
		b.premium();
	}
}
