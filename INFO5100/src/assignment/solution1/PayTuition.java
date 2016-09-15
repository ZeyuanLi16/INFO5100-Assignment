package assignment.solution1;

/*Example : Pay tuition

Description : A student wants to pay his tuition through myNEU account.

Objects (with Behaviors and State): 
	Object : Student
		State : nuid, username, password
		Behavior : loginWebsite(), checkBill(), checkBillPage(), makeAPayment(), logout()

	Object : Myneu
		State : collection of students
		Behavior : confirmLogin(), displayBillInfo(), queryBillStatus()

	Object : Bill
		State : nuid, tuition, ifpaid
		Behavior : 

	Object : BankAccount
		State : accountNo, balance
		Behavior : createTransaction()
	*/

class Student{
	String username;
	String password;
	BankAccount bankaccount;
	public void loginWebsite(String username2, String password2, Myneu myneu) {}
	public void checkBill() {}
	public void checkBillPage() {}
	public void makeAPayment(Double tuition) {}
	public void logout() {}

}

class Myneu{
	Student[] students;
	Bill[] bills;
	public boolean confirmLogin(String username, String password) {return true;}
	public void displayBillInfo(Bill bill) {}
	public Bill queryBillStatus(Student student) {return null;}
}

class Bill{
	Student student;
	Double tuition;
	boolean ifpaid;
}

class BankAccount{
	String accountNo;
	Double balance;
	public void createTransaction() {	}

}
public class PayTuition {

	public static void main(String[] args) {
		BankAccount account=new BankAccount(); 
			account.accountNo="654321";account.balance=20000.00;
		Student zac=new Student();
			zac.username="ZacLi";zac.password="123123";zac.bankaccount=account;
		Bill bill=new Bill();
			bill.student=zac;bill.ifpaid=false;bill.tuition=15548.00;
		Myneu myneu=new Myneu();
			myneu.students=new Student[]{zac};myneu.bills=new Bill[]{bill};
			
		//Zac start to pay tuition on myneu
		zac.loginWebsite("ZacLi","123123",myneu);
		boolean login=myneu.confirmLogin("ZacLi","123123");
		if(login){
			zac.checkBillPage();
			bill=myneu.queryBillStatus(zac);
			myneu.displayBillInfo(bill);
			if(!bill.ifpaid){
				zac.makeAPayment(bill.tuition);
				zac.bankaccount.createTransaction();
				zac.bankaccount.balance=zac.bankaccount.balance-bill.tuition;
				bill.ifpaid=true;
				myneu.displayBillInfo(bill);
			}
			zac.logout();
		}
		
	}

}
