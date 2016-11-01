package assignment.solution6;

import java.sql.Date;

public class Dog extends Pet implements Boardable{
	
	private String size;
	private Date boardStart;
	private Date boardEnd;	
	
	Dog (String name, String ownerName, String color, String size){
		super(name,ownerName,color);
		this.size=size;
	}
	String getSize(){
		// returns the string size String toString(); 
		return this.size;
	}
	/* method that returns a String that identifies the pet as Dog and 
	 * returns a complete description of the dog, including the values stored in the Pet parent class. */ 
	public String toString() {
		
		return "DOG:\n"+super.toString()+"\nHair: "+this.size;
		
	}
	
	
	@Override
	public void setBoardStart(int month, int day, int year) {
		if(month >= 1 && month <=12 && day >= 1 && day <=31 && year >= 0001 && year <=9999){
			this.boardStart=new Date(year,month,day);
		}
		else System.out.println("Please input vaild date");
			
	}
	@Override
	public void setBoardEnd(int month, int day, int year) {
		if(month >= 1 && month <=12 && day >= 1 && day <=31 && year >= 1000 && year <=9999){
			this.boardEnd=new Date(year,month,day);
		}
		else System.out.println("Please input vaild date");
		
	}
	@Override
	public boolean boarding(int month, int day, int year) {
		if(month >= 1 && month <=12 && day >= 1 && day <=31 && year >= 1000 && year <=9999){
			Date test=new Date(year,month,day);
			if((test.before(boardEnd)&&test.after(boardStart))||test.equals(boardEnd)||test.equals(boardStart))
				return true;
			else
				return false;
		}
		else {
			System.out.println("Please input vaild date");
			return false;
		}
		
	}
}
