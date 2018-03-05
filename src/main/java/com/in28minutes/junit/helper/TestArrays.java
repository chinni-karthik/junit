package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestArrays {

	@Test
	public void testArraysSort() {
		int[] inputNumberArray = { 2, 5, 3, 1, 4 };
		Arrays.sort(inputNumberArray);
		int[] expectedOutput = { 1, 2, 3, 4, 5 };
		assertArrayEquals(expectedOutput, inputNumberArray);
	}
	
	@Test(expected=NullPointerException.class)
	public void testArraysWithNullCondition(){
		int[] inputNumberArray = null;
		Arrays.sort(inputNumberArray);
		int[] expectedOutput = { 1, 2, 3, 4, 5 };
		assertArrayEquals(expectedOutput, inputNumberArray);
	}
	
	@Test(timeout=10000)
	public void testArrayPerformance(){
		for (int i = 0; i < 1000000; i++) {
			int[] inputNumberArray = {i+1,i,i-1};
			Arrays.sort(inputNumberArray);
		}
	}

}
