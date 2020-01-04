package com.example.miwokapp;

public class Word {

    private String englishWord, miwokWord;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private int audioResourceId;

    public static final int NO_IMAGE_PROVIDED = -1;

    public Word() {

    }

    public Word(String englishWord, String miwokWord, int imageResourceId, int audioResourceId) {
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
        this.imageResourceId = imageResourceId;
        this.audioResourceId = audioResourceId;
    }

    public Word(String englishWord, String miwokWord, int audioResourceId) {
        this.englishWord = englishWord;
        this.miwokWord = miwokWord;
        this.audioResourceId = audioResourceId;
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

    public int getAudioResourceId() {
        return audioResourceId;
    }
}
