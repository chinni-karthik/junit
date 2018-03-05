package com.in28minutes.junit.helper;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QuickBeforeAfterTest {
	
	@Before	
	public void setUp(){
		System.out.println("Running before...");
	}

	@Test
	public void test1() {
		System.out.println("test 1 executed...!!!");
	}
	
	@Test
	public void test2() {
		System.out.println("test 2 executed...!!!");
	}
	
	@After
	public void tearDown(){
		System.out.println("Running after...");
	}

}
