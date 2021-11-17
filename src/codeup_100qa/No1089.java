package codeup_100qa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// 입력 예제
// 시작 값 /등차의 값 / 출력할 n번째 수
// 1 3 5
public class No1089 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String inputText[]=scan.readLine().split(" ");
		int inputNum[]=new int[inputText.length];
		
		for(int i=0; i<inputText.length; i++)
			inputNum[i]=Integer.parseInt(inputText[i]);
		
		System.out.println(inputNum[0]+inputNum[1]*(inputNum[2]-1));
	}
}
