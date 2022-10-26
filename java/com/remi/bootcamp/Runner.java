package com.remi.bootcamp;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person jon = new Person();
		jon.setName("New");
		jon.setAge(10);
		jon.setAddress("123 fake street");
		
		System.out.println(jon.toString());
		
		Person jonAgain = new Person("New", "123 fake street", 10);
		System.out.println(jon.equals(jonAgain));
	}

}
