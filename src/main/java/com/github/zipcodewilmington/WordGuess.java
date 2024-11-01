package com.github.zipcodewilmington;


import java.util.Random;

//Ulas Yakut
public class WordGuess {


    public static void main(String[] args){

        int numOfTries = chosenWord().length();
        System.out.println("Welcome to Word Guess game\nThe word has "+chosenWord().length()+" words");
        Hangman.hangman();

   }

   public static String chosenWord(){
       String[] words = {"dog", "cat", "cup", "git"};
       Random rand = new Random();
       int number = rand.nextInt(4);
       String word = words[number];
       return word;
   }


}
