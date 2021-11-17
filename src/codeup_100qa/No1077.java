package codeup_100qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1077 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		int number=Integer.parseInt(scan.readLine());
		
		for(int i=0; i<=number; i++)
			System.out.println(i);
	}
}