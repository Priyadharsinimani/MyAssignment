package week1.day3;

public class FibonacciSeries {
	
        public static void main(String[] args) {

	          int a=0;
	          int b=1;
	          
	      System.out.println("FibonacciSeries No :");
	      System.out.println(a+ ","+ b);
	      
	      for (int i=0;i<=5; i++){
	    	  
	         int c= a+b;
	         
	      if (i==5) {
	         System.out.println(c+",");
	}
	      else {
	    	  System.out.println(c+",");
	      }
	       a=b;
	       b=c;
}
}
}

