package com.bridgelab.algorithm;
import java.util.*;

import com.bridgelab.util.Util_1;


	public class BinaryMethod extends Util_1 {
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number :");
			int num =sc.nextInt();
			
			String binaryString=Util_1.toBinary(num);
			System.out.println("Binary Number of "+num+" is "+binaryString);
			
			
			while(binaryString.length()%4!=0)
			{
				binaryString='0'+binaryString;
			}
			char[] binaryChar=binaryString.toCharArray();
			int j=binaryChar.length-4;
				for(int i=0;i<4;i++)
				{
					char temp=binaryChar[i];
					binaryChar[i]=binaryChar[j];
					binaryChar[j]=temp;
					j++;
					
				} 
			String swapNibble=String.copyValueOf(binaryChar);
			System.out.println("Binary Number After Swapping Nibble : "+swapNibble);
			double decimal=Util_1.toDecimal(binaryChar);
			System.out.println("Decimal Number After Swapping Nibble : "+decimal);
		}
	}
