package acmicpc_greedy;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/* �ݷʰ� �����Ѵ�...
 * 1 2 1 1 �� ��� 1 1 1 + 1 + 1  = 7 + 3 * 6 �� = 13��
 * 1 2 1 �� ��� 1 1 + 1 1 1 = 5 + 7 = 12 ��
 * 
 * 2 1 1 1
 * > 1 + 1 1 1 + 1 = 3 + 7 + 3 �� = 13��
 * 
 * 1 2 1 1
 * > 1 1 + 1 1 1 = 5 + 7�� = 12��
 * 
 * 1 1 2 1
 * 
 * > 1 1 1 + 1 1 = 7 + 5�� = 12��
 * 
 * 1 1 1 1 7 + 3��
 * 1 1 1  7 ��
 * 1 1    5 ��
 * 1      3 ��
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
