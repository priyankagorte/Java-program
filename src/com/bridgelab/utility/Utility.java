package com.bridgelab.utility;

import java.util.Scanner;

public class Utility {
	Scanner scanner=new Scanner(System.in);
/*
 * @purpose	:Check Year is four Digit of not
 */
	public boolean isFourDigit( final int year)
	{
		return year>=1000 && year<=9999;   //to check the year is four digit
	}
	/*
	 * check userlength greater than three
	 */
	public boolean isLengthGreaterThanThree(String name)
	{
		return name.length()>3;
	}
	/*
	 * return string from keyboard
	 */
	public String getString()
	{
		return scanner.next();
	}
}
