package week1.day1;

public class Mobile {

	public void makecall() {
	
		String mobileModel ="RedmiNote13";
		float  mobileWeight= 9.85f;
		System.out.println("Mobile Model =" +mobileModel);
		System.out.println("Mobile Weight =" +mobileWeight);
	}
	public void sendMsg() {
		
		boolean isFullCharged = true;
		 int     mobileCost   = 21000;
		 System.out.println("is FullCharged =" +isFullCharged);
		 System.out.println("mobile Cost =" +mobileCost );	 
	}
	public static void main(String[] args) {
		Mobile myMobile=new Mobile();
		myMobile.makecall();
		myMobile.sendMsg();
		System.out.println("This is my mobile");
	}
}

