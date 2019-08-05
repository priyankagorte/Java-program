/**
*purpose    :1.One string is an anagram of another if the second is simply a
rearrangement of the first.
2.Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.
3.Extend the above program to find the prime numbers that are Anagram and
Palindrome
*@author	:Priynaka Gorte
*@version 	:1.8
*@since		:30-07-2019
*/



package com.bridgelab.algorithm;
import java.util.*;

import com.bridgelab.util.Util_1;


public class AnagramPrimePalindrom extends Util_1{


		public static void main(String[] args)
		{

			int i,count=0;
			boolean isPrime=false;
			int primeArr[]=new int[500];

			primeArr=Util_1.findPrime(0, 1000);
			System.out.println("Prime Number in Range 0-1000");
			for(i=0;i<primeArr.length;i++)
			{
				if(primeArr[i]>0)
				{
					System.out.print(primeArr[i]+", ");
					count++;
				}
			}
			System.out.println("\nTotal Prime Numbers :"+count);
			count=0;
			
			int[] anagramArr=Util_1.isAnangram(primeArr);
			System.out.println("\nPrime Number in Range 0-1000 that are Anagram");
			for(i=0;i<anagramArr.length;i++)
			{
				if(anagramArr[i]>0)
				{
					System.out.print(anagramArr[i]+", ");
					count++;
				}
			}
			System.out.println("\nTotal Anagram Numbers :"+count);
			
			Util_1.isPalindrome(anagramArr);
		}
		
		
		
	}

