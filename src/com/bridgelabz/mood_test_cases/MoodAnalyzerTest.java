package com.bridgelabz.mood_test_cases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bridgelabz.mood_analyzer.MoodAnalysisException;
import com.bridgelabz.mood_analyzer.MoodAnalyzer;

public class MoodAnalyzerTest {
	public static MoodAnalyzer mood;
	private static String message;

	public MoodAnalyzerTest() {
		message = " ";
	}

	@BeforeClass
	public static void init() {
		new MoodAnalyzerTest();
		mood = MoodAnalyzer.getInstance(message);
	}

	@Test
	public void given_message_in_constructor_should_return_SAD() {
		try {
			String actualMessage = mood.analyseMood();
			assertEquals("SAD", actualMessage);
		} catch (MoodAnalysisException e) {

		}
	}

	@Test
	public void given_message_in_constructor_should_return_HAPPY() {

		try {
			String actualMessage = mood.analyseMood();
			assertEquals("HAPPY", actualMessage);
		} catch (MoodAnalysisException e) {

		}
	}

	@AfterClass
	public static void endTask() {

	}
}
