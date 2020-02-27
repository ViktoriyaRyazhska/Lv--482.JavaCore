package hw10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class task10_4 {

	static int max = 0;
	static int k;
	
	public static void main(String[] args) {
		String fileName = "D:\\Віталя\\IT\\file1.txt";
		String fileName2 = "D:\\Віталя\\IT\\file2.txt";
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		List<String> list = new ArrayList();
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			String s = null;
			int count = 0;
			
			System.out.println("Read data from file: " + fileName);
			System.out.println();
			while ((s = br.readLine()) != null) {
				list.add(s);
				System.out.println("row " + ++count + " read:" + s);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			fw = new FileWriter(fileName2);
			bw = new BufferedWriter(fw);
			String data = "";
			String data2 = "";
			String data3 = "Vitalii Bondalietov. 27.10.1986";
			System.out.println();
			System.out.println("Write data to file: " + fileName2);
			for (int i = 0; i < list.size(); i++) {
				data = "There are " + list.size() + " rows in file2.";
				if (list.get(i).length() > max) {
					max = list.get(i).length();
					k = i;
				}
				data2 = "The longest row is row " + k + ", it's length: " + max;
			}
			bw.write(data);
			bw.write(data2);
			bw.write(data3);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
// I DON'T KNOW WHERE USE "\n"
	

}}
