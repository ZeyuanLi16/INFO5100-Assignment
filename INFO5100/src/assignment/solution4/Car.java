package assignment.solution4;

import java.util.Date;

/*
 * 4. Design and implement a class called Car. 
 * You need to create necessary attributes for this class, and method if needed
 * Define the Car constructor to initialize these values (in that order). 
 * Include getter and setter methods for all instance data.
 */

public class Car {
	private String licenseNo;
	private String engineNo;
	private String ownerName;
	private double salePrice;
	private Date enrollDate;
	private int seatCount;
	private String madeFactory;
	private String brand;
	private String fuelType;
	private String vehicleColour;
	private GasTank gastank;


	public Car(String licenseNo, String engineNo, String ownerName) {
		super();
		this.licenseNo = licenseNo;
		this.engineNo = engineNo;
		this.ownerName = ownerName;
	}

	public Car(String licenseNo, String engineNo, String ownerName, double salePrice, Date enrollDate, int seatCount,
			String madeFactory, String brand, String fuelType, String vehicleColour) {
		super();
		this.licenseNo = licenseNo;
		this.engineNo = engineNo;
		this.ownerName = ownerName;
		this.salePrice = salePrice;
		this.enrollDate = enrollDate;
		this.seatCount = seatCount;
		this.madeFactory = madeFactory;
		this.brand = brand;
		this.fuelType = fuelType;
		this.vehicleColour = vehicleColour;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public String getMadeFactory() {
		return madeFactory;
	}

	public void setMadeFactory(String madeFactory) {
		this.madeFactory = madeFactory;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getVehicleColour() {
		return vehicleColour;
	}

	public void setVehicleColour(String vehicleColour) {
		this.vehicleColour = vehicleColour;
	}

	public GasTank getGastank() {
		return gastank;
	}

	public void setGastank(GasTank gastank) {
		this.gastank = gastank;
	}

	

}
