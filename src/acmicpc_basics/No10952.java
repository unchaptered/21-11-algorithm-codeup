package acmicpc_basics;

import java.util.Scanner;

public class No10952 {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
				
		while(true){
			int A=scan.nextInt();
			int B=scan.nextInt();
			if(A==0 && B==0){
				scan.close();
				break;
			}
			System.out.println(A+B);
		}
	}
}
