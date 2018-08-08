package com.pcc.group.mavenDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DiffDemoTest {
	private DiffDemo diffDemo;
	public void setup() {
		diffDemo = new DiffDemo();
	}
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String str1 = "abcde";
		String str2 = "abcxy";
		String expected="xy";
		try {
			String deffResult = diffDemo.getDiff(str1, str2);
			assertEquals(expected,deffResult);
		}catch(Exception e) {
			e.printStackTrace();
		}
		fail("Not yet implemented");
	}
	
	@Test(expected=Exception.class)
	public void testGetDiffWithException() throws Exception{
		String str1="";
		String str2="abcxy";
		diffDemo.getDiff(str1, str2);
	}

}
