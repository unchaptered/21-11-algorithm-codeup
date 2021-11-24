package acmicpc_greedy;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/* 	i �� ���忡�� ����� ��� 3��
*	i, i+1 �� ���忡�� ����� ��� 5��(���� 2.5��==5/2)
*	i, i+1, i+2 �� ���忡�� ����� ��� 7��(���� 2.333����7/3)
*/
public class No002_No18185_1_FAIL {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter pen=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int length=Integer.parseInt(scan.readLine());
		
		String inputArr[]=scan.readLine().split(" ");
		
		int numArr[]=new int[length];
		for(int i=0; i<length; i++)
			numArr[i]=Integer.parseInt(inputArr[i]);
		
		// 1�� ������ �񱳸� �Ѵ�.
		// ���� ���� ���� ���� 3���ΰ� �ִ�
		// 4���� ���� 7 3 5 5 �����ϹǷ� �׳� 7 3 ���� �ɰ���.
		
		int money=0;
		int minNumber=1;
		for (int i=0; i<length; i++) {
			if(numArr[i]!=0) {
				if(i<length-1 && numArr[i+1]!=0) {
					if(i<length-2&& numArr[i+2]!=0) {
						minNumber=1;
						if(numArr[i]>=numArr[i+1]) {
							if(numArr[i+1]>=numArr[i+2]) {
								minNumber=numArr[i+2];
							}else {
								minNumber=numArr[i+1];
							}
						}else {
							if(numArr[i]>=numArr[i+2]) {
								minNumber=numArr[i+2];
							}else {
								minNumber=numArr[i];
							}
						}
						numArr[i]-=1*minNumber;
						numArr[i+1]-=1*minNumber;
						numArr[i+2]-=1*minNumber;
						money+=7*minNumber;
					}else {
						minNumber=1;
						if(numArr[i]>=numArr[i+1]) {
							minNumber=numArr[i+1];
						}else {
							minNumber=numArr[i];
						}
						numArr[i]-=1*minNumber;
						numArr[i+1]-=1*minNumber;
						money+=5*minNumber;
					}
				}else {
					minNumber=1;
					minNumber=numArr[i];
					numArr[i]-=minNumber;
					money+=3*minNumber;
				}
			}
		}

		pen.write(""+money);
		pen.flush();
	}
}
