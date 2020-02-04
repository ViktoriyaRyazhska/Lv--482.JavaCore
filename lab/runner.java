package Practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class runner {
	public static void main(String[] args) throws IOException {
		Departments dep;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Employee[] emp = new Employee[2];
		for(int i =0;i<emp.length;i++) {
			emp[i]=new Employee();
		}
		
		for(int i =0;i<emp.length;i++) {
			emp[i].Input(br);
		}
		
		for(int i =0;i<emp.length;i++) {
			System.out.print(emp[i]);
		}
	}

}
