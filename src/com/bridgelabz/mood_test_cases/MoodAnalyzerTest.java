package com.bridgelabz.mood_test_cases;

import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.bridgelabz.mood_analyzer.MoodAnalyzer;

public class MoodAnalyzerTest {
	public static MoodAnalyzer mood;

	@BeforeClass
	public static void init() {
		mood = MoodAnalyzer.getInstance();
	}

	@Test
	public void given_message_should_return_SAD() {
		String message = "I am in Sad Mood";
		String actualMessage = mood.analyseMood(message);
		assertEquals("SAD", actualMessage);
	}

	@Test
	public void given_message_should_return_HAPPY() {
		String message = "I am in Any Mood";
		String actualMessage = mood.analyseMood(message);
		assertEquals("HAPPY", actualMessage);
	}

	@AfterClass
	public static void endTask() {

	}
}
