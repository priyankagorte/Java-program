package com.bridgelab.functional;
import java.util.Scanner;

import com.bridgelab.utility.Utility;
public class CouponNumbers {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How Many Coupon You Want");
		int no=sc.nextInt();
		Utility.Gambler(no);
    }
}
