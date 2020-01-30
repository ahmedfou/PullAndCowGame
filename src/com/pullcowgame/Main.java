package com.pullcowgame;

import java.util.Scanner;

public class Main {

    public static void gameIntro() {
        System.out.println("Welcome to the Bulls and Cows game! ");
        System.out.println("          }   {         ___ " );
        System.out.println("          (o o)        (o o) ");
        System.out.println( "   /-------\\ /          \\ /-------\\ ");
        System.out.println("  / | BULL |O            O| COW  | \\ ");
        System.out.println(" *  |-,--- |              |------|  * ");
        System.out.println( "    ^      ^              ^      ^ " );
        System.out.print("Can you guess the ");
        System.out.println(" letter isogram I'm thinking of?\n");
        return;
    }

    public static boolean replay()
    {
        System.out.print( "Replay? (y/n)");
        Scanner sc = new Scanner(System.in);
        char isReplaying = sc.nextLine().charAt(0);
        return (isReplaying == 'y' || isReplaying == 'Y');
    }


    public static void main(String[] args) {
        do {
            gameIntro();
        } while(replay());
        return;
    }
}
