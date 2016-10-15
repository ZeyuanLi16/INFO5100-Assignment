package assignment.solution5;

import java.util.Vector;

public class Checkout {
	
	Vector v;
	
	public Checkout(){
		this.v=new Vector();
	}

	public int numberOfItems(){
		return v.size();
	}
	
	public void enterItem(DessertItem item){
		v.addElement(item);
	}

	public void clear() {
		this.v=new Vector();
		
	}
	
	public int totalCost(){
		int cost=0;
		for(int i=0;i<v.size();i++)
			cost=cost+((DessertItem) v.get(i)).getCost();
		return cost;
	}

	public int totalTax(){
		DessertShoppe sd=new DessertShoppe();
		return (int) Math.rint(this.totalCost()*sd.taxRate);
	}
	
	@Override
	public String toString(){
		DessertShoppe sd2=new DessertShoppe();
		String s="";
		s="     "+sd2.storeName+"\n";
		s+="     --------------------\n\n";
		
		for(int i=0;i<v.size();i++)
			s+=((DessertItem) v.get(i)).getName()
						+sd2.cents2dollarsAndCents(((DessertItem) v.get(i)).getCost())+"\n";			
		s+="\nTax                         "
						+sd2.cents2dollarsAndCents(this.totalTax());
		s+="\nTotal Cost                  "
						+sd2.cents2dollarsAndCents(this.totalTax()+this.totalCost());
		return s;
	}
	
}
