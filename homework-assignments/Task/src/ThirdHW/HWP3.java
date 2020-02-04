package ThirdHW;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HWP3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HTTPErrors httperror;
		int code;
		System.out.println("Please enter your error-code");
		code = Integer.parseInt(br.readLine());
		switch(code) {
			case 400: case 401: case 402: case 403: case 404:
				httperror=HTTPErrors.ClientErrors;
				System.out.println(httperror);
				break;
			case 100: case 101: case 102: case 103:
				httperror=HTTPErrors.InformationalResponse;
				System.out.println(httperror);
				break;
			case 200: case 202:  case 203:
				httperror=HTTPErrors.Success;
				System.out.println(httperror);
				break;
			case 301: case 302: case 303:
				httperror=HTTPErrors.Redirection;
				System.out.println(httperror);
				break;
			case 501: case 502: case 503:
				httperror=HTTPErrors.ServerErrors;
				System.out.println(httperror);
				break;
			default:
				System.out.println("uknown error");
				System.exit(0);
			
		}
	}

}
