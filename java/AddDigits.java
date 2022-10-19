

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addDigits(999));
	}

}