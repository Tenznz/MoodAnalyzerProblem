package com.bridgelabz.mood_test_cases;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.bridgelabz.mood_analyzer.MoodAnalyzer;

public class MoodAnalyzerTest {
	public static MoodAnalyzer mood;
	private static String message;

	public MoodAnalyzerTest() {
		message = "I am in sad Mood";
	}

	@BeforeClass
	public static void init() {
		new MoodAnalyzerTest();
		mood = MoodAnalyzer.getInstance(message);
	}

	@Test
	public void given_message_in_constructor_should_return_SAD() {
		String actualMessage = mood.analyseMood();
		assertEquals("SAD", actualMessage);
	}

	@AfterClass
	public static void endTask() {

	}
}