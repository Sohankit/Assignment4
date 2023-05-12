package in.ineuron;

import java.util.Arrays;

//WAP to implement Anagram Checking least inbuilt methods being used.

class Anagram{
	public boolean anagram(String s1 , String s2) {
		
		int length1=s1.length();
		int length2=s2.length();
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		if(length1!=length2)
			return false;
		
		 Arrays.sort(ch1);
		 Arrays.sort(ch2);
		 
		 for(int i=0;i<length1;i++) {
			 if(Character.toLowerCase(ch1[i])== Character.toLowerCase(ch2[i])) 
				 return true;
		 }
		 return false;
	}
}

public class Demo5 {
	public static void main(String[] args) {
		Anagram a= new Anagram();
		String str1 = "Race";
		String str2 = "Care";
		
		if(a.anagram(str1, str2)) {
			System.out.println("The two strings are Anagram.");
		}else {
			System.out.println("The two Strings are not an Anagram.");
		}
		
	}
}
