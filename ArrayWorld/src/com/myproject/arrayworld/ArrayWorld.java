package com.myproject.arrayworld;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayWorld {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<String> text = new ArrayList<>();
		List<String> letters = new ArrayList<>();
		String[] array = scanner.nextLine().split(" ");
		Collections.addAll(text, array);
		
		for(int i = 0; i < text.size(); i++) {
			Collections.addAll(letters, text.get(i).split(""));
		}
		
		System.out.println(letters);
		System.out.println(text);
		System.out.println("Repository");
		
		
		
//		char[][] answer = new char[text.length][]; 
		
//		for(String word : text) {
//			
//			System.out.printf("[%s] ", word);
//			
//		}
//		
//		System.out.println();
//		
//		for(int i = 0; i < text.length; i++) {
//			
//			char[] letters = text[i].toCharArray();
//			answer[i] = new char[letters.length];
//			
//			for(int j = 0; j < letters.length; j++) {
//				
//				if(letters[j] == '\'') continue;
//				
//				try {
//					
//					answer[i][j] = letters[j];
//					
//				} catch (NullPointerException ex) {
//					
//					throw ex;
//					
//				}
//				
//			}
//		}
//		
//		for(char[] i : answer) {
//			
//			for(char j : i) {
//				System.out.printf("[%s] ", j);
//			}
//			
//			System.out.println();
//			
//		}
//		
//		int i = 0;
//		for(;i < 3;) {
//			i++;
//			if(i == 2) continue;
//			System.out.println("I'm trying");
//		}
		
	}

}
