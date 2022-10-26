package com.remi.bootcamp;

import java.util.Scanner;

public class KeyboardInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in); // reference
        double pi = 3.14; // primitive
        System.out.println("Please enter radius "); // reference
        
        try {
	        int radius = scan.nextInt(); // primitive
	        double area = pi * radius * radius; // primitive
	
	        System.out.println("Area is " + area); // reference
        } catch(Exception e) {
        	System.out.println("Invalid radius entered");
        	
        }
	    
	}

}
