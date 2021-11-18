package codeup_100qa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* ���� ���� ������ �� ����� a , b , c �� �ֱ�� �湮�Ѵ�.
 * �ٽ� ������ ���� �湮�ϴ� ���� �����ϱ�?
 * �Է� ����  3 7 9
 * ��� ���� 63
 */

//����
//���� �м� : ����� ���� �ʹ� ���� -> �ٸ� ������� �ذ� �õ�
public class No1092_FAIL_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		String inputText[]=scan.readLine().split(" ");
		short inputNum[]=new short[inputText.length];
		
		for (short i=0; i<inputText.length; i++) {
			inputNum[i]=Short.parseShort(inputText[i]);
		}
		
//		�� �� �߿� ū �� �ΰ� ã��
		long a,b;
		if (inputNum[0]>inputNum[1]) {
			// a  �� �� ŭ : a�� �ּڰ��ϼ��� ����
			if(inputNum[1]>inputNum[2]) {
				// c �� �ּڰ�
				a=inputNum[0];
				b=inputNum[1];
				if(a*b%inputNum[2]!=0) {
					System.out.println(a*b*inputNum[2]);
				} else {
					System.out.println(a*b);
				}
			} else {
				// b �� �ּڰ�
				a=inputNum[0];
				b=inputNum[2];
				if(a*b%inputNum[1]!=0) {
					System.out.println(a*b*inputNum[1]);
				} else {
					System.out.println(a*b);
				}
			}
		} else {
			// a �� �� ���� : b�� �ּڰ��� �� ����
			if(inputNum[0]>inputNum[2]) {
				// c �� �ּڰ�
				a=inputNum[0];
				b=inputNum[1];
				if(a*b%inputNum[2]!=0) {
					System.out.println(a*b*inputNum[2]);
				} else {
					System.out.println(a*b);
				}
			}else {	
				// a �� �ּڰ�
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