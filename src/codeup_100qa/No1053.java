package codeup_100qa;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1053 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		byte inputNum=Byte.parseByte(scan.readLine());
		if(inputNum==0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}