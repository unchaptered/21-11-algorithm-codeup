package acmicpc_greedy;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class No002_No18185_2_FAIL {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter pen=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int length=Integer.parseInt(scan.readLine());
		
		String inputArr[]=scan.readLine().split(" ");
		
		int numArr[]=new int[length];
		for(int i=0; i<length; i++)
			numArr[i]=Integer.parseInt(inputArr[i]);

		int money=0;
		int minNumber=1;
		for(int i=0; i<length; i++){
			if(numArr[i]!=0) {
				if(i<length-1 && numArr[i+1]!=0) {
					if(i<length-2 && numArr[i+2]!=0) {
						// 인덱스를 벗어나지 않는 영역에서 나를 포함한 우측 2개의 값이 0이 아닌 경우
						// 세 값 중 최솟값을 찾아서 해당 최솟값만큼 제거해준다.
						minNumber=minValueInThree(numArr[i],numArr[i+1],numArr[i+2]);
						numArr[i]-=minNumber;
						numArr[i+1]-=minNumber;
						numArr[i+2]-=minNumber;
						money+=7*minNumber;
						// 그리고 만약 나의 갯수가 하나 이상 남았다면 추가로 제거해준다.
						if(numArr[i]>0) {
							money+=3*numArr[i];
							numArr[i]-=numArr[i];
						}
					}else {
						// 인덱스를 벗어나지 않는 영역에서 나를 포함한 우측 1개의 값이 0이 아닌경우
						// 두 값중 최솟값을 찾아서 해당 최솟값만큼 제거해준다.
						minNumber=minValueInTwo(numArr[i],numArr[i+1]);
						numArr[i]-=minNumber;
						numArr[i+1]-=minNumber;
						money+=5*minNumber;
						// 그리고 만약 내의 갯수가 하나 이상 남았다면 추가로 제거해준다.
						if(numArr[i]>0) {
							money+=3*numArr[i];
							numArr[i]-=numArr[i];
						}
					}
				}else {
					//나만 갯수가 한 개 이상일 때 혹은 한칸 뛰고 1 0 1 과 같은 패턴일 때이다.
					// 나의 갯수가 하나 이상인 만큼만 제거해준다.
					if(numArr[i]>0) {
						money+=3*numArr[i];
						numArr[i]-=numArr[i];
					}
				}
			}
		}
		
		pen.write(money+"");
		pen.flush();
	}
	static int minValueInThree(int a,int b, int c) {
		if(a>b) {
			if(b>c) {
				return c;
			}else {
				return b;
			}
		}else {
			if(a>c) {
				return c;
			}else {
				return a;
			}
		}
	}
	static int minValueInTwo(int a,int b) {
		if(a>b) {
			return b;
		}else {
			return a;
		}
		
	}
}
