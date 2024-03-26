package week1.day3;


public class FindMissingElement {
	 
	public static void main(String[] args) {
		
		int[] number = {1,4,3,2,8,6,7};
		
		int n= number.length+1;
		
		int sum = (n*(n+1))/2;
		
		for (int i=0; i< number.length; i++) {
			sum=sum-number[i];
		}
			System.out.println(" Missing Element in the Array:  " + sum);
		}
	}


