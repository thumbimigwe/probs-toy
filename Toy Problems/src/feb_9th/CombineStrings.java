package feb_9th;

//*************** Problem Statement ***************
//	We are given 3 strings: str1, str2, and str3. 
//
//	Str3 is said to be a shuffle of str1 and str2 if 
//	it can be formed by interleaving the characters of str1 and str2
//	in a way that maintains the left to right ordering of the characters from each string. 
//	
//	For example,
//	given str1="abc" and str2="def", str3="dabecf"
//	is a valid shuffle since it preserves the character ordering of the two strings. 
//	
//	So, given these 3 strings write a function that detects whether str3 is a valid shuffle of str1 and str2.

//*************** PSEUDOCODE ***************
//	set one pointer to the last letter of str1, str2, str3
//	Grab the letter at str3 and compare it with str2
//		- if match, move str3 and str2 one letter to the left
//		- if NOT match compare str3 with str1
//	
//	Grab the letter at str3 and compare it with str1
//		- if match, move str3 and str1 one letter to the left
//		- if NOT match, str3 is not a shuffle
	
//	Repeat until no more letters on str3


public class CombineStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
