package com.TETOSOFT.input;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameActionTest {
	static GameAction g1,g2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		g1= new GameAction("move");
		g2= new GameAction("back", 1);
	}
	@AfterEach
	void tearDown() throws Exception {
		g2.reset();
	}

	
	@Test
	void testName() {
		if(g1.getName().compareToIgnoreCase("move")!=0)
		fail("the instence not initialized good");
	}
	
	@Test
	void testPress() {
		g2.press(2);
		assertEquals(2, g2.getAmount());
	}
	@Test
	void testReset() {
		g2.reset();
		assertEquals(0, g2.getAmount());
	}
	
	@Test
	void testIsPresed() {
		g2.press();
		if(!g2.isPressed())
		fail("button not pressed");
	}

}
