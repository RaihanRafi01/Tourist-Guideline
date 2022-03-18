
                // Using Inheritance 
package dhaka;
 
	class Info{
	public String OpeningTime="9:00am";
	public int EntryFee=500;
	
}
 public class AhsanManzil extends Info {
	public String meal="Burger";
	public String info (){
		System.out.println("          Thank You for choosing Ahsan Manzil     ");
		
		return "OpeningTime: " + OpeningTime +"  EntryFee: " + EntryFee + "BDT  Available Meal: " + meal ;
		
	}
	
	
}



 