package edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//First task
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		float[] Value = new float[3];
		for (int i = 0 ;i < 3;i++)
		{
			System.out.println("input float number");
			Value[i] = Float.parseFloat(br.readLine());
			if (Value[i] <=5 && Value[i] >= -5) 
			{
				System.out.println("Value[" + (i+1) + "] belong to the required range");
			}
			else {
				System.out.println("Value[" + (i+1) + "] doesn't belong to the range");
			}
		}
		
		//Second task
		int[] Val = new int[3];
		int max = Integer.MIN_VALUE; 
		int min = Integer.MAX_VALUE;
		System.out.println("input 3 int values");
		for(int i = 0; i < 3;i++)
		{
			Val[i] = Integer.parseInt(br.readLine());
			if (max < Val[i]) {
				max = Val[i];
			}
			if (min > Val[i]) {
				min = Val[i];
			}
		}
		System.out.println("max_value:" + max);
		System.out.println("min_value:" + min);
		//Third task
		System.out.println("Input the error code");
		int code = Integer.parseInt(br.readLine());
		httpError error;
		switch (code) {
		case 400:
			error = httpError.Bad_Request;
			break;
		case 401:
			error = httpError.Forbidden;
			break;
		case 402:
			error = httpError.Payment_Required;
		case 403:
			error = httpError.Unauthorized;
			break;
		default:
			error = httpError.Unknown;
		}
		System.out.println(error);
	}
}
