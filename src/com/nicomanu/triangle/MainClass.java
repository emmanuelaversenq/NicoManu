package com.nicomanu.triangle;

public class MainClass {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(0, 10, 10, 0, 10, 10);
		System.out.println(triangle.identificationForme());
		System.out.println("------------");
		System.out.println(triangle);
	}
}
