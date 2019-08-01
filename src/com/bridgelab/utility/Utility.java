package com.bridgelab.utility;

import java.util.Scanner;
 
import java.util.Random;

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
	{int result=1;
		return name.length()>3;
	}
	/*
	 * return string from keyboard
	 */
	public String getString()
	{
		return scanner.next();
	}
	/*
	 * flip coin
	 */
	public static void FlipCoin( int flips,int counter,double randNum,int heads,int tails)
	{
		
	
	while(counter<flips)
	{
		randNum=Math.random();
		
		if(randNum<0.5)
		{
			heads++;
		}
		else
		{
			tails++;
		}
		counter++;
	}
System.out.println("number of heads="+heads);
System.out.println("number of tails="+tails);
float headpercentage=(float)((float)heads/flips*100);
System.out.println("head percentage is"+headpercentage);
float tailpercentage=(float)((float)tails/flips*100);
System.out.println("tail percentage is"+tailpercentage);
}
	int result=1;
	/*
	 * Harmonic Number
	 */
	public static void Harmonic( int num) {
		double result=0.0;
		for(int i=1;i<=num;i++)
		{
			if(i==1)
			{
				System.out.print("1 + ");
			}
			else if(i==num)
			{
				System.out.print("1/"+num);
			}
			else
			{
				System.out.print("1/"+i+" + ");
			}
		}
	}
/*
 * Gambler
*/
public static void Gambler(int stake,int goal,int numberOfTime)
{
	int wincount=0,bets=0;
	int cash=stake;
	
		for(int i=0;i<numberOfTime;i++)
		{
			bets++;
			if(Math.random()>0.5)
			{
				wincount++;
				cash++;int result=1;
			}
			else
			{
				cash--;
			}
			if(cash==goal)
			{
				System.out.println();
				break;
			}
		}

	System.out.println("You Win match "+wincount+" Times");
	
	float winpercentage=(float)((float)wincount/bets*100);
	System.out.println("Percentage of match win" +winpercentage);
	
	float loospercentage=(float)(100-winpercentage);
	System.out.println("Percentage of match win" +loospercentage);
	
	
}
/*int result=1;
 * coupon number
 */
	public static void Gambler(int no)
	{
		java.util.Random rand=new java.util.Random();
		int[] coupon=new int[no];
		int count=0;
		int i=0;
		for(i=0;i<no;i++)
		{
			int randomNumber=rand.nextInt(no);
			int k=0;
			for(int j=0;j<i;j++)
			{
				if(coupon[j]==randomNumber)
				{
					break;
				}
				k++;
			}
			if(i==k)
			{
				coupon[i]=randomNumber;
				count++;
			}
			i=count;
		}
		System.out.println("Generated Coupons are as follows");
	
		for(i=0;i<no;i++)
		{
			System.out.println((i+1)+" Coupon Number is : "+coupon[i] );
		}
		System.out.println("Total number of Coupons: "+count);
	}

/*
 * Permutation
 */
	public static void FindPermutation(String str,String ans)
	{
		if(str.length()==0)
		{
			System.out.println(ans+" ");
		}
		for(int i=0;i<str.length();i++)
		{
			boolean[]b=new boolean[26];
			char ch=str.charAt(i);
			String s=str.substring(0,i)+str.substring(i+1);
			if (b[ch-'a']==false);
			FindPermutation(s,ans+ch);
			b[ch-'a']=true;
			
		}
	}
	/*
	 * prime factor
	 */

	public static void findPrimeFactor(int n)
	{
		while(n%2==0)
		{
			System.out.print("2"+" ");
			n/=2;
		}
		for(int i=3;i<Math.sqrt(n);i+=2)
		{int result=1;
			while(n%i==0)
			{
				System.out.print(i+" ");
				n=n/i;
			}	
		}
		if(n>2)
		{
			System.out.print(n);
		}
	}
	
	/*
	 * 2D Array
	 */
	
	
	public static void twodarray(int row,int col) {
		
	Scanner sc=new Scanner(System.in);

	int [][] intArr= new int[row][col];
	double [][] doubleArr= new double[row][col];
	boolean [][] booleanArr= new boolean[row][col];
	
	for(int r=0;r<row;r++)
	{
		for(int c=0;c<row;c++)
		{
			System.out.println("Enter integer (intArr["+r+"][" +c+ "]value:");
			intArr[r][c]=sc.nextInt();
		}
	}
	for(int r=0;r<row;r++)
	{
		for(int c=0;c<row;c++)
		{
			System.out.println("Enter Double (doubleArr["+r+"][" +c+ "]value:");
			doubleArr[r][c]=sc.nextDouble();
		}
	}
	for(int r=0;r<row;r++)
	{
		for(int c=0;c<row;c++)
		{
			System.out.println("Enter Boolean (booleanArr["+r+"][" +c+ "]value:");
			booleanArr[r][c]=sc.nextBoolean();
		}
	}
	System.out.println("Your Interger 2D Array is:");
	for(int r=0;r<row;r++)
	{
		for(int c=0;c<row;c++)
		{
			System.out.print("|"+intArr[r][c]);
		}
		System.out.println("|");
	}
	System.out.println("\nYour Double 2D Array is:");
	for(int r=0;r<row;r++)
	{
		for(int c=0;c<row;c++)
		{
			System.out.print("|"+doubleArr[r][c]);
		}
		System.out.println("|");
	}
	System.out.println("\nYour Boolean 2D Array is:");
	for(int r=0;r<row;r++)
	{
		for(int c=0;c<row;c++)
		{
			System.out.print("|"+booleanArr[r][c]);
		}
		System.out.println("|");
	}
	}

	
	
	/*
	 * Power of two
	 */
	public static void poweroftwo(int power) {
		
	int result=1;
	{
		if(power>0 && power<32)
		{
			for(int i=0;i<=power;i++)
			{
				System.out.println("2^"+i+"="+result);
				result*=2;
			}
			
		}
		else 
		{
			System.out.println("Enter Power between 0 and 32");
	
		}
	}
	}


/*
 *
 *Stop watch
 *
 */public static void Stopwatchfun() {
 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Press 1 to Start Stop Watch and Press 0 to Stop Watch :");
	 int start=sc.nextInt();
	 
	 long startTime=0;
	 long stopTime=0;
	 
	 if(start==1)
	 {
		 startTime=System.currentTimeMillis();
	 }
	 int stop=sc.nextInt();
	 if(stop==0)
	 {
		 stopTime=System.currentTimeMillis();
		 long elapseTime=(stopTime-startTime)/1000;
		 
		 System.out.println(elapseTime);

	 }	
	
	
 }
 
 
 /* 
  * Quadratic
  */
 
 	public static void quadratic(double a,double b,double c) {
 
 		double determinant=b*b-4*a*c;
 		double sqrt=Math.sqrt(determinant);
 			if(determinant>0)
 				{
 					double firstRoot= (double)(-b+sqrt)/(2*a);
 					double secondRoot=(double)(-b-sqrt)/(2*a);
 					
 					System.out.println("roots are"+firstRoot+""+secondRoot);
 				}
 			else if(determinant==0)
 			{
 				System.out.println("root is"+(-b+sqrt)/(2*a));
 			}
	
 	}
}

