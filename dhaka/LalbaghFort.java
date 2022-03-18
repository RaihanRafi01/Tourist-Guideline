
                 // Using Interface
package dhaka;

interface Linfo {
	void Getinfo(String Open,int Fees,String Meal);
}
public class LalbaghFort implements Linfo {
	public void Getinfo(String Open,int Fees,String Meal){
		System.out.println("          Thank You for choosing Lalbagh Fort     ");
		System.out.println("OpeningTime: " + Open +"  EntryFee: " + Fees + "BDT  Available Meal: " + Meal );
	}
}