package com.healthme.application.common;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class DateUtilTest {

	@Before
	public void setUp() {

	}

	@After
	public void cleanUp() {

	}

	@Test
	public void testFormatDate() {
		Assert.assertEquals("07/01/1990", DateUtil.formatDate(new Date("01/07/1990"), "dd/MM/yyyy"));
	}
	
	@Test
	public void testGetDate() {
		Assert.assertEquals(new Date("01/07/1990"), DateUtil.getDate(631650600000l));
	}

}
