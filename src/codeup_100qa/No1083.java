package codeup_100qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1083 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		int number=Integer.parseInt(scan.readLine());
		
		for (int i=1; i<=number; i++) {
			if(i%3==0) {
				System.out.println("X");
			} else {
				System.out.println(i);
			}
		}
	}
}