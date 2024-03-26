package week1.day3;

public class IsPrime {
	
	public static void main(String[] args) {
     int number=12;
     int count=0;

		for(int i = 1;i <= number; i++){
			
			  if(number % i == 0) {
				  count++;
			  }
				if (count==2) {
			   System.out.println(" Number "+number+" is a prime number ");
				}
	
			  else {
				  System.out.println(" Number "+number+" is not a prime number ");
			  }  
				break;
}
}
} 