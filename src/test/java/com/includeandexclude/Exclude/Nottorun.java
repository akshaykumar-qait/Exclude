package com.includeandexclude.Exclude;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Nottorun {

	@Test
	public void check()
	{
		System.out.print("haha");
		assertEquals(true, true);
	}
}
