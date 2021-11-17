package codeup_100qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1080 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		int number=Integer.parseInt(scan.readLine());
		int count=0;

		for (int i=0; i<number; i++) {
			count+=i;
			if (count>=number) {
				System.out.println(i);
				break;
			}
		}
	}
}