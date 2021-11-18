package codeup_100qa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 같은 날에 가입한 세 사람이 a , b , c 일 주기로 방문한다.
 * 다시 동일한 날에 방문하는 날이 언제일까?
 * 입력 예제  3 7 9
 * 출력 예제 63
 */

//실패
//사유 분석 : 경우의 수가 너무 많음 -> 다른 방법으로 해결 시도
public class No1092_FAIL_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String inputText[]=scan.readLine().split(" ");
		short inputNum[]=new short[inputText.length];
		
		for (short i=0; i<inputText.length; i++) {
			inputNum[i]=Short.parseShort(inputText[i]);
		}
		
//		세 수 중에 큰 수 두개 찾기
		long a,b;
		if (inputNum[0]>inputNum[1]) {
			// a  가 더 큼 : a는 최솟값일수가 없지
			if(inputNum[1]>inputNum[2]) {
				// c 가 최솟값
				a=inputNum[0];
				b=inputNum[1];
				if(a*b%inputNum[2]!=0) {
					System.out.println(a*b*inputNum[2]);
				} else {
					System.out.println(a*b);
				}
			} else {
				// b 가 최솟값
				a=inputNum[0];
				b=inputNum[2];
				if(a*b%inputNum[1]!=0) {
					System.out.println(a*b*inputNum[1]);
				} else {
					System.out.println(a*b);
				}
			}
		} else {
			// a 가 더 작음 : b는 최솟값일 수 없지
			if(inputNum[0]>inputNum[2]) {
				// c 가 최솟값
				a=inputNum[0];
				b=inputNum[1];
				if(a*b%inputNum[2]!=0) {
					System.out.println(a*b*inputNum[2]);
				} else {
					System.out.println(a*b);
				}
			}else {	
				// a 가 최솟값
				a=inputNum[1];
				b=inputNum[2];
				if(a*b%inputNum[0]!=0) {
					System.out.println(a*b*inputNum[0]);
				} else {
					System.out.println(a*b);
				}
			}
		}
	}
}