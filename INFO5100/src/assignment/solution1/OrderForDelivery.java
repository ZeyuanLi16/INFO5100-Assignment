package assignment.solution1;

/*Example : Order for delivery

Description : A consumer is going to order a delivery through phone calls.

Objects (with Behaviors and State): 
	Object : Customer
		State : name, address
		Behavior : openDeliveryApp(), chooseResaurant(), orderFood(), confirmOrder(), payOrder()
		
	Object : UberEATS
		State : Collection of restaurant
		Behavior : displayNearRestaurant(), displayAllFood(), createOrder()
		 
	Object : Restaurant
		State : name, collection of food, location
		Behavior : prepareFoodnDelivery(), acceptOrder()

	Object : Food
		State : name, price, amount
		Behavior : 

	Object : Order
		State : Customer, restaurant, collection of food, total, ifPaid
		Behavior : 
	*/
class Customer{
	String name,address;
	public void openDeliveryApp(UberEATS ubereats) {}
	public Restaurant chooseResaurant(Restaurant[] restaurantList) {return null;}
	public Food orderFood(String foodname, int amount) {return null;}
	public void confirmOrder() {}
	public boolean payOrder() {return false;}
}

class UberEATS{
	Restaurant[] resaurant;
	public Restaurant[] displayNearRestaurant() {return resaurant;}
	public Food[] displayAllFood(Restaurant restaurant) {return null;}
	public Order createOrder(Customer name, Restaurant restaurant, Food[] foodOrderlist, double total, boolean ifpaid) {return null;}
}

class Restaurant{
	String name,location;
	Food[] food;
	public void prepareFoodnDelivery() {}
	public void acceptOrder(Order order) {}
}

class Food{
	String name;
	double price;
	int amount;
}

class Order{
	Customer customer;
	Restaurant restaurant;
	Food[] food;
	double total;
	boolean ifpaid;
}
public class OrderForDelivery {

	public static void main(String[] args) {
		Food burger=new Food();
			burger.name="The Classic MAC";burger.price=12.99;
		Food pizza =new Food();
			pizza.name="The New Mexican";pizza.price=15.99;
		Restaurant lunchbox=new Restaurant();
			lunchbox.name="Lunchbox Laboratory";lunchbox.location="1253 Thomas St";lunchbox.food=new Food[]{burger,pizza};
		UberEATS ubereats=new UberEATS();
			ubereats.resaurant=new Restaurant[]{lunchbox};
		Customer zac=new Customer();
			zac.name="Zeyuan Li";zac.address="401 Terry Ave";
		//Zac starts to order a delivery on UberEATS
		zac.openDeliveryApp(ubereats);
		Restaurant[] restaurantList=ubereats.displayNearRestaurant();
		Restaurant rest=zac.chooseResaurant(restaurantList);
		Food[] foodlist=ubereats.displayAllFood(rest);
		Food food1=zac.orderFood("The Classic MAC",2);
		Food food2=zac.orderFood("The New Mexican",1);
		zac.confirmOrder();
		Food[] foodOrderlist=new Food[]{food1,food2};
		double total=food1.price*food1.amount+food2.price*food2.amount;
		Order order=ubereats.createOrder(zac,rest,foodOrderlist,total,false);
		rest.acceptOrder(order);
		order.ifpaid=zac.payOrder();
		if(order.ifpaid)
			rest.prepareFoodnDelivery();
	}

}
