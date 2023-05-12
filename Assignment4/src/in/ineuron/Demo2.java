package in.ineuron;
//WAP to print Duplicates characters from the String.

import java.util.Arrays;

public class Demo2 {
	public static void main(String[] args) {
		String s="Hello everyone";
		char[] a= s.toCharArray();
		 int count;
		 
		 for(int i=0; i<a.length;i++) {
			 count=1;
			 for(int j=i+1;j<a.length;j++) {
				 if(a[i]==a[j] && a[i] !=' ') {
					 count++;
					 a[j]='0';
				 }
			 }
			 if(count>1 && a[i]!='0') {
				 System.out.print(a[i]);
			 }
		 }
	}
}
