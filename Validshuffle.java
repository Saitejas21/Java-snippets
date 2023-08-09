package programs;
import java.util.Arrays;
import java.util.Scanner;


public class reversestring {
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
boolean res=false;
System.out.println("enter the string");
String s=sc.nextLine();
s=s.toLowerCase();
char[] a=s.toCharArray();
String s1=sc.nextLine();
s1=s1.toLowerCase();
char[] a1=s1.toCharArray();
Arrays.sort(a1);


for(int i=0;i<=s.length()-s1.length();i++) {
String str=s.substring(i,i+s1.length());
char arr[]=str.toCharArray();
Arrays.sort(arr);
if(Arrays.equals(a1, arr)) {
res=true;
break;
}
}
if(res) {
System.out.println("yes");
}
else {
System.out.println("No");
}

}


}
