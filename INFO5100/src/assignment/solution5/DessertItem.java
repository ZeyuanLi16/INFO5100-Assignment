package assignment.solution5;

public abstract class DessertItem {
	protected String name;
	
	public DessertItem(){
		
	}
	public DessertItem(String name){
		this.name=String.format("%s%" +(28-(name.length()-name.indexOf("\n")-1)) + "s", name, " ");

	}
	
	public final String getName(){
		return this.name;
	}
	
	public abstract int getCost();
}


