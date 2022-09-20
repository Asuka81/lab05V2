package com.example.lab05v2;

import java.util.ArrayList;

public class Word {
    ArrayList<String> badWords;
    ArrayList<String> goodWords;

    public Word(){
        badWords = new ArrayList<String>();
        goodWords = new ArrayList<String>();
        goodWords.add("happy");
        goodWords.add("enjoy");
        goodWords.add("life");
        badWords.add("olo");
        badWords.add("fuck");
    }

}

