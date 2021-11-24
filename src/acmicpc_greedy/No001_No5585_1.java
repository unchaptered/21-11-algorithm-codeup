package acmicpc_greedy;
/* 거스름돈 문제 : https://www.acmicpc.net/problem/5585
 * 예제 입력 1 380
 * 예제 출력 1 4
 * 
 * 예제 입력 2 1
 * 예제 출력 2 15
 */

// 잔돈 500, 100, 50, 10, 5, 1
import java.util.Scanner;
public class No001_No5585_1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int price=scan.nextInt();
		price=1000-price;
		int exchangeCount=0;
		scan.close();
		
		while(price/500>=1) {
			price-=500;
			exchangeCount++;
		}
		while(price/100>=1) {
			price-=100;
			exchangeCount++;
		}
		while(price/50>=1) {
			price-=50;
			exchangeCount++;
		}
		while(price/10>=1) {
			price-=10;
			exchangeCount++;
		}
		while(price/5>=1) {
			price-=5;
			exchangeCount++;
		}
		while(price/1>=1) {
			price-=1;
			exchangeCount++;
		}
		System.out.println(exchangeCount);
	}
}
