package codeup_100qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1065_3_if {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String inputText = scan.readLine();
		String inputArr[]=inputText.split(" ");
		
//		3���� ��ҿ� ���ؼ� 3���� ���ǹ��� �Ǻ� ���� O(n) : foreach ��
		for(String element : inputArr)
			if(Integer.parseInt(element)%2==0)
				System.out.println(element);
	}
}