package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import code.BackgroundCheck;

public class BackgroundTest {
	
	@Test
	public void test1() {
		BackgroundCheck classUnderTest = new BackgroundCheck();
		
		String clientName = "Oded";
		Boolean expectedAnswer = false;
		
		Boolean actualAnswer = classUnderTest.result(clientName);
		
		assertSame("Wrong answer! ", expectedAnswer, actualAnswer);
		
	}
	
	@Test
	public void test2() {
		BackgroundCheck classUnderTest = new BackgroundCheck();
		
		String clientName = "Ode";
		Boolean expectedAnswer = true;
		
		Boolean actualAnswer = classUnderTest.result(clientName);
		
		assertSame("Wrong answer! ", expectedAnswer, actualAnswer);
		
	}

}
