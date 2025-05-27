package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Bike2 implements Bike {
	public Bike2() {
		System.out.println("Bike2()");
	}

	@Override
	public void upSpeed() {
		System.out.println("Bike2:upSpeed()");

	}

	@Override
	public void downSpeed() {
		System.out.println("Bike1:downSpeed()");

	}

	@Override
	public void m1() {
		System.out.println("Bike2:m1()");

	}

	@Override
	public void m2() {
		System.out.println("Bike2:m2()");

	}

}
