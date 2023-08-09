//Count the number of occurrences of any particular character in the given input string.

/*Sample Input:
institute
t
Sample Output:
3 */

import java.util.*;
public class occur
{
	public static void main(String[] args) 
	{
		
		String s;
		char a;
		int c=0;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		a=sc.next().charAt(0);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==a)
			{
				c++;
			}
			
		}
		System.out.print(c);
	}
	
				
}	
