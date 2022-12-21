/*
 * Game Class
 * Final Project
 * @author Leah Marville
 * @ version 6 December 2022
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    public static void main(String[] args){

        boolean isPlaying = true;
        boolean isRunning;
        Scanner scan = new Scanner(System.in);
        String userResponse = "";

        System.out.println("Hi! What's your name?");

        userResponse = scan.next();

        Player myPlayer = new Player(userResponse, 4, 7);

        Map myMap = new Map();

        Bear newBear = Bear(true, "black", 2, 2);

        Sign sign1 = new Sign("Beware of bears! They are attracted by berries", 2, 7);
        Sign sign2 = new Sign("You are lost", 5, 3);
        Sign sign3 = new Sign("If you encounter a bear, talk or sing loudly to scare it away!", 5, 8);

        do {
            if (userResponse.equals("win") || userResponse.equals("lose")) {
                System.out.println("You won!");
            } else {
                System.out.println("You lose.");
            }
        }
    }

}
