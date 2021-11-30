package com.bridgelabz.mood_analyzer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("How was your mood?");
		Scanner sc = new Scanner(System.in);
		String message = sc.nextLine();
		MoodAnalyzer mood = MoodAnalyzer.getInstance(message);
		System.out.println(mood.analyseMood());
	}
}