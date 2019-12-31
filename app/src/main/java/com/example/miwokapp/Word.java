package com.example.miwokapp;

public class Word {

    private String englishWord, miwokWord;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    public static final int NO_IMAGE_PROVIDED = -1;

    public Word() {

    }

    public Word(String englishWord, String miwokWord, int imageResourceId) {
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
        this.imageResourceId = imageResourceId;
    }

    public Word(String englishWord, String miwokWord) {
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public String getMiwokWord() {
        return miwokWord;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage(){
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
