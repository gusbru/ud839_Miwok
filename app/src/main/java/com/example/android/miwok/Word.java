package com.example.android.miwok;

import android.media.Image;

/**
 * Created by gusbru on 4/12/17.
 * <p>
 * {@link Word} This is a class to relate the english word with the miwok word
 */
public class Word {


    // Constant value to check when no images are provided
    private static final int NO_IMAGE_PROVIDED = -1;
    private static final int NO_SOUND_PROVIDED = -1;

    // English translation for the word
    private String mEnglish;

     // Miwok translation for the word
    private String mMiwok;

    // Image resource ID for the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // Sound resource ID
    private int mSoundResourceId = NO_SOUND_PROVIDED;

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
     * Constructor when the image and sound resource are provided
     *
     * @param mEnglish word in english
     * @param mMiwok word in miwok
     * @param mImageResourceId image resource id
     * @param mSoundResourceId source resouce id
     */
    public Word(String mEnglish, String mMiwok, int mImageResourceId, int mSoundResourceId) {
        this.mEnglish = mEnglish;
        this.mMiwok = mMiwok;
        this.mImageResourceId = mImageResourceId;
        this.mSoundResourceId = mSoundResourceId;
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


    /**
     *
     * @return the sound resource ID for the word
     */
    public int getmSoundResourceId() {
        return mSoundResourceId;
    }

    /**
     *
     * @return if whether an image was provided or not
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     *
     * @return if whether an sound was provided or not
     */
    public boolean hasSound() {
        return mSoundResourceId != NO_SOUND_PROVIDED;
    }

    /**
     *
     * @return the states of the word object
     */
    @Override
    public String toString() {
        return "Word{" +
                "mEnglish='" + mEnglish + '\'' +
                ", mMiwok='" + mMiwok + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mSoundResourceId=" + mSoundResourceId +
                '}';
    }
}
