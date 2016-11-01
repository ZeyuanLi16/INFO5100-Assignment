package assignment.solution6;

import java.sql.Date;

public class Cat extends Pet implements Boardable{

	private String hairLength;
	private Date boardStart;
	private Date boardEnd;
	
	Cat (String name, String ownerName, String color, String hairLength){
		super( name,  ownerName,  color);
		this.hairLength=hairLength;
	}
	public String getHairLength(){
		// returns the string hairLength 
		return this.hairLength;
	}
	public String toString() {
		/* method that returns a String that identifies the pet as Cat and returns a complete 
		 * description of the cat, including the values stored in the Pet parent class.*/ 
		
		return "CAT:\n"+super.toString()+"\nHair: "+this.hairLength;
		
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
