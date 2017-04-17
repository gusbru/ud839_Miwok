package com.example.android.miwok;

/**
 * Created by gusbru on 4/12/17.
 * <p>
 * {@link Word} This is a class to relate the english word with the miwok word
 */
public class Word {


    /**
     * English translation for the word
     **/
    private String mEnglish;

    /**
     * Miwok translation for the word
     **/
    private String mMiwok;

    /**
     * Image resource ID for the word
     **/
    private int mImageResourceId;

    /**
     * Constructor to create a new Word object
     *
     * @param english is the word in english
     * @param miwok   is the word in miwok
     */
    public Word(String english, String miwok) {
        this.mEnglish = english;
        this.mMiwok = miwok;
    }

    /**
     * Constructor when the image resource is provided
     *
     * @param mEnglish         the word in english
     * @param mMiwok           the word in miwok
     * @param mImageResourceId the image resource ID for the word
     */
    public Word(String mEnglish, String mMiwok, int mImageResourceId) {
        this.mEnglish = mEnglish;
        this.mMiwok = mMiwok;
        this.mImageResourceId = mImageResourceId;
    }

    /**
     * Getter
     *
     * @return the english translation for the word
     */
    public String getEnglish() {
        return mEnglish;
    }

    /**
     * Getter
     *
     * @return the miwok translation for the word
     */
    public String getMiwok() {
        return mMiwok;
    }

    /**
     * Getter
     *
     * @return the image resource ID for the word
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
