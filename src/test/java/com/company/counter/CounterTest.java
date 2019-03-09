package com.company.counter;

import com.company.WordCounter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {

    @Test
    public void shouldReturnZeroIfNoAddedWord() {
        String anyString = "kot";
        WordCounter wordCounter = new WordCounter();

        int result = wordCounter.countWords(anyString);

        assertEquals(0, result);
    }

    @Test
    public void shouldReturnWordCountIfAddedWord() {
        String anyString = "kot";
        WordCounter wordCounter = new WordCounter();
        wordCounter.addWord(anyString);

        int result = wordCounter.countWords(anyString);

        assertEquals(1, result);
    }

    @Test
    public void shouldReturnZeroIfCountDifferentWords() {
        WordCounter wordCounter = new WordCounter();
        wordCounter.addWord("kot");

        int result = wordCounter.countWords("pies");

        assertEquals(0, result);
    }
}