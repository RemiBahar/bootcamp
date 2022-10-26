package com.remi.bootcamp;

import java.util.ArrayList;
import java.util.List;

public class AddDigits {
	public static int addDigits(int num) {
		String numString =  Integer.toString(num);
		
		int total = 0;
		
		for(int i=0; i < numString.length(); i++) {
			char digitChar = numString.charAt(i);
			int digit = Character.getNumericValue(digitChar);
			
			total += digit;
		}
		
		return total;
	}
	
	public static int addDigitsRecursive(int num) {
		int digit = num % 10;
		
		if(digit == 0) {
			return 0;
		} else {
			return digit + addDigitsRecursive(num/10);
		}
		
	}
	
	public static int factorial(int num) {
		if(num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}	
	}
	
	public static long[] fibonacci(int length) { 
		long[] fibonacci = new long[length];
	
		if(length >= 3) {
			fibonacci[0] = 0l;
			fibonacci[1] = 1l;
			
			for(int i = 2; i < length; i++) {
				fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
			}
		} else {
			for(int i = 0; i <= length; i++) {
				fibonacci[i] = (long) i;
			}
		}
		
		return fibonacci;
		
	}
	
	public static double sum(double[] array) {
		float total = 0;
				
		for(double elem : array) {
			total += elem;
		}
		
		return total;
	}
	
	public static int elementIndex(double[] array, double elem) {
		for(int i=0; i < array.length; i++) {
			if(array[i] == elem) {
				return i;
			} 
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addDigits(999));
		
		System.out.println(addDigitsRecursive(999));
		
		System.out.println(factorial(5));
		
		int n = 10000; // 10000
		System.out.println("fib : " + fibonacci(n)[n - 1]);
		
		double arr[] = { 1, 3, 4, 5, 7, 9, 11, 100 }; 
		System.out.println(sum(arr));
		
		System.out.println(elementIndex(arr, 11));
	}

}