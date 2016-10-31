package assignment.solution6;

import java.util.ArrayList;

public class AnimalHospital {

	public ArrayList<Pet> pets;
	void printPetInfoByName(String name){
		/* search the list of pets for every pet of a given name, 
		 * and print the pet¡¯s information, using the toString() method. */
		
		for(int i=0; i<pets.size();i++){
			if(pets.get(i).getPetName().equals(name)){
				System.out.println(pets.get(i).toString());
			}
		}
		
	}
	void printPetInfoByOwner(String name){
		/* search the list of pets for pets owned by the given person and print 
		 * the pet¡¯s information for every match, using the toString() method. */
		for(int i=0; i<pets.size();i++){
			if(pets.get(i).getOwnerName().equals(name)){
				System.out.println(pets.get(i).toString());
			}
		}
		
	}
	
	
	void printPetsBoarding(int month, int day,int year){
		/* search the list of pets for every pet boarding at the given time and print 
		 * the pet¡¯s information for every match, using the toString() method. */
		if(month >= 1 && month <=12 && day >= 1 && day <=31 && year >= 1000 && year <=9999){
			for(int i=0; i<pets.size();i++){
				if(pets.get(i).getClass().toString().endsWith("Dog")&&((Dog)pets.get(i)).boarding(year,month,day))
					System.out.println(pets.get(i).toString());
				if(pets.get(i).getClass().toString().endsWith("Cat")&&((Cat)pets.get(i)).boarding(year,month,day))
					System.out.println(pets.get(i).toString());				
			}
		}

	}


}
