package codeup_100qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ����ϰ� ������ �ڵ带 ������ No1078_3.java Ȯ�� O(1)
public class No1078_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(scan.readLine());
		
		if (num%2==1)
			num--;
		
		// 1 ���� n ������ �� n(n+1)/2
		int a=num*(num+1)/2;
		// num �� ¦���� ��, 1���� num���� ¦���� �հ� Ȧ���� ����
		int b=num/2;
		int sum=(a+b)/2;
		
		System.out.println(sum);
	}
}