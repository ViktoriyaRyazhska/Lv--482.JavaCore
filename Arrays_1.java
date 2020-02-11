
public class Arrays_1 {
	private int[] numbers = {15, -7, 16, 24, 1, -72, 14, 4, 61, 2};

	public void task1() {
		int max = numbers[0];
		int i = 0;
		while (i < numbers.length) {
			if (numbers[i] > max) {
				max = numbers[i];
				}
			i++;
		}
		System.out.println("The biggest number is: " + max);
	}

	public void task2() {
		int sum = 0;
			for (int i = 0; i <= 9; i++) {
				if (numbers[i] > 0) {
					sum += numbers[i];
					}
			}
			System.out.println("Sum of positive numbers is: " + sum);
	
	}

	public void task3() {
		int amount = 0;
		for (int a : numbers) {
			if (a < 0) {
				amount++;
			}
		}
		    System.out.println("Amount of negative numbers is: " + amount);
	}
	
	public void task4() {
		int amountPositive = 0;
		int amountNegative = 0;
		for (int a : numbers) {
			if (a > 0) {
				amountPositive++;
			}
			else
			if (a < 0) {
				amountNegative++;
			}
		}
		if (amountPositive > amountNegative) {
			System.out.println("There are more positive numbers.");
		}
		else
			if (amountPositive < amountNegative) {
				System.out.println("There are more negative numbers.");
			}
			else System.out.println("There are the same positive and negative numbers.");
	}
	
	public static void main(String[] args) {
		Arrays_1 appl = new Arrays_1();
		appl.task1();
		appl.task2();
		appl.task3();
		appl.task4();
	}

}
