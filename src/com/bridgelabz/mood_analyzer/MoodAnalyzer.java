package com.bridgelabz.mood_analyzer;

import com.bridgelabz.mood_analyzer.MoodAnalysisException.Mood;

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

	public String analyseMood() throws MoodAnalysisException {
		try {
			if (message == null) {
				throw new MoodAnalysisException(Mood.NULL_MOOD, "given value is null ");
			}
			if(message== " ") {
				throw new MoodAnalysisException(Mood.EMPTY_MOOD, "given value is Empty");
			}
			if (message.toLowerCase().contains("sad"))

				message = "SAD";
			else
				message = "HAPPY";
			return message;
		} catch(MoodAnalysisException e) {
			System.out.print(e);
		}
		return message;
	}
}
