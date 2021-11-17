package codeup_100qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// O(n^2) 비효율적인 코드
public class No1078_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
		int number=Integer.parseInt(scan.readLine());
		int count = 0;
		for(int i=1; i<=number; i++)
			if(i%2==0)
				count=count+i;
		
		System.out.println(count);
	}
}