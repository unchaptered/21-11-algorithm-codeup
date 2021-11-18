package codeup_100qa;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
 * 합
 * 차
 * 곱
 * 몫
 * 나머지
 * 나눈값(f 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력)
 */
public class No1046 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String inputText[]=scan.readLine().split(" ");
		
		int inputNum[]=new int[inputText.length];
		for (int i=0; i<inputText.length; i++)
			inputNum[i]=Integer.parseInt(inputText[i]);
		
		float devide=(float)inputNum[0]/(float)inputNum[1];
		
		System.out.println((long)inputNum[0]+(long)inputNum[1]);
		System.out.println((long)inputNum[0]-(long)inputNum[1]);
		System.out.println((long)inputNum[0]*(long)inputNum[1]);
		System.out.println((long)inputNum[0]/(long)inputNum[1]);
		System.out.println((long)inputNum[0]%(long)inputNum[1]);
		System.out.printf("%.2f",devide);
	}
}