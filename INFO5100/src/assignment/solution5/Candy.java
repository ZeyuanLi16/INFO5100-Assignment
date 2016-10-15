package assignment.solution5;

import java.text.DecimalFormat;

public class Candy extends DessertItem{

	double weight;
	int price;
	int cost;
	
	public Candy(String name, double weight, int price) {
		super(new DecimalFormat(".00").format(weight)+" lbs. @ "+new DecimalFormat(".00").format((double)price/100)+"/lb.\n"+name);
		this.weight=weight;
		this.price=price;
	}

	@Override
	public int getCost() {
		return (int) Math.rint(this.price*this.weight);
	}

}
