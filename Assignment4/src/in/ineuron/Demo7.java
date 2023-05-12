package in.ineuron;

//WAP to find if String contains all unique characters.
class UniqueChar {

	public boolean checkCharacter(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}

			}
		}
		return true;
	}
}

public class Demo7 {
	public static void main(String[] args) {
		String s = "absgdf";
		UniqueChar u = new UniqueChar();
		if (u.checkCharacter(s)) {
			System.out.println("String contains unique characters");
		} else {
			System.out.println("String has duplicate characters");
		}
	}
}
