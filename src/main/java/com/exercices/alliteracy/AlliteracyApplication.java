package com.exercices.alliteracy;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.HashMap;

public class AlliteracyApplication
{

	public static void main(String[] args)
    {
	}

	public HashMap<Character,Double> calculate(String phrase)
    {
        List<String> words = getWords(phrase);

        HashMap<Character,Double> percentages = new HashMap<Character,Double>();
        double percentage = 1.0/words.size();

        for (String word : words) {
            char startingCharacter = word.charAt(0);
            percentages.put(startingCharacter, percentages.getOrDefault(startingCharacter, 0.0) + percentage);
        }

        return percentages;
    }

    private List<String> getWords(String phrase)
    {
        List<String> words = new ArrayList<String>();
        Matcher match = Pattern.compile("(?![aeiou])(\\b\\w+)").matcher(phrase.toLowerCase());
        while (match.find()) {
            words.add(match.group());
        }
        return words;
    }
}
