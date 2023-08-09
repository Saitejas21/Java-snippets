//1. Take two string inputs. Remove the characters present in the second string from the first string. 

class removeCharacter {
	public static String removeChars(String string1,String string2)
	{
		// we extract every character of string string 2
		for (int index = 0; index < string2.length();
			index++) {
			char i = string2.charAt(index);
			// we find char exit or not
			while (string1.contains(i + "")) {
				int itr = string1.indexOf(i);
				// if char exit we simply remove that char
				string1 = string1.replace((i + ""), "");
			}
		}
		return string1;
	}

	// Driver Code
	public static void main(String[] args)
	{
		String string1, string2;
		string1 = "Master of Computer Application";
		string2 = "MCA";
		System.out.println(removeChars(string1, string2));
	}
}

//2. How do you find the longest palindromic substring of a given substring? (input: bacbcad, output: acbca)
// A Java solution for longest palindrome

 class longestPalindromeSubstring{

	// Function to print a subString str[low..high]
	static void printSubStr(String str, int low, int high)
	{
		for (int i = low; i <= high; ++i)
			System.out.print(str.charAt(i));
	}

	// This function prints the
	// longest palindrome subString
	// It also returns the length
	// of the longest palindrome
	static int longestPalSubstr(String str)
	{
		// Get length of input String
		int n = str.length();

		// All subStrings of length 1
		// are palindromes
		int maxLength = 1, start = 0;

		// Nested loop to mark start and end index
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				int flag = 1;

				// Check palindrome
				for (int k = 0; k < (j - i + 1) / 2; k++)
					if (str.charAt(i + k)
						!= str.charAt(j - k))
						flag = 0;

				// Palindrome
				if (flag != 0 && (j - i + 1) > maxLength) {
					start = i;
					maxLength = j - i + 1;
				}
			}
		}

		System.out.print(
			"Longest palindrome substring is: ");
		printSubStr(str, start, start + maxLength - 1);

		// Return length of LPS
		return maxLength;
	}

	// Driver Code
	public static void main(String[] args)
	{
		String str = "bacbcad";
		System.out.print("\nLength is: "
						+ longestPalSubstr(str));
	}
}






3. How to program to print first non-repeated character from String? [input: abbaacrrdef, output:c]
//Java code for the above approach

import java.io.*;

public class firstNonrepeatedChar {
	public static void main(String[] args) {
		String string = "abacddbec";
		int index = -1;
		char fnc = ' ';
	
	if(string.length()==0){
		System.out.println("EMPTY STRING");
	}
	
		for (char i : string.toCharArray()) {
			if (string.indexOf(i) == string.lastIndexOf(i)) {
				fnc = i;
				break;
			}
			else {
				index += 1;
			}
		}
		if (index == string.length()-1) {
			System.out.println("All characters are repeating");
		}
		else {
			System.out.println("First non-repeating character is " + fnc);
		}
	}
}

4. How to check if a String is a valid shuffle of another String?
// Java program to check if String
// str1 is subString of str2 or not.
import java.util.*;

class shuffledSubstring
{

// Function two check String A
// is shuffled subString of B
// or not
static boolean isShuffledSubString(String A, String B)
{
	int n = A.length();
	int m = B.length();

	// Return false if length of
	// String A is greater than
	// length of String B
	if (n > m)
	{
		return false;
	}
	else
	{

		// Sort String A
		A = sort(A);

		// Traverse String B
		for (int i = 0; i < m; i++)
		{

			// Return false if (i + n - 1 >= m)
			// doesn't satisfy
			if (i + n - 1 >= m)
				return false;

			// Initialise the new String
			String str = "";

			// Copy the characters of
			// String B in str till
			// length n
			for (int j = 0; j < n; j++)
				str += B.charAt(i + j);

			// Sort the String str
			str = sort(str);

			// Return true if sorted
			// String of "str" & sorted
			// String of "A" are equal
			if (str.equals(A))
				return true;
		}
	}
	return false;
}

// Method to sort a string alphabetically
static String sort(String inputString)
{
	// convert input string to char array
	char tempArray[] = inputString.toCharArray();
	
	// sort tempArray
	Arrays.sort(tempArray);
	
	// return new sorted string
	return String.valueOf(tempArray);
}

// Driver Code
public static void main(String[] args)
{
	// Input str1 and str2
	String str1 = "onetwofour";
	String str2 = "hellofourtwooneworld";

	// Function return true if
	// str1 is shuffled subString
	// of str2
	boolean a = isShuffledSubString(str1, str2);

	// If str1 is subString of str2
	// print "YES" else print "NO"
	if (a)
		System.out.print("YES");
	else
		System.out.print("NO");
	System.out.println();
}
}

5. Sort the words of a string based on the word length. 
// Java program to sort an Array of
// Strings according to their lengths
import java.util.*;

class sortStringArray
{

// Function to print the sorted array of string
// void printArraystring(string,int);

// Function to Sort the array of string
// according to lengths. This function
// implements Insertion Sort.
static void sort(String []s, int n)
{
	for (int i=1 ;i<n; i++)
	{
		String temp = s[i];

		// Insert s[j] at its correct position
		int j = i - 1;
		while (j >= 0 && temp.length() < s[j].length())
		{
			s[j+1] = s[j];
			j--;
		}
		s[j+1] = temp;
	}
}

// Function to print the sorted array of string
static void printArraystring(String str[], int n)
{
	for (int i=0; i<n; i++)
		System.out.print(str[i]+" ");
}

// Driver function
public static void main(String args[])
{
	String []arr = {"Kindness", "is", "a", "virtue"};
	int n = arr.length;
	Arrays.sort(arr);
	for (String string : arr) {
		System.out.println(string);
	}	
	// Function to perform sorting
	sort(arr,n);
	// Calling the function to print result
//	printArraystring(arr, n);
	
}
}
