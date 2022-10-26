package com.remi.bootcamp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide {
	public static double divide (int firstNum, int secondNum) throws DivideException, ArithmeticException, Exception{
		try { // Attempt to perform division
			// Need to cast to double to avoid rounding
			if(secondNum > firstNum) {
				throw new DivideException("Divisor must be smaller than dividend");
			}
			
			double answer = (double) firstNum / (double) secondNum; 
			return answer;
		} catch(ArithmeticException e) { // Thrown if dividing by zero
			System.err.println("Unable to divide by zero");
			e.printStackTrace();
			return 0;
		} catch (Exception e) { // Thrown for general exceptions
				System.err.println("Exception occured when attempting to divide integers");
				e.printStackTrace();
				return 0;
		}
	}
	public static void main(String[] args) throws ArithmeticException, Exception {
		Scanner scanner = new Scanner(System.in);
		
		try {
			// Attempt to call division method
			System.out.println("Please enter first number:");
			int firstNum = scanner.nextInt();
			System.out.println("Please enter second number:");
			int secondNum = scanner.nextInt();
			System.out.println("answer: " + Divide.divide(firstNum, secondNum));
		} catch (InputMismatchException e) { // Thrown if user doesn't enter integers
			System.err.println("Please enter two ints");
			e.printStackTrace();
		} finally {
			scanner.close();
			System.in.close();
		}
		
		

	}
		
}
