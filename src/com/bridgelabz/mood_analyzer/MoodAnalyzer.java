package com.bridgelabz.mood_analyzer;

public class MoodAnalyzer {
	public static MoodAnalyzer instance;
	private String message;

	private MoodAnalyzer() {
	}

	public static MoodAnalyzer getInstance() {
		if (instance == null) {
			instance = new MoodAnalyzer();
		}
		return instance;
	}

	public String analyseMood(String userMessage) {
		if (userMessage.toLowerCase().contains("sad"))
			message = "SAD";
		else
			message = "HAPPY";
		return message;
	}

}
