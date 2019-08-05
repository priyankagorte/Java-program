/**
*purpose    :Reads in integers prints them in sorted order using Bubble Sort
*@author	:Priynaka Gorte
*@version 	:1.8
*@since		:30-07-2019
*/


package com.bridgelab.algorithm;
import java.util.*;

	class BubbleSort_1
	{ 
		
		public static void main(String args[])
			{
				Scanner sc =new Scanner(System.in);
				System.out.println("How many element you want in List");
				int size=sc.nextInt();
				int[]arr=new int[size];
				for(int i=0;i<size;i++)
				{
					System.out.println("Enter a["+(i+1)+"] Element");
					arr[i]=sc.nextInt();
				}
				
				System.out.println("List Before Sorting");
				for(int i=0;i<size;i++)
				{
					System.out.print(arr[i]+" ");
				}
				
				for (int i = 0; i < size - 1; i++)  
		        { 
		     
		            for (int j = 0; j < size - i - 1; j++)  
		            { 
		                if (arr[j] > arr[j + 1])  
		                { 
		                    int temp = arr[j]; 
		                    arr[j] = arr[j + 1]; 
		                    arr[j + 1] = temp; 
		                } 
		            } 
		        }

				System.out.println("\nList After Sorting");
				for(int i=0;i<size;i++)
				{
					System.out.print(arr[i]+" ");
				}
				
			}
	}