package com.remi.bootcamp;

public class Person {
	// Fields
	private String name;
	private String address;
	private int age;
	
	// Name
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	// Address
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	// Age
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	// Constructor
	Person(){	
	}
	
	Person(String name, String address, int age){
		setName(name);
		setAddress(address);
		setAge(age);
	}
	
	// To String
	@Override 
	public String toString() {
		return "name: " + this.name
			+  " age: " + this.age
			+  " address: " + this.address;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		}
		
		if(!(o instanceof Person)) {
			return false;
		}
		
		Person person = (Person) o;
		
		return person.name == this.name 
				&& person.address == this.address
				&& person.age == this.age;
	}
	
	// Runner
	public static void main(String[] args) {
		Person jon = new Person();
		jon.name = "New";
		jon.age = 10;
		jon.address = "123 fake street";
		
		Person jonAgain = new Person("New", "123 fake street", 10);
		System.out.println(jon.equals(jonAgain));
	}
}