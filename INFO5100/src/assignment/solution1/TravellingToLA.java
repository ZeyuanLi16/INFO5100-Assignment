package assignment.solution1;

import java.sql.Date;

/*Example : Travelling to LA

Description : A tourist is trying to find the cheapest flight to LA.

Objects (with Behaviors and State): 
	Object : Traveller
		State : name
		Behavior : visiteKayak(), inputTravelInfo(), chooseCheapestFlight()

	Object : Kayak
		State : collection of airlines
		Behavior : displayFlightOrderByPrice()

	Object : Airline
		State : name, collection of flights
		Behavior : 

	Object : Flight
		State : from, to, depart, duration, price 
		Behavior : 
	*/
class Traveller{
	String name;
	public void visiteKayak(Kayak kayak) {}
	public void inputTravelInfo(String from, String to, Date depart) {}
	public Flight chooseCheapestFlight(Flight flight) {return null;}
}

class Kayak{
	Airline[] airlines;
	public Flight[] displayFlightOrderByPrice() {return null;}
}

class Airline{
	String name;
	Flight[] flights;
}

class Flight{
	String number,from,to;
	Date depart;
	int duration;
	double price;
}
public class TravellingToLA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Traveller zac=new Traveller();zac.name="Zeyuan Li";
		Airline AA=new Airline();AA.name="American Airlines";
		Airline Delta=new Airline();Delta.name="Delta Air Lines";
		Flight DL1587=new Flight();
			DL1587.number="1587";DL1587.from="SEA";DL1587.to="LAX";DL1587.depart=new Date(0);DL1587.duration=175;DL1587.price=150.00;
		Flight AA1133=new Flight();
			AA1133.number="1133";AA1133.from="SEA";AA1133.to="LAX";AA1133.depart=new Date(0);AA1133.duration=180;AA1133.price=280.00;
		AA.flights=new Flight[]{AA1133};
		Delta.flights=new Flight[]{DL1587};
		//zac strats to find the ticket on Kayak
		Kayak kayak=new Kayak();
		zac.visiteKayak(kayak);
		zac.inputTravelInfo("SEA","LAX",new Date(0));
		Flight[] SEAtoLAX=kayak.displayFlightOrderByPrice();
		Flight SEALAX=zac.chooseCheapestFlight(SEAtoLAX[0]);
	}

}
