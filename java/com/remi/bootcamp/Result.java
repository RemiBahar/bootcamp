package com.remi.bootcamp;

public class Result {
	// Fields
	int physics;
	int chemistry;
	int biology;
	int maxMarks;
	
	// Constructor
	public Result(int _physics, int _chemistry, int _biology, int _maxMarks) {
		physics = _physics;
		chemistry = _chemistry;
		biology = _biology;
		maxMarks = _maxMarks;
	}
	
	// Methods
	public void displayResults() {
		System.out.println("Physics: " + physics);
		System.out.println("Chemistry: " + chemistry);
		System.out.println("Biology: " + biology);
		
		int total = physics + chemistry + biology;
		System.out.println("Total: " +  total);
	}
	
	public void displayPercentage() {
		int total = physics + chemistry + biology;
		float percentage = (float) total/(maxMarks * 3) * 100;
		
		System.out.println("Percentage " + percentage + "%");
	}
	
	@Override
	public boolean equals(Object o) {
		// Check if o is a copy of original object
		if(o == this) {
			return true;
		}
		
		// Check if o has the same type
		if(!(o instanceof Result)) {
			return false;
		}
		
		// Compare object fields
		Result result = (Result) o;
		
		return this.biology == result.biology
				&& this.chemistry == result.chemistry
				&& this.physics == result.physics
				&& this.maxMarks == result.maxMarks;
	}
	
	// Main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = new Result(100, 110, 90, 150);
		result.displayResults();
		result.displayPercentage();
		
		Result result2 = new Result(100, 110, 90, 150);
		
		System.out.println(result.equals(result2));

	}

}
