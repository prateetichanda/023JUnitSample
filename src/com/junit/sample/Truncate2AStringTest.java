package com.junit.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Truncate2AStringTest {

	/*@Test
	void test() {
		fail("Not yet implemented");
		
	}
*/
	Truncate2AString t2as;
	//AAAA => AA , ABCD => BCD, AA => "", AB => B  
	@Test
	public void testTruncate() 
	{
		
		System.out.println("Positive JuNit case");
		Truncate2AString t2as=new Truncate2AString();
		String expOutput="B";
		String actualOutput;
				
		//Act
		actualOutput=t2as.truncate("AB");
		//System.out.println(actualOutput);
		//Assert
		assertEquals(expOutput, actualOutput);
	}
	
	@BeforeClass
	public static void beforeEachJUnitTest()
	{
		//Arrange
		System.out.println("Inside Before");
		//t2as=new Truncate2AString();
		System.out.println("create instance");
	}
	
	@AfterClass
	public static void afterEachJUnitTest()
	{
		System.out.println("Inside After");
	}
	
	
}
