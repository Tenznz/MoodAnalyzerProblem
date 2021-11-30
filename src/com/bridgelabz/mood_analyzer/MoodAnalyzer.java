package com.bridgelabz.mood_analyzer;

public class MoodAnalyzer {
	public static MoodAnalyzer instance;
	private String message;

	private MoodAnalyzer(String message) {
		this.message = message;
	}

	public static MoodAnalyzer getInstance(String userMessage) {
		if (instance == null) {
			instance = new MoodAnalyzer(userMessage);
		}
		return instance;
	}

	public String analyseMood() {
		try {
			if (message.toLowerCase().contains("sad"))
				message = "SAD";
//			else
//				message = "HAPPY";
			return message;
		} catch (Exception e) {
			return "HAPPY";
		}

	}
}
