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
		
		/* 백준에서는 더이상 입력값이 없을 때 NullPointerError 가 뜬다.
		 * 그렇기 때문에 (inputText=scan.readLine())!=null 을 이용해
		 * 에러 핸들링을 했다.
		 * 
		 * 이클립스에서 테스트를 할 때는,
		 * 해당 구문에서 !=null 을 지우면 값을 확인할 수 있다.
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