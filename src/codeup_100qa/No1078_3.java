package codeup_100qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Ǯ���ִ� �ڵ带 ������ No1078_2.java Ȯ�� O(1)
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