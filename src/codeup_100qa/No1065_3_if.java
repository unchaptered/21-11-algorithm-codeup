package codeup_100qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1065_3_if {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String inputText = scan.readLine();
		String inputArr[]=inputText.split(" ");
		
//		3개의 요소에 대해서 3번의 조건문을 판별 따라서 O(n) : foreach 문
		for(String element : inputArr)
			if(Integer.parseInt(element)%2==0)
				System.out.println(element);
	}
}