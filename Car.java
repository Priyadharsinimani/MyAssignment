package week1.day1;

public class Car {
	
    public void applyBreak() {
    	System.out.println("Applied break");
    }
    public void soundhorn() {
    	System.out.println("sound horn");
    }
   public static void main(String[] args) {
	  Car myCar=new Car();
	    myCar.applyBreak();
	    myCar.soundhorn();  
}
}

