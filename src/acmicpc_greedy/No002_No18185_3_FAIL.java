package acmicpc_greedy;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/* 반례가 존재한다...
 * 1 2 1 1 의 경우 1 1 1 + 1 + 1  = 7 + 3 * 6 원 = 13원
 * 1 2 1 의 경우 1 1 + 1 1 1 = 5 + 7 = 12 원
 * 
 * 2 1 1 1
 * > 1 + 1 1 1 + 1 = 3 + 7 + 3 원 = 13원
 * 
 * 1 2 1 1
 * > 1 1 + 1 1 1 = 5 + 7원 = 12원
 * 
 * 1 1 2 1
 * 
 * > 1 1 1 + 1 1 = 7 + 5원 = 12원
 * 
 * 1 1 1 1 7 + 3원
 * 1 1 1  7 원
 * 1 1    5 원
 * 1      3 원
 */
public class No002_No18185_3_FAIL {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter pen=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int length=Integer.parseInt(scan.readLine());
		
		String inputArr[]=scan.readLine().split(" ");
		
		int numArr[]=new int[length];
		for(int i=0; i<length; i++)
			numArr[i]=Integer.parseInt(inputArr[i]);

		int money=0;
		
		pen.write(money+"");
		pen.flush();
	}
}
