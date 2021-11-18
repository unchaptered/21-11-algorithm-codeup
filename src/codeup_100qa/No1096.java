package codeup_100qa;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1096 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		
		int arr[][]=new int[19][19];
		
		int max=Integer.parseInt(scan.readLine());
		for(int i=0;i<max;i++) {
			String inputArr[]=scan.readLine().split(" ");
			arr[Integer.parseInt(inputArr[0])-1][Integer.parseInt(inputArr[1])-1]=1;
		}
		
		for (int j=0; j<19; j++) {
			for (int i=0; i<19; i++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
}
