package codeup_100qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 풀려있는 코드를 보려면 No1078_2.java 확인 O(1)
public class No1078_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(scan.readLine());
		
		if (num%2==1)
			num--;
		
		int sum=((num*(num+1)/2)+(num/2))/2;
		
		System.out.println(sum);
	}
}