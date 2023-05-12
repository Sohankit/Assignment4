package in.ineuron;

import java.util.Arrays;

//WAP to remove Duplicates from a String.

public class Demo1 {
	public static void main(String[] args) {
		String s="Hello everyone";
		char[] ch=s.toCharArray();
		
		int index=0;
		
		for(int i=0;i<ch.length;i++) {
			int j;
			for(j=0;j<i;j++) {
				if(ch[i]==ch[j]) {
					break;
				}
			}
			if(j==i) {
				ch[index++]=ch[i];
			}
		}
		System.out.println(String.valueOf(Arrays.copyOf(ch, index)));
	}
}
