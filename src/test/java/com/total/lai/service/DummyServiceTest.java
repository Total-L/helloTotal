package com.total.lai.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.total.lai.service.impl.DummyServiceImpl;

public class DummyServiceTest {
	//test github webhook
	
	@Test
	public void testAdd() {
		DummyService ds = new DummyServiceImpl();
		int result = ds.adding(1, 2);
		assertEquals(3,result);
	}

}
