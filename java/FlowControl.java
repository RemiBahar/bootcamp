

public class FlowControl {
	public static double addMultiply(double firstNum, double secondNum, boolean bool) {
		if(bool) {
			return firstNum + secondNum;
		} else {
			return firstNum * secondNum;
		}
	}
	
	public static void flowchart(double num) {
		if(num > 2000) {
			System.out.println("A");
			
			if(num > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				
				if(num > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		}
		else {
			System.out.println("1");
			
			if(num > 100) {
				System.out.println("3");
				
				if(num > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");
					
					if(num > 500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}
			} else {
				System.out.println("2");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addMultiply(2.6, 1.4, true));
		System.out.println(addMultiply(8, 2, false));
		
		flowchart(500);
		
		System.out.println("Blackjack: " + Blackjack.play(1, 22));
		
		
	}

}
