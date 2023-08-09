//Write a Java program to check if the given strings are an anagram of each other.

//Sample Input:
//Amma
//Mama

//Sample Output:
//true

import java.util.*;
public class anagram 
{
public static void ann(char[] a1,char[] a2)
{
	boolean b=Arrays.equals(a1, a2);
	System.out.print(b);
	
}

	public static void main(String[] args)
	{
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		s1=sc.next();
		s2=sc.next();
		char[] a1=s1.toLowerCase().toCharArray();
		char[] a2=s2.toLowerCase().toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		ann(a1,a2);					
	}
	
}

/* Input 1:
Amma
Mama

Output 1:
true

Input 2:
star
arts

Output 2:
true

Input 3:
sweet
sweat

Output 3:
false

Input 4:
worry
sorry

Output 4:
false

Sample Input:
cmrit
r
Sample Output:
0 */
  
