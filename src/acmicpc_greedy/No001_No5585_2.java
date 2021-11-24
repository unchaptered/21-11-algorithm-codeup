package acmicpc_greedy;
// 거스름돈 문제 : https://www.acmicpc.net/problem/5585
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class No001_No5585_2 {
	static int exchangeCount=0;
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter pen=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int price=1000-Integer.parseInt(scan.readLine());
		int numArr[]= {500,100,50,10,5,1};
		for (int i=0; i<numArr.length; i++)
			price=substractMoney(price,numArr[i]);
		
		pen.write(""+exchangeCount);
		pen.flush();
	}
	static int substractMoney(int price, int token) {
		while(price/token>=1) {
			price-=token;
			exchangeCount++;
		}
		return price;
	}
}
