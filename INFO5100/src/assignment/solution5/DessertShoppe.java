package assignment.solution5;

import java.text.DecimalFormat;

public class DessertShoppe {
	double taxRate;//0.065
	String storeName;
	int itemNameSize;
	int costsWidth;
	
	
	DessertShoppe(){
		this.taxRate=0.065;
		this.storeName="M & M Dessert Shoppe";
	}
	
	String cents2dollarsAndCents(int cents){
		return String.valueOf(new DecimalFormat(".00").format((double)cents/100));
	}
}
