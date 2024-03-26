package week1.day3;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		int[] number= new int[] {2,5,7,7,5,9,2,3};
		     System.out.println("Duplicate elements in given Array:");
		
		for(int i = 0; i < number.length; i++) 
		{
		
		for(int j = i+1; j < number.length; j++) 
		
		{
		
			if(number[i]==number[j])
               System.out.println(number [j] );
		}
		
		
			}	
		
		}
	}

