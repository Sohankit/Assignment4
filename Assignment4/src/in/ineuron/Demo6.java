package in.ineuron;
//WAP to implement Pangram Checking with least inbuilt methods being used.

public class Demo6 {
	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";

		boolean[] value = new boolean[26];
		int index = 0;
		int flag = 1;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				index = str.charAt(i) - 'A';
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				index = str.charAt(i) - 'a';
			}
			value[index] = true;
		}
		for (int i = 0; i < 25; i++) {
			if (value[i] == false) {
				flag = 0;
			}
		}
		if (flag == 1) {
			System.out.println(str + " is Pangram");
		} else {
			System.out.println(str + " is not panagram");
		}
	}
}
