package com.github.zipcodewilmington;


import java.util.Random;
import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */

//Ulas Yakut
public class Hangman {

    public  static void hangman() {
        char[] solution = new char[WordGuess.chosenWord().length()];
        char[] userGuess = new char[WordGuess.chosenWord().length()];
        solution = WordGuess.chosenWord().toCharArray();
        System.out.println(solution);
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your try ");
        char c = sc.next().charAt(0);

        for (int i=0;i<WordGuess.chosenWord().length();i++){
            if(c == solution[i]){
                userGuess[i]=c;
                System.out.println("You guess is correct!");
                break;
            }
            else {
                System.out.println("Try one more time!");
            }
        }





    }


    }


