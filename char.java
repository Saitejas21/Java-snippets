/*Write a Java program to find the number, percentage of uppercase letters, lowercase letters, digits and other symbols.

Sample Input:

CMRIT@123$

Sample Output:

10 5 50 0 0 3 30 2 20 */

import java.util.*;
public class ann1
{
	public static void main(String[] args) 
	{
		String s1;
		Scanner sc=new Scanner(System.in);
		s1=sc.next();
		char[] a=s1.toCharArray();
		int u=0,l=0,d=0,o=0;
		int t=0;
		t=s1.length();
		for(int i=0;i<t;i++)
		{
			if(Character.isUpperCase(a[i]))
			{
				u++;
			}
			else if(Character.isLowerCase(a[i]))
			{
				l++;
			}
			else if(Character.isDigit(a[i]))
			{
				d++;
			}
			else
			{
				o++;
			}
			
		}
		System.out.print(t +" " + u + " " +(u*100/t) +" "+ l + " " +((l*100/t)) +" "+ d + " " + ((d*100)/t) +" "+ o +" " +(o*100)/t);
		}
}
