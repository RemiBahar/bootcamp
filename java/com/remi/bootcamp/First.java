package com.remi.bootcamp;
import java.util.Scanner;

public class First {
	
	public static int add(int a, int b)    {
		return a + b;
	}
	
	public static void compareNumbers(int n, int m) {
	  if (n < m)
	    System.out.println(n + " is smaller");
	  else
	    System.out.println(m + " is smaller");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter first number: ");
		int first= scan.nextInt();

		System.out.println("Please enter second number: ");
		int second= scan.nextInt();

		// notice where the function is called
		System.out.println("Sum of " + first + " and " + second + " is "+ First.add(first, second));
		
		First.compareNumbers(first, second);
	}

}