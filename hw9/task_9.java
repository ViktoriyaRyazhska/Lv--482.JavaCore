package hw9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_9 {

	public double div(double x, double y) throws MyException {
		if (y == 0) {
			throw new MyException("Please enter any number except 0!");
		} else
			return x / y;
	}
	
	public int readNumber(int a) throws MyException2 {
				if (a > 1 && a < 100) {
				return a;
			}
			else throw new MyException2("This number is out of the range!");
				}
	
	public static void main(String[] args) throws NumberFormatException, IOException, MyException, MyException2 {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers:");
		double x = 0, y = 0;
		int a = 0;
		
		try {
			x = Double.parseDouble(reader.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
		try {
			y = Double.parseDouble(reader.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
		task_9 task = new task_9();
				
		try {
			System.out.println(task.div(x, y));
		} catch (MyException e) {
			e.printStackTrace();
		}
		
		System.out.println("Enter ten numbers:");
		for (int i = 0; i < 10; i++) {
			try {
			a = Integer.parseInt(reader.readLine());
			System.out.println(task.readNumber(a));
			} catch (MyException2 e) {
				e.printStackTrace();
			}
		}
		
	}

}
