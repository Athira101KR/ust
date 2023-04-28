package com.ust.ar.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathematicsTests {

	Mathematics aut;
	@BeforeEach
	void setUp() throws Exception {
		aut=new Mathematics();
		aut.setNo1(2);
		aut.setNo2(3);
	}

	@AfterEach
	void tearDown() throws Exception {
		aut=null;
	}

	@Test
	void testAdd() {
		int actual = aut.add();
		assertEquals(5, actual);
	}

	@Test
	void testSubtract() {
		int actual = aut.subtract();
		assertEquals(-1, actual);
	}

	@Test
	void testProduct() {
		int actual = aut.product();
		assertEquals(6, actual);
	}

}
