package com.junit.sample;

public class Truncate2AString {
	//here I'll define the method which will do the truncate AA present in first two position of input string.
	
	public String truncate(String str)
	{
		String newStr="";

		String firstTwoChar=str.substring(0,2);
		String remString=str.substring(2);
		
		newStr=firstTwoChar.replace("A","")+remString;
		
		return newStr;
	}
}
