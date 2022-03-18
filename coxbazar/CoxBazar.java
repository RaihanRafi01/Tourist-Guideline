
                         // Using Abstract 
package coxbazar;

abstract class Info {
	public abstract void data();
}
public class CoxBazar extends Info {
	public void data(){
		System.out.println("       Thank You for choosing Cox's Bazar");
		System.out.println("Here is some Information about this City");
		System.out.println("City name: Cox's Bazar");
		System.out.println("City code: 4700");
		System.out.println("Top places to visit:  1.Himachori  2.Sea Beach");
		System.out.println("       *Choose a Place To Visit*");
		System.out.println("    1.Himachori   PRESS 1");
		System.out.println("    2.Sea Beach   PRESS 2");
		
	}
	public void hima(){
		System.out.println("  Thank You for choosing Himachori");
		System.out.println("Here you can enjoy the beauty of sea and hill Its height is about");
		System.out.println("108 feet and on top of the hill you will feel the beauty of sea");
	}
	public void sea(){
		System.out.println("  Thank You for choosing Sea Beach");
		System.out.println("It is the longest natural Sea Beach in the World. Its about 120Km");
		System.out.println("It is the most visited tourist destination in Bangladesh");
	}
}