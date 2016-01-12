package com.nicomanu.triangle;

public class MainClass {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(0, 10, 10, 0, 10, 10);
		System.out.println("------------");
		System.out.println(triangle);

		Triangle triangle2 = new Triangle(0, 0, 10, 0, 10, 10);
		System.out.println("------------");
		System.out.println(triangle2);

		Triangle triangle3 = new Triangle(0, 1, 10, 0, 10, 10);
		System.out.println("------------");
		System.out.println(triangle3);

		Triangle triangle4 = new Triangle(0, 0, 0, 0, 0, 0);
		System.out.println("------------");
		System.out.println(triangle4);
		
	}
}
