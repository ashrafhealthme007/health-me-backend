package com.healthme.application.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TextUtilTest {

	@Before
	public void setUp() {

	}

	@After
	public void cleanUp() {

	}

	@Test
	public void testIsEmpty() {
		assertTrue(TextUtil.isEmpty(""));
	}

	@Test
	public void testIsNotEmpty() {
		assertFalse(TextUtil.isEmpty("Healthme"));
	}

	@Test
	public void testIsNumeric() {
		assertTrue(TextUtil.isNumeric("688"));
	}

	@Test
	public void testIsNonNumeric() {
		assertFalse(TextUtil.isNumeric("688healthme"));
	}
	
	@Test
	public void testIsAlphaNumeric() {
		assertTrue(TextUtil.isAlphaNumeric("688healthme"));
	}

	@Test
	public void testIsNonAlphaNumeric() {
		assertFalse(TextUtil.isAlphaNumeric("688$"));
	}

}
