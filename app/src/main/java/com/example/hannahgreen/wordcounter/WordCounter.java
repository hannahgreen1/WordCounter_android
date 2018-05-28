package com.example.hannahgreen.wordcounter;

public class WordCounter {


    public static final WordCounter ourInstance = new WordCounter();

    String word;

  public String getWord(){
      return this.word;
  }

  public void setWord(String word){
      this.word = word;
  }

  public int getLetterCount(String word){
      return word.length();
  }

    public int getWordCount(String string){
      return string.split("\\s").length;
    }
}
