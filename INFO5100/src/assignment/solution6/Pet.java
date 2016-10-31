package assignment.solution6;

public class Pet {
	
	private String petName;
	private String ownerName;
	private String color;
	protected static int sex;
	public static final int MALE=1;
	public static final int FEMALE=2;
	public static final int SPAYED =3;
	public static final int NEUTERED=4;
	
	Pet (String name, String ownerName, String color){
		//Constructor 
		this.petName=name;
		this.ownerName=ownerName;
		this.color=color;
		
	}
	
	String getPetName(){
		return this.petName;
	} 
	String getOwnerName(){
		return this.ownerName;
	}
	String getColor(){
		return this.color;
	}
	void setSex(int sexid){
		switch(sexid){
			case 1:{
				this.sex=1;
				break;
			}
			case 2:{
				this.sex=2;
				break;
			}
			case 3:{
				this.sex=3;
				break;
			}
			case 4:{
				this.sex=4;
				break;
			}
			default:System.out.println("Please input vaild sex number");
		}
	}
	String getSex(){
		// Should return the string equivalent of the gender, e.g the string ¡°MALE¡± etc. 
		switch(this.sex){
			case 1:return "Male";
			case 2:return "Female";
			case 3:return "Spayed";
			case 4:return "Neutered";
			default:return "";
		}
	
	}
	public String toString(){
		// Should return the name, owner¡¯s name, age, color, and gender (use getSex());
		return this.petName+" owned by "+this.ownerName
				+"\nColor: "+this.color+"\nSex:"+this.getSex();		
	}
	
	


}
