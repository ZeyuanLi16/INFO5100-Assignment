package assignment.solution6;

import java.sql.Date;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Pet p=new Pet("name","name2","black");
			p.setSex(3);
			System.out.println(p.toString());
			Pet c=new Cat("name","name2","black", "short");
			c.setSex(3);
			System.out.println(c.toString());
			System.out.println(c.getClass());
			
			Date afert=new Date(1234,12,12);
			Date aaa=new Date(1234,12,12);
			System.out.println(aaa.after(afert));
}

}
