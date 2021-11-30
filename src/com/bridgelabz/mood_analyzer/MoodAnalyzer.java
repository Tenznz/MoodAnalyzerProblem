package com.bridgelabz.mood_analyzer;

public class MoodAnalyzer {

	public MoodAnalyzer() {
	}

	public String analyseMood(String message) {
		if (message.toLowerCase().contains("sad"))
			return "SAD";
		else
			return "HAPPY";
	}

}
