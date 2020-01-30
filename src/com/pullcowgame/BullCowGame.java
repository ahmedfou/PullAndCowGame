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


    public final EGuessStatus checkGuessValidity(String s) {
        return null;
    }

    public void reset() {

    }

    private final String isIsogram(String s) {
        return null;
    }

    private final String isLowerCase(String s) {
        return null;
    }
}
