package acmicpc_basics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No10951_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter pen=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer spliter;
		String inputText;
		int a=0;
		int b=0;
		
		/* ���ؿ����� ���̻� �Է°��� ���� �� NullPointerError �� ���.
		 * �׷��� ������ (inputText=scan.readLine())!=null �� �̿���
		 * ���� �ڵ鸵�� �ߴ�.
		 * 
		 * ��Ŭ�������� �׽�Ʈ�� �� ����,
		 * �ش� �������� !=null �� ����� ���� Ȯ���� �� �ִ�.
		 * 
		 */
		while((inputText=scan.readLine())!=null) {
			spliter=new StringTokenizer(inputText," ");
			a=Integer.parseInt(spliter.nextToken());
			b=Integer.parseInt(spliter.nextToken());
			pen.write(a+b+"\n");
		}
		pen.flush();
	}
}