package assignment.solution1;

/*Example : Shopping Online for Book

Description : A consumer is interested in buying a book on a online Website like Amazon

Objects (with Behaviors and State): 
	Object : Consumer
		State : name, address
		Behavior : visitWebsite(), findBooks(), placeOrderForBook(), payMoneyToWebsite()
	
	
	Object : ShoppingWebsite
		State : Collection of Books
		Behavior : displayAvailableBooks(), shipABookToConsumer(), acceptMoneyFromConsumer()
	
	Object : Book
		State : name, price, author
		Behavior : getPrice(), getName()
	
	Object : Money
		state : amount	*/

class Consumer{
	String name;
	String address;
	void visitWebsite(ShoppingWebsite sw){}
	Book findTheBookInterestedIn(Book books[]){
		return null;}
	void placeOrderForBook(Book book){}
	Money payMoneyToWebsite(ShoppingWebsite sw){
		return null;}
	
}

class ShoppingWebsite{
	Book[] books; //Array of Book
	Book[] displayAvailableBooks(){
		return books;}
	void shipABookToConsumer(Consumer c, Book b){}
	void acceptMoneyFromConsumer(Consumer c, Money money){}
			
}

class Book{
	String name, author;
	Float price;
	Float getPrice(){
		return price;}
	String getName(){
		return author;}

}

class Money{
	float amount;
}

class ShoppingOnline{
	public static void main(String args[]){
		ShoppingWebsite amazon = new ShoppingWebsite();

		Book headFirstJava = new Book();headFirstJava.name = "Head First Java";
		Book thinkingJava = new Book();thinkingJava.name = "Thinking In Java";
		
		Book[] books = {headFirstJava, thinkingJava};
		amazon.books=books;
		
		Consumer michael = new Consumer();
		michael.name = "Michael";
		
		michael.visitWebsite(amazon);
		Book[] books1 = amazon.displayAvailableBooks();
		Book book = michael.findTheBookInterestedIn(books1);
		michael.placeOrderForBook(book);
		Money money = michael.payMoneyToWebsite(amazon);
		amazon.acceptMoneyFromConsumer(michael, money);
	}

}

