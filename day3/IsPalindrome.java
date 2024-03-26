package week1.day3;

public class IsPalindrome {
	
	public static void main(String[] args) {
		
		int a=123321;
		int b=0;
		
		for (int i= a; i!=0;i=i/10) {
			int remain = i%10;
			b=b*10+ remain;
		}
		if (a==b) {
			System.out.println("It is a Palindrome  (because the number reads the same backward and forward) ");
		}
		else {
			System.out.println(" It is not a Palindrome (since the reversed number, "+ b+", is not the same as original)" );
		}
	}

}
