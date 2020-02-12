package Hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HWP3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
		System.out.println("Enter the number of HTTP Error: ");
		int error = Integer.parseInt(br.readLine());
		switch (error) {
		case 400:
			System.out.println("Name of error is Bad Request");
			break;
		case 401:
			System.out.println("Name of error is Unauthorized");
			break;
		case 402:
			System.out.println("Name of error is Payment Required");
			break;
		case 403:
			System.out.println("Name of error is Forbidden");
			break;
		case 404:
			System.out.println("Name of error is Not Found");
			break;
		case 405:
			System.out.println("Name of error is Method Not Allowed");
			break;
		case 406:
			System.out.println("Name of error is Not Acceptable");
			break;
		case 407:
			System.out.println("Name of error is Proxy Authentication Required");
			break;
		case 408:
			System.out.println("Name of error is Request Timeout");
			break;
		case 409:
			System.out.println("Name of error is Conflict");
			break;
		case 410:
			System.out.println("Name of error is Gone");
			break;
		default:
			System.out.println("Wrong number,try again");
			break;
		}
	}
}
