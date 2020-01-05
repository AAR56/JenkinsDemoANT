package com.testngANT;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class classO1 {
	
	@Test
	public void m1()
	{
		
		throw new SkipException("Hello");
		

	}

}
