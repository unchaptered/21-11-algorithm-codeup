package codeup_others;

import java.util.Scanner;

public class No1152 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        int num=scan.nextInt();
        scan.close();
        if(num<10){
            System.out.print("small");
        } else {
        	System.out.print("big");
        }
    }
}