package com.exercices.alliteracy;

import org.junit.Test;
import java.util.HashMap;
import static org.junit.Assert.*;

public class AlliteracyApplicationTests
{
    AlliteracyApplication alliteracy = new AlliteracyApplication();

	@Test
	public void simpleWord()
    {
		HashMap<Character, Double> result = alliteracy.calculate("mola");
	    assertEquals(1.0, result.get('m'), 0.0);
	}

	@Test
	public void complexPhrase()
    {
		HashMap<Character, Double> result = alliteracy.calculate(
		        "Mike made mellow music with his new microphone."
        );
		assertEquals(0.625, result.get('m'), 0.0);
		assertEquals(0.125, result.get('w'), 0.0);
		assertEquals(0.125, result.get('h'), 0.0);
		assertEquals(0.125, result.get('n'), 0.0);
	}

	@Test
	public void complexPhraseWithDifferentPunctuationMarks()
    {
		HashMap<Character, Double> result = alliteracy.calculate(
		        "Yarvis;yanked,his(ankle)!at+yoga,and%Yolanda?yelled=out¿in:surprise."
        );
		assertEquals(0.7142857142857142, result.get('y'), 0.0);
		assertEquals(0.14285714285714285, result.get('h'), 0.0);
		assertEquals(0.14285714285714285, result.get('s'), 0.0);
	}
}
