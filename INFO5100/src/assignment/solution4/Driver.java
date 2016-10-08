package assignment.solution4;

import java.util.Date;

//5. Combine with problem 3 and 4, define a class named Driver that contains methods like drive and addGas 
//so that the driver can drive the car.

public class Driver {
	private String name;
	private String idNumber;
	private Date dateOfBirth;
	private String license;
	
	void driveCar(Car car, double distance){
		car.getGastank().useGas(distance*0.089);
	}
	
	void addGasr(Car car, double gas){
		car.getGastank().addGas(gas);
	}
	
	public Driver(String name, String idNumber, Date dateOfBirth, String license) {
		super();
		this.name = name;
		this.idNumber = idNumber;
		this.dateOfBirth = dateOfBirth;
		this.license = license;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getIdNumber() {
		return idNumber;
	}


	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getLicense() {
		return license;
	}


	public void setLicense(String license) {
		this.license = license;
	}
	
	
	
	
	
	
}
