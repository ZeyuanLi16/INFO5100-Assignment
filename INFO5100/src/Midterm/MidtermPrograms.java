package Midterm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MidtermPrograms {

//	1)	Say you have Given a string which consists of lowercase or uppercase letters, find the length of 
//	the longest palindromes that can be built with those letters.
//	This is case sensitive, for example "Aa" is not considered a palindrome here.
	public int longestPalindrome(String s) {

		Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) set.remove(c);
            else set.add(c);
        }

        int odd = set.size();
        return s.length() - (odd == 0 ? 0 : odd - 1);
	}

//	2)	an array for which the ith element is the price of a given stock on day i. Design an algorithm to 
//	find the maximum profit. You may complete as many transactions as you like (ie, buy one and sell one 
//	share of the stock multiple times). However, you may not engage in multiple transactions at the 
//	same time (ie, you must sell the stock before you buy again).
	public int maxProfit(int[] prices) {

		 if(prices==null||prices.length<=1)
		        return 0;
		 int min=prices[0]; 
		 int result=0;
		 
		 for(int i=1; i<prices.length; i++){
	        result = Math.max(result, prices[i]-min);
	        min = Math.min(min, prices[i]);
		 }
		 
		 return result;
	}

//	3)	Given a column title as appear in an Excel sheet, return its corresponding column number.
//	For example: A -> 1, B -> 2, бн Z -> 26, AA -> 27, AB -> 28
	public int titleToNumber(String title) {
        int result = 0;
        title=title.toUpperCase();
        if (title == null || title.isEmpty()) 
            return result;

        char offset = 'A' - 1;
        
        for (int i = 0; i < title.length(); i++) {
            result = result * 26 + (title.charAt(i) - offset);
        }   
        return result;
	}


//	BONUS (15 points)
//	Given an unsorted array of integers(no duplicates), count the pairs in which there are two numbers 
//	and they add up to a specific target number. The array is given as follows:
//	For example:
//	Input: nums={2, 7, 11, 15}, target=9, there is one pair {2,7} so return: 1
//	Input: nums={2, 7, 11, 15}, target=10, there is no pair so return 0.
//	Input: nums={1,5,2,4,3,6}, target=7, there is are three pairs {1,6}, {2,5}, {3,4} so return 3.
//	Note: {1,2} and {2,1} are regarded as the same pair.
//	More-Bonus: If you can do it in O(N) time, you will get extra 5 points.
		public int twoSum(int[] nums, int target) {
	        if (nums == null || nums.length == 0) 
	        	return 0;
			int count=0;
			Map<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < nums.length; i++) {
		        map.put(nums[i], i);
		    }
		    for (int i = 0; i < nums.length; i++) {
		        int complement = target - nums[i];
		        if (map.containsKey(complement)) {
		        	count++;
		        }
		    }
		    return count/2;
		}

	
	
	
	
}
