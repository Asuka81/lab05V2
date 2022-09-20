package com.example.lab05v2;

import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.ArrayList;

@RestController
public class Sentence implements Serializable {
    public ArrayList<String> badSentence;
    public ArrayList<String> goodSentence;

    public Sentence(){
        badSentence = new ArrayList<String>();
        goodSentence = new ArrayList<String>();
    }
}
