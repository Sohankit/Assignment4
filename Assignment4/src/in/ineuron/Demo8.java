package in.ineuron;
//WAP to find the maximum occurring character in a String.

public class Demo8 {
	public static void main(String[] args) {
		String str = "GeeksforGeeks";

		int[] frq = new int[str.length()];
		int max;
		char maxchar = str.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			frq[i] = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					frq[i]++;
				}
			}
		}
		max = frq[0];
		for (int i = 0; i < frq.length; i++) {
			if (max < frq[i]) {
				max = frq[i];
				maxchar = str.charAt(i);
			}
		}
		System.out.println("Maximum occuring character is: " + maxchar);
	}
}
