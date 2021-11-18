package codeup_100qa;

import java.util.Scanner;

// 133 √ 
public class No1081_2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String inputText[]=scan.nextLine().split(" ");
		scan.close();
		
		int inputNum[]=new int[inputText.length];
		for(int i=0; i<inputText.length;i++)
			inputNum[i]=Integer.parseInt(inputText[i]);
		
		for(int i=1; i<=inputNum[0]; i++)
			for(int j=1; j<=inputNum[1]; j++)
				System.out.printf("%d %d%n",i,j);
	}
}
