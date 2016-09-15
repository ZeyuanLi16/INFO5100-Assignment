package assignment.solution1;

import java.util.Date;

/*Example : Booking an Airbnb

Description : A tourist wants to book a house on Airbnb app.

Objects (with Behaviors and State): 
	Object : Tourist
		State : name, telephone
		Behavior : openBookingApp(), chooseDesiredHost(), checkAvaiablity(), sendReservationRequest(), makePayment()

	Object : Airbnb
		State : collection of hosts
		Behavior : displayHosts(), createReservation(), acceptMoney()

	Object : Host
		State : name, address, telephone, price
		Behavior : approveRequest()

	Object : Reservation
		State : tourist, host, checkInDate, nights, total, ifPaid
		Behavior : 

	Object : Payment
		State : amount
		Behavior : 
	*/
class Tourist{
	String name,telephone;
	public void openBookingApp(Airbnb airbnb) {}
	public Host chooseDesiredHost(Host[] hosts) {return new Host();}
	public boolean checkAvaiablity(Host host, Date date, int night) {return true;}
	public void sendReservationRequest(Host host) {}
	public Payment makePayment(Reservation reserve) {return new Payment();}
}

class Airbnb{
	Host[] hosts;
	public Host[] displayHosts() {return hosts;}
	public Reservation createReservation(Tourist tourist, Host host, Date checkindate, int nights, double total, boolean ifPaid) {return null;}
	public void acceptMoney(Payment money, Tourist tourist) {}
}

class Host{
	String name,address,telephone;
	double price;
	public void approveRequest(Tourist tourist) {}
}

class Reservation{
	Tourist tourist;
	Host host;
	Date checkInDate;
	int night;
	double total;
	boolean ifPaid;
}

class Payment{
	double amount;
}

public class BookingAirbnb {

	public static void main(String[] args) {
		Host belltown=new Host();
			belltown.name="Belltown Inn";belltown.address="2301 3rd Ave";belltown.telephone="2039483772";belltown.price=150.00;
		Airbnb airbnb=new Airbnb();airbnb.hosts=new Host[]{belltown};
		Tourist zac=new Tourist();
			zac.name="Zeyuan Li";zac.telephone="2073928172";
		//Zac books a house on Airbnb
		zac.openBookingApp(airbnb);
		Host[] hosts=airbnb.displayHosts();
		Host host=zac.chooseDesiredHost(hosts);
		Date checkindate=new Date();
		int nights=3;
		boolean available=zac.checkAvaiablity(host,checkindate,nights);
		if(available){
			zac.sendReservationRequest(host);
			host.approveRequest(zac);
			Reservation reserve=airbnb.createReservation(zac,host,checkindate,nights,nights*host.price,false);
			Payment money=zac.makePayment(reserve);
			airbnb.acceptMoney(money,zac);
		}
	}
}
