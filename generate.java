package com.company;

import generateText.GenerateText;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;

public class generate implements maintext {

    private Hashtable alphabet;

    private String language;

    private ArrayList parameters;

    private Random random;



    public generate(String language, ArrayList parameters) {
        alphabet = new Hashtable();
        random = new Random();
        this.language = language;
        this.parameters = parameters;

    }

    @Override
    public void inputAlphabet() {
        alphabet.put("en", alphabet('a','z'));

        alphabet.put("ge", alphabet('ა','ჰ'));

        alphabet.put("ru", alphabet('а','я'));

    }
    public String alphabet(char first, char last) {

        String alpha = "";

        for (int i=(int)first;i<=(int)last; i++) {
            alpha += (char)i;
        }

        return alpha;
    }
    @Override
    public char inputchar() {
        String symbols = alphabet.get(language).toString();
        char symbol = symbols.charAt(random.nextInt(symbols.length()));
        return symbol;
    }

    @Override
    public String createWord(int length) {

        String words = "";
        for (int i=0; i<length; i++) {
            words += inputchar();
        }
        return words;
    }

    @Override
    public String createsentence(int avg, int MinWords, int MaxWords) {
        String sentence = "";
        int randomtext = random.nextInt(MaxWords - MinWords + 1) + MinWords;
           for (int i=0; i<avg; i++) {
                 if(i==1) {
                     sentence += "   ";
                 }
                 for (int io=0; io < randomtext; io++) {
                     sentence += createWord(randomtext) + " ";
               }
            }
           return sentence;
    }

}