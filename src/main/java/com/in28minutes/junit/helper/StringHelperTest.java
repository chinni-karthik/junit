package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();

	@Test
	public void testTruncateAInFirst2Positions_AInFirst2Positions() {
		// Expected,Actual

		String actual = helper.truncateAInFirst2Positions("AACD");
		String expected = "CD";
		assertEquals(expected, actual);

	}

	@Test
	public void testTruncateAInFirst2Positions_AInFirstPosition() {
		// Expected,Actual

		String actual = helper.truncateAInFirst2Positions("ACD");
		String expected = "CD";
		assertEquals(expected, actual);

	}
	
	@Test
	public void testTruncateAInFirst2Positions_PlayingAround() {
		// Expected,Actual
		// helper=null; -->> gives NPE
		String actual = helper.truncateAInFirst2Positions(null);//NPE
		String expected = "CD";
		assertEquals(expected, actual);

	}

}
