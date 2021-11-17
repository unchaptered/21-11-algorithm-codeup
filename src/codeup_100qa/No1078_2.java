package codeup_100qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 깔끔하게 정리된 코드를 보려면 No1078_3.java 확인 O(1)
public class No1078_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(scan.readLine());
		
		if (num%2==1)
			num--;
		
		// 1 부터 n 까지의 합 n(n+1)/2
		int a=num*(num+1)/2;
		// num 이 짝수일 때, 1부터 num까지 짝수의 합과 홀수의 차이
		int b=num/2;
		int sum=(a+b)/2;
		
		System.out.println(sum);
	}
}