package assignment.solution4;

/*
 * 
 * 3. Write a class named GasTank containing:
 * An instance variable named amount of type double, initialized to 0.
 * 	A method named addGas that accepts a parameter of type double . 
 * The value of the amount instance variable is increased by the value of the parameter.
 * 	A method named useGas that accepts a parameter of type double . 
 * The value of the amount instance variable is decreased by the value of the parameter.
 * A method named getGasLevel that accepts no parameters. getGasLevel returns the value of the amount instance variable.
 * 
 */
public class GasTank {
	double amount =0;
	
	void addGas(double gas){
		this.amount=this.amount+gas;
	}
	
	void useGas(double gas){
		this.amount=this.amount-gas;
	}	
	
	double getGasLevel(){
		return this.amount;
	}
}
