package com.remi.bootcamp;

public class DivideException extends Exception{
	 public DivideException(String errorMessage) {
	        super(errorMessage);
	 }
	 
	 public DivideException(String errorMessage, Throwable err) {
		 super(errorMessage, err);
	 }

}