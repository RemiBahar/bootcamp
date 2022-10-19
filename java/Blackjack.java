

import java.util.Scanner;

public class Blackjack {
	public static int play(int firstNum, int secondNum) {
		if(firstNum <= 21 && secondNum <= 21) {
			return Math.max(firstNum, secondNum);
		} else if(firstNum > 21 && secondNum <= 21) {
			return secondNum;
		} else if(firstNum <= 21 && secondNum > 21) {
			return firstNum;
		} else {
			return 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("First number:");
		int firstNum = scan.nextInt();
		
		System.out.println("Second number:");
		int secondNum = scan.nextInt();

		System.out.println("Blackjack result: " + Blackjack.play(firstNum, secondNum));
		
		scan.close();
	}

}
