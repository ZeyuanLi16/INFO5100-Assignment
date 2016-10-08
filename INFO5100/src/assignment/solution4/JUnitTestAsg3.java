package assignment.solution4;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;



//Write JUnitTest for all the problems in assignemnt3.


public class JUnitTestAsg3 {


	@Test
	public void findPowerOfThree() {
		Assignment3 test = new Assignment3();
		int[] expected = new int[]{1,3,9,27};
		int[] output = test.findPowerOfThree(4);
		Assert.assertArrayEquals(expected, output);	
		}
	@Test
	public void countDigits() {
		Assignment3 test = new Assignment3();
		int expected = 1;
		int output = test.countDigits(100);
		Assert.assertEquals(expected, output);	
		}
	@Test
	public void printNumbers() {
		Assignment3 test = new Assignment3();
		
		
		ByteArrayOutputStream baoStream = new ByteArrayOutputStream(1024);
        // cache stream
        PrintStream cacheStream = new PrintStream(baoStream);
 
        System.setOut(cacheStream);
        
        test.printNumbers(4);
        String output = baoStream.toString();
		String expected = "0 2 4 6 ";
		
		Assert.assertEquals(expected, output);	
		}
	@Test
	public void generatePascalsTriangle() {
		Assignment3 test = new Assignment3();
		int[][] expected = new int[][]{
				{1,0,0,0},
				{1,1,0,0},
				{1,2,1,0},
				{1,3,3,1}};
		int[][] output = test.generatePascalsTriangle(4);
		Assert.assertArrayEquals(expected, output);	
		}
	@Test
	public void reverseVowels() {
		Assignment3 test = new Assignment3();
		String expected = "holle";
		String output = test.reverseVowels("hello");
		Assert.assertEquals(expected, output);	
		}
	@Test
	public void lengthOfLastWord() {
		Assignment3 test = new Assignment3();
		int expected = 7;
		int output = test.lengthOfLastWord("I Love Seattle");
		Assert.assertEquals(expected, output);	
		}
	@Test
	public void reverseString2() {
		Assignment3 test = new Assignment3();
		String expected = "Seattle Love I";
		String output = test.reverseString2("I Love Seattle");
		Assert.assertEquals(expected, output);	
		}
	@Test
	public void checkMessage() {
		Assignment3 test = new Assignment3();
		int expected = 2;
		int output = test.checkMessage("SOSSUSSOP");
		Assert.assertEquals(expected, output);	

	}
}
