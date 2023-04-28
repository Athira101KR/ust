package com.ust.ar.testCases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ust.ar.cls.Mathematics;

class MathematicsTest1 {

	Mathematics mt;
	@BeforeEach
	void setUp() throws Exception {
		mt=new Mathematics();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {
		mt.setA(4);
		mt.setB(2);
		assertEquals(6,mt.add());
	}

	@Test
	void testSub() {
		mt.setA(4);
		mt.setB(2);
		assertEquals(2,mt.sub());
	}

	@Test
	void testPro() {
		mt.setA(4);
		mt.setB(2);
		assertEquals(8,mt.pro());
	}

	@Test
	void testDiv() {
		mt.setA(4);
		mt.setB(2);
		assertEquals(2,mt.div());
	}

}
