package com.org.test;

import org.testng.annotations.Test;

import com.org.base.BaseClass;

public class SampleTest extends BaseClass{

	@Test
	public void methodOne() {
		System.out.print("1");
	}

	@Test
	public void methodTwo() {
		System.out.print("2");
	}

	@Test
	public void methodThree() {
		System.out.print("3");
	}

	@Test
	public void methodFour() {
		System.out.print("Hello 4");
	}

}
