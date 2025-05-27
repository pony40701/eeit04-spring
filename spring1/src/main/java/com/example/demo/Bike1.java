package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Bike1 implements Bike {
	int i;
	public Bike1() {
		System.out.println("Bike1()");
	}

	@Override
	public void upSpeed() {
		System.out.println("Bike1:upSpeed()");

	}

	@Override
	public void downSpeed() {
		System.out.println("Bike1:downSpeed()");

	}

	@Override
	public void m1() {
		System.out.println("Bike1:m1():" + i++);

	}

	@Override
	public void m2() {
		System.out.println("Bike1:m2()");

	}

}
