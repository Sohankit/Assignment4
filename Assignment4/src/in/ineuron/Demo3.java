package in.ineuron;
//WAP to check if “2552” is palindrome or not.

public class Demo3 {
	public static void main(String[] args) {
		int n=2552;
		int r,sum=0;
		int temp;
		temp=n;
		
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("Present number is palindrom");
		}
		else {
			System.out.println("Present number is not palindorm");
		}
	}	
}
