package com.example.android.miwok;

/**
 * Created by gusbru on 4/12/17.
 *
 * {@link Word} This is a class to relate the english word with the miwok word
 *
 */
public class Word {

    //state
    private String english;
    private String miwok;

    /**
     *
     * Constructor to create a new Word object
     *
     * @param english is the word in english
     *
     * @param miwok is the word in miwok
     */
    public Word(String english, String miwok) {
        this.english = english;
        this.miwok = miwok;
    }

    // getters
    public String getEnglish() {
        return english;
    }

    public String getMiwok() {
        return miwok;
    }
}
