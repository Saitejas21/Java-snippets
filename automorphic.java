/*Write a Java program to check whether a number is an Automorphic number or not.
An automorphic number is a number whose square "ends" in the same digits as the number itself. 

Sample Input
342
Sample Output
no */

import java.util.*;
public class sqnum 
{

	public static void main(String[] args) 
	{
		int num,sqr;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		sqr=num*num;
	    String s1=Integer.toString(num);
	    String s2=Integer.toString(sqr);
	    if(s2.endsWith(s1))
	    {
	    	System.out.print("yes");
	    }
	    else
	    {
	    	System.out.print("no");
	    }
	    
	    }
	         
	}

