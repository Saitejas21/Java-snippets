package programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Wordslen {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("enter the string");
String s=sc.nextLine();
String[] words=s.split("\\s");

int a[]=new int[words.length];
int i=0;
for (String word : words) {
a[i]=word.length();
i++;
}



        for ( i = 0; i < a.length; i++)   //Holds each Array element
        {    
           for (int  j = i+1; j < a.length; j++)    //compares with remaining Array elements
           {    
              if(a[i] < a[j]) //Compare and swap
              {    
                 int temp = a[i];    
                  a[i] = a[j];    
                  a[j] = temp;  
                  String w=words[i];
                  words[i]=words[j];
                  words[j]=w;
                 
              }    
           }    
        }  
             
        for (String b : words) {
        System.out.print(b+" ");
        }

}

}

Code for  5th program
