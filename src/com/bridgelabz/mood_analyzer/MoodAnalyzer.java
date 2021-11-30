package com.bridgelabz.mood_analyzer;

public class MoodAnalyzer {
	public static MoodAnalyzer instance;
	private String message;

	private MoodAnalyzer(String message) {
		this.message=message;
	}

	public static MoodAnalyzer getInstance(String message) {
		if (instance == null) {
			instance = new MoodAnalyzer(message);
		}
		return instance;
	}

	public String analyseMood() {
		if (message.toLowerCase().contains("sad"))
			message = "SAD";
		else
			message = "HAPPY";
		return message;
	}

}
