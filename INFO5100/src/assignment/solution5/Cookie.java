package assignment.solution5;

import java.text.DecimalFormat;

public class Cookie extends DessertItem{

	int number;
	double price;
	int cost;
	
	
	public Cookie(String name, int number, int price) {
		super(number+" @ "+new DecimalFormat(".00").format((double)price/100)+" /dz.\n"+name);
		this.price=price;
		this.number=number;
	
	}

	@Override
	public int getCost() {
		return (int) Math.rint(number*price/12);
	}

}
