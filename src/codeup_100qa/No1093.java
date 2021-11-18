package codeup_100qa;

import java.util.Scanner;

public class No1093 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int array[]=new int[23];
		int count=scan.nextInt();
		
		for (int i=0; i<count; i++) {
			array[scan.nextInt()-1]++;
		}
		
		scan.close();
		
		for (int i=0; i<array.length; i++)
			System.out.print(array[i]+" ");
	}
}