package codeup_100qa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class No1024 {
   public static void main(String[] args) throws IOException {
	   BufferedReader scan=new BufferedReader(new InputStreamReader(System.in));
	   char inputText[]=scan.readLine().toCharArray();
	   
	   for(int i=0; i<inputText.length; i++)
		   System.out.printf("\'%c\'%n", inputText[i]);
   }
}