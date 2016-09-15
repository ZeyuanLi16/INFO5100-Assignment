package assignment.solution1;

/*Example : Drive home

Description : A student is driving home from school.

Objects (with Behaviors and State): 
	Object : Driver
		State : name
		Behavior : leaveSchool(), checkCarStatus(), startEngine(), setNavigation(), takeDetour(), stopCarWaitforSignal(), driveForward(), stopAndPark()

	Object : Car
		State : safeStatus, fuelTank
		Behavior :getSafeStatue(), getFuelTank()

	Object : Road
		State : redLight, roadClosed, accident, stopSign
		Behavior : 

	Object : Home
		State : address
		Behavior : 

	Object : School
		State : address
		Behavior : 
	*/

class Driver{
	String name;
	public void leaveSchool() {}
	public void checkCarStatus() {}
	public void startEngine() {}
	public Road[] setNavigation(String homeaddress, String schooladdress) {return null;}
	public void takeDetour() {}
	public void stopCarWaitforSignal() {}
	public void driveForward() {}
	public void stopAndPark() {}
}

class Car{
	boolean safeStatus;
	double fuelTank;
	public boolean getSafeStatue() {return safeStatus;}
	public double getFuelTank() {return fuelTank;}
}

class Road{
	boolean redLight, roadClosed, accident, stopSign;
}

class Home{
	String address;
}

class School{
	String address;
}
public class DriveHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver zac=new Driver();zac.name="Zeyuan Li";
		Home home=new Home();home.address="U District";
		School school=new School();school.address="401 Terry Ave";
		Car car=new Car();car.fuelTank=1;car.safeStatus=true;
		//zac is ready to drive home from school
		zac.leaveSchool();
		zac.checkCarStatus();
		boolean safestatus=car.getSafeStatue();
		double fueltank=car.getFuelTank();
		if(safestatus==true&&fueltank>0.25){
			zac.startEngine();
			Road[] roads=zac.setNavigation(home.address,school.address);
			for(int i=0;i<roads.length;i++){
				if(roads[i].redLight||roads[i].stopSign)
					zac.stopCarWaitforSignal();
				if(roads[i].roadClosed||roads[i].accident)
					zac.takeDetour();
				zac.driveForward();
			}
			zac.stopAndPark();
		}
	}

}
