package com.pullcowgame;

public class BullCowGame {

    private int myCurrentTry;
    private String myHiddenWord;
    private boolean isGameWon;

    public BullCowGame() {
    }

    public final int getMyCurrentTry() {
        return myCurrentTry;
    }

    public final String getMyHiddenWord() {
        return myHiddenWord;
    }

    public final boolean isGameWon() {
        return isGameWon;
    }


    public final EGuessStatus checkGuessValidity(String guess) {
      return null
    }

    public void reset() {
        final String HIDDEN_WORD = "plane"; // this MUST be an isogram
        myHiddenWord = HIDDEN_WORD;

        myCurrentTry = 1;
        isGameWon = false;
        return;
    }

    public BullCowCount SubmitValidGuess(String guess) {
        return null;
    }

    private final boolean isIsogram(String Word) {
        return false;
    }

    private final String isLowerCase(String word) {
        return null;
    }
}
