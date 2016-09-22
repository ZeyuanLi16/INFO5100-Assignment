package assignment.solution2;
/**
 * Assignment for your lecture 2. Please finish all the questions under
 * 'Assignment'. Please try the two questions under 'Bonus'. Please write some
 * tests as practice. When you are writing tests, you should think about what
 * situations might cause error? like 0,-1... The deadline of this assignment is
 * 09/22/2016 23:59. Please feel free to contact me for any questions.
 * 
 * @author Jia
 */

class Person {
	int age;
	boolean gender;// false --> male, true --> female

	Person(int age, boolean gender) {
		this.age = age;
		this.gender = gender;
	}
}

public class Assignment2 {
	// Assignment
	/**
	 * Write a Computer program to find the type of a person and print the type.
	 * Infant : If the age is less than 1 year 
	 * Toddler : If the age is less than 3 and greater than 1 
	 * Pre Schooler : If the age is less than 5 and greater than 3 
	 * KG Girl : If the age is greater than 5 and less than 6 and the gender is female 
	 * KG Boy : If the age is greater than 5 and less than 6 and the gender is male
	 */
	public void personType(Person person) {
		if(person.age <= 1)
			System.out.println("Infant");
		else if(person.age > 1 && person.age <= 3)
			System.out.println("Toddler");
		else if(person.age > 3 && person.age <= 5)
			System.out.println("Pre Schooler");
		else if(person.age > 5 && person.age <= 6 && person.gender==true)
			System.out.println("KG Girl");
		else if(person.age > 5 && person.age <= 6 && person.gender==false)
			System.out.println("KG Boy");
		else
			System.out.println("Please input right person");
			
	}

	/**
	 * Given an integer N as input, check the following: 
	 * If N is odd, print "Weird". 
	 * If N is even and, in between the range of 2 and 5(inclusive), print "Not Weird". 
	 * If N is even and, in between the range of 6 and 20(inclusive), print "Weird". 
	 * If N is even and N>20, print "Not Weird".
	 */
	public void weirdNumber(int n) {
		if(n%2!=0||n==0)
			System.out.println("Weird");
		else if (n <= 5 && n >=2)
			System.out.println("Not Weird");
		else if (n <= 20 && n >= 6)
			System.out.println("Weird");
		else if (n > 20 )
			System.out.println("Not Weird");
		else 
			System.out.println("Please input integer");

	}

	/**
	 * Write a method to determine whether a number is prime
	 */
	public void isPrime(int n) {
		if(n <= 2 || n%2==0){
			System.out.println(" n is not prime");
			return;
		}
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				System.out.println(" n is not prime");
				return;
			}
			else {
				System.out.println(" n is prime");
				return;
			}
		}
	}

	/**
	 * Find N fibonacci numbers Fibonacci Number: f(N) = f(N-1)+f(N-2).
	 * Typically, f(0)=f(1)=1.
	 */
	public int[] fibonacciNumber(int n) {
		int fib[] = new int[n];
		fib[0] = fib[1] = 1;
		for (int i = 2; i < fib.length; i++) 
			fib[i] = fib[i - 1] + fib[i - 2]; 
		return fib;
	}

	/**
	 * Write a function that takes a string as input and returns the string
	 * reversed. Given s = "hello", return "olleh".
	 */
	public String reverseString(String s) {
		int n = s.length();
		String reversed = "";
		for (int i = 0; i < n; i++)
			reversed = s.charAt(i) + reversed;
		return reversed;
	}

	/**
	 * Given an array of nums, write a function to find the largest two integer.
	 */
	public int[] findTheLargestTwo(int[] nums) {
		if(nums.length<2){
			System.out.println("-----Please input an array that has more than two integer----");
			return null;
		}
		int a,b;
		if(nums[0]>nums[1]){
			a=nums[0];
			b=nums[1];
		}else {
			b=nums[0];
			a=nums[1];
		}
		for (int i=2;i<nums.length;i++){
			if(nums[i]>a){
				b=a;
				a=nums[i];
				continue;
			}else if(nums[i]>b){
				b=nums[i];
				continue;
			}
		}
		return new int[]{a,b};
	}

	/**
	 * Given an array nums, write a function to move all 0's to the end of it
	 * while maintaining the relative order of the non-zero elements. For
	 * example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
	 * should be [1, 3, 12, 0, 0].
	 */
	public void moveZeroes(int[] nums) {
		if(nums.length==0){
			System.out.println("-----Please input an array that has integer----");
			return;
		}
		int flag=0;
		int zeros=0;
		for (int i=0;i<nums.length;i++){
			if(nums[i]==0)
				zeros++;
			else if(nums[i]!=0){
				if(zeros!=0){
					nums[flag]=nums[i];
					nums[i]=0;
				}
				flag++;
			}
		}
		return ;

	}

	// Bonus
	/**
	 * Given a non-negative integer n, repeatedly add all its digits until the
	 * result has only one digit. For example: Given n = 38, the process is
	 * like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
	 */
	public int addDigits(int n) {
		if(n<0){
			System.out.println("-----Please input an non-negative integer----");
			return 0;
		}
		int digitSum=0;
		int length=String.valueOf(n).length();
		while (length!=1){
			digitSum=0;
			for(int i =0;i<length;i++){
				digitSum=digitSum+(int) (n/Math.pow(10, i)%10);
			}
			n=digitSum;
			length=String.valueOf(digitSum).length();
		}
		return digitSum;
	}

	/**
	 * Write a program to check whether a given number is an ugly number. Ugly
	 * numbers are positive numbers whose prime factors only include 2, 3, 5.
	 * For example, 6, 8 are ugly, while 14 is not ugly since it includes
	 * another prime factor 7. Note that 1 is typically treated as an ugly
	 * number.
	 */
	public boolean isUgly(int n) {
		if(n<1){
			System.out.println("-----Please input an positive integer----");
			return false;
		}
		int number=n;
		int flag=0;
		while(flag==0&&number!=1){
			flag=number%2;
			if(flag==0)
				number=number/2;
		}
		flag=0;
		while(flag==0&&number!=1){
			flag=number%3;
			if(flag==0)
				number=number/3;
		}
		flag=0;
		while(flag==0&&number!=1){
			flag=number%5;
			if(flag==0)
				number=number/5;
		}
		if(number==1)
			return true;
		else 
			return false;
	}

}
