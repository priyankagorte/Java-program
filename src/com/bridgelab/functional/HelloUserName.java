/**
 * @purpose:Replace string
 * @author Bridgelabz
 * given version 1.8
 *
 */
package com.bridgelab.functional;
import com.bridgelab.utility.Utility;

	public class HelloUserName {
	
	public static void main(String[] args)
	{
		Utility utility=new Utility();
		String originalString="Hello username,How are you?";
		String name;
		do
		{
			System.out.println("enter user name");
			name=utility.getString();
		}
		while(!utility.isLengthGreaterThanThree(name));
		
		System.out.println(originalString.replaceAll("username", name));
	}
}

		
		
	
