package com.index;

import java.util.Scanner;

public class Test_Ass6_pro4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String s = sc.nextLine();
		
		int count = 1;
		
		for(int i = 0;i<s.length();i++) {
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println("The number of characters: "+count);
		sc.close();

	}

}
