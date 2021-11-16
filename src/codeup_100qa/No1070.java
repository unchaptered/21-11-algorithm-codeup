package codeup_100qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1070 {
	public enum Season{
		winter, spring, summer, fall
	}
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String inputText=scan.readLine();
		int season=Integer.parseInt(inputText);
		
		if ((season==12) || (season==1) || (season==2)) {
			System.out.println(Season.winter);
		} else if ((season==3) || (season==4) || (season==5)) {
			System.out.println(Season.spring);
		} else if ((season==6) || (season==7) || (season==8)) {
			System.out.println(Season.summer);
		} else if ((season==9) || (season==10) || (season==11)) {
			System.out.println(Season.fall);
		}
	}
}
