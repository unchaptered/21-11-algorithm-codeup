package codeup_100qa;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
 * ��
 * ��
 * ��
 * ��
 * ������
 * ������(f �Ҽ��� ���� ��° �ڸ����� �ݿø��� ��° �ڸ����� ���)
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