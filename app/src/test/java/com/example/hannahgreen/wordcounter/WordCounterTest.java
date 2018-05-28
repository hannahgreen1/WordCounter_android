package com.example.hannahgreen.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCounterTest {

    WordCounter wordCounter;


    @Before
    public void before(){
        wordCounter = new WordCounter();
    }

    @Test
    public void canGetWord(){
        wordCounter.setWord("Hello");
        assertEquals("Hello", wordCounter.getWord());
    }

    @Test
    public void getLetterCount(){
        wordCounter.setWord("Hello World");
        assertEquals(11, wordCounter.getLetterCount("Hello World"));
    }

    @Test
    public void canGetWordCount(){
        wordCounter.setWord("Hello World you are fun");
        assertEquals(5, wordCounter.getWordCount("Hello World you are fun"));
    }
}
