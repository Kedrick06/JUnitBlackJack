package com.qa.testcenter;

import org.junit.jupiter.api.Test;

import com.qa.testing.examples.BlackJack;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BlackJackTest {

	
	@Test
	public void addTest() {
		
		double result = BlackJack.add(12,3);
	
		assertEquals(20, result);
	}

}
