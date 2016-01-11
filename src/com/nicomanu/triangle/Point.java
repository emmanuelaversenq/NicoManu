package com.nicomanu.triangle;

public class Point {

	private int x;
	private int y;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	Point() {
		this.x = 0;
		this.y = 0;
	}
}
