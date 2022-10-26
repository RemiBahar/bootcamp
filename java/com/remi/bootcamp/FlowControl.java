package com.remi.bootcamp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControl {
	public static double addMultiply(double firstNum, double secondNum, boolean bool) {
		if(bool) {
			return firstNum + secondNum;
		} else {
			return firstNum * secondNum;
		}
	}
	
	public static void flowchart(double num) {
		if(num > 2000) {
			System.out.println("A");
			
			if(num > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				
				if(num > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		}
		else {
			System.out.println("1");
			
			if(num > 100) {
				System.out.println("3");
				
				if(num > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");
					
					if(num > 500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}
			} else {
				System.out.println("2");
			}
		}
	}
	
	public static int uniqueSum(List<Integer> nums) {
		 Map<Integer, Integer> map= new HashMap<Integer, Integer>();  
		 int sum = 0;
		 
		 for(int i=0; i < nums.size(); i++) {
			 if(!map.containsKey(nums.get(i))) {
				sum += nums.get(i);
				map.put(nums.get(i), i);
			 }
		 }
		
		return sum;
	}
	
	public static String fizzBuzz(int num) {
		if(num % 3 == 0 && num % 5 == 0) {
			return "FizzBuzz";
		} else if(num % 3 == 0) {
			return "Fizz";
		} else if(num % 5 == 0) {
			return "Buzz";
		} else {
			return String.valueOf(num);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addMultiply(2.6, 1.4, true));
		System.out.println(addMultiply(8, 2, false));
		
		flowchart(500);
		
		System.out.println("Blackjack: " + Blackjack.play(1, 22));
		
        List<Integer> nums = Arrays.asList(1, 5, 3); 
		System.out.println("sum: " + uniqueSum(nums));
		
		System.out.println(fizzBuzz(7));
	}

}
