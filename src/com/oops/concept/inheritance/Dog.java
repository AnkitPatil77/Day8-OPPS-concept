package com.oops.concept.inheritance;

import com.opps.concept.inheritance.Animal;

public class Dog extends Animal {

	public String breed;
	public String color;
	public int age;
	public double size;

	/*
	 * public void eat() { System.out.println(name + " is eating dog food"); }
	 */

	public void run() {
		System.out.println(name + " is running");
	}

	public void sleep() {
		System.out.println(name + " is sleeping");
	}
}
