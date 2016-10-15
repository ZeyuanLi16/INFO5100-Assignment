package assignment.solution5;

public class Sundae extends IceCream{

	
	public Sundae(String name, int cost, String topping, int costTopping) {
		super(topping+" Sundae with\n"+name, cost+costTopping);
	}
	@Override
	public int getCost() {
		return this.cost;
	}

}
