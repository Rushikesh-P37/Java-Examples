package com.test;

interface printable {
	void print();
}

class A5 implements printable {
	public void print() {
		System.out.println("Hi i am nikol");
	}
}

public interface Student {

	public static void main(String[] args) {
		A5 obj = new A5();
		obj.print();
	}

}
