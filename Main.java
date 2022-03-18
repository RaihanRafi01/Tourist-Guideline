
//     MAIN METHOD

import java.util.*;

import dhaka.Dhaka;
import dhaka.AhsanManzil;
import dhaka.LalbaghFort;
import coxbazar.CoxBazar;
import shylet.Shylet;
import shylet.AliAmjadClock;
import shylet.AvailableFood;
import shylet.Info;
import shylet.Mazar;

public class Main {
    public static void main(String[] args) {
		System.out.println("        ***Welcome To Tourist Guideline of Bangladesh***");
		
		for(;;){
		System.out.println(" ");	
		System.out.println("Please Choose a City: ");
		System.out.println("   1.Dhaka        press 1");
		System.out.println("   2.Cox's Bazar  press 2");
		System.out.println("   3.Shylet       press 3");
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int choise = a;
		switch (choise){
			case 1:
	{
				          //      === DHAKA ===
		System.out.println("       Thank You for choosing Dhaka");
		System.out.println("Here is some Information about this City");
		Dhaka d = new Dhaka();
		d.SetCityname("Dhaka");
		d.SetCityCode(352);
		d.SetTop2("1.Ahsan Manjil  2.Lalbagh Fort");
		
		System.out.println("city name: " + (d.GetCityname()));
		System.out.println("city code: "+ d.GetCityCode());
		System.out.println("top 2 places to visit : "+ d.GetTop2());
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Choose a Place: ");
		System.out.println("1.Ahsan Manjil  press 1");
		System.out.println("2.Lalbagh Fort  press 2");
		int a1=s1.nextInt();
		int choise1 = a1;
		switch (choise1)
		{
			case 1:
			{
				        //Ahsan Manjil
		        AhsanManzil f = new AhsanManzil();
		        System.out.println(f.info());
			}
			break;
			case 2:
			{
				        //Lalbagh Fort
				LalbaghFort L1 = new LalbaghFort();
				L1.Getinfo("10:00am",100,"Pizza");
			}
			break;
			default:
			System.out.println(" ");
			System.out.println("!! You Entered Wrong Key !!");
			System.out.println("!! Please Enter Right Key !!");
		  
		}
	}
		
			break;
			
			
				          //      === Cox's Bazar ===	
			case 2: 
			{
				CoxBazar objC = new CoxBazar();
				objC.data();
				Scanner s2=new Scanner(System.in);
				int a2=s2.nextInt();
		        int choise2 = a2;
		        switch (choise2)
				{
					case 1:
					{     // himachori
						objC.hima();
					}
					break;
					case 2:
					{     // sea beach
						objC.sea();
					}
					break;
					default:
					System.out.println(" ");
			        System.out.println("!! You Entered Wrong Key !!");
			        System.out.println("!! Please Enter Right Key !!");
				}
			}
			break;
			
					          //      === Shylet ===
			case 3: 
			{
				Shylet shy=new Shylet();
				shy.shyinfo();
				
				Scanner s3=new Scanner(System.in);
				int a3=s3.nextInt();
		        int choise3 = a3;
		        switch (choise3) {
					case 1:
				{
					         // ali amzad
					
					AliAmjadClock ali=new AliAmjadClock();
					ali.info();
					Scanner s4=new Scanner(System.in);
				    int a4=s4.nextInt();
		            int choise4 = a4;
		            switch (choise4) {
						case 1:{
						//info
						Info inf1=new Info();
						inf1.aliInfo();
					}
					break;
					case 2: {
						//food
						System.out.println(" ");
						AvailableFood fo = new AvailableFood ();
		                fo.FoodInfo();
					}
					break;
					default:
					System.out.println(" ");
					System.out.println("!! You Entered Wrong Key !!");
			        System.out.println("!! Please Enter Right Key !!");
					}
					
				}
				break;
				case 2:
				{
					          // mazar
					Mazar maz=new Mazar();
                    maz.mazInfo();					
							  
				}
				break;
				default:
				System.out.println(" ");
			    System.out.println("!! You Entered Wrong Key !!");
			    System.out.println("!! Please Enter Right Key !!");
				}

			}
			break;
			default:
			System.out.println(" ");
			System.out.println("!! You Entered Wrong Key !!");
			System.out.println("!! Please Enter Right Key !!");
			
		}
		    System.out.println(" ");
			System.out.println(" ");
		    System.out.println("To Continue Again   press 1");
	        System.out.println("To End Process      press 2");
			Scanner sc2=new Scanner(System.in);
	        int Loop1 = sc2.nextInt();
		    switch(Loop1)
			{
			case 1 :
			continue ;
			case 2 :
			break ;
			}
		  break;
		}
		System.out.println(" ");
		System.out.println("Thank You For Stay With Us !!!  Have A Nice Day ");
	
}

}