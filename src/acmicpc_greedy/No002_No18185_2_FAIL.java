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
						// �ε����� ����� �ʴ� �������� ���� ������ ���� 2���� ���� 0�� �ƴ� ���
						// �� �� �� �ּڰ��� ã�Ƽ� �ش� �ּڰ���ŭ �������ش�.
						minNumber=minValueInThree(numArr[i],numArr[i+1],numArr[i+2]);
						numArr[i]-=minNumber;
						numArr[i+1]-=minNumber;
						numArr[i+2]-=minNumber;
						money+=7*minNumber;
						// �׸��� ���� ���� ������ �ϳ� �̻� ���Ҵٸ� �߰��� �������ش�.
						if(numArr[i]>0) {
							money+=3*numArr[i];
							numArr[i]-=numArr[i];
						}
					}else {
						// �ε����� ����� �ʴ� �������� ���� ������ ���� 1���� ���� 0�� �ƴѰ��
						// �� ���� �ּڰ��� ã�Ƽ� �ش� �ּڰ���ŭ �������ش�.
						minNumber=minValueInTwo(numArr[i],numArr[i+1]);
						numArr[i]-=minNumber;
						numArr[i+1]-=minNumber;
						money+=5*minNumber;
						// �׸��� ���� ���� ������ �ϳ� �̻� ���Ҵٸ� �߰��� �������ش�.
						if(numArr[i]>0) {
							money+=3*numArr[i];
							numArr[i]-=numArr[i];
						}
					}
				}else {
					//���� ������ �� �� �̻��� �� Ȥ�� ��ĭ �ٰ� 1 0 1 �� ���� ������ ���̴�.
					// ���� ������ �ϳ� �̻��� ��ŭ�� �������ش�.
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
