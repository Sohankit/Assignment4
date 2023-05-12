package in.ineuron;
//WAP to count the number of consonants, vowels, special characters in a String.

public class Demo4 {
	public static void main(String[] args) {
		String s = "Hii everyone good night123$$$";
		int cons = 0, vowel = 0, specialChr = 0;
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			if((ch>='a' && ch<='z') ||
				(ch>='A' && ch<='Z')) {
				
				ch=Character.toLowerCase(ch);
				
				if(ch=='a' || ch=='e' || ch=='i' ||
					ch=='o' || ch=='u') {
					vowel++;
				}else {
					cons++;
				}
			}
			else {
				specialChr++;
			}

		}
		
		System.out.println("Vowels: "+vowel+"\nConsonant: "+cons+"\nSpecial Character: "+specialChr);
	}
}
