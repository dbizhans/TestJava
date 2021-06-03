package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    }

    public static void gameStart(int playerStoneCount, int aiStoneCount, int moveChoice) {
        int firstGuess = -1;
        if (moveChoice == 0) {
            System.out.println("AI's move");
            //AI's choice
            double aiStoneCountRandDouble = Math.random() * aiStoneCount + 1;
            int aiStoneCountRand = (int) aiStoneCountRandDouble;
            //AI's guess on player's choice
            for(;;) {
                double aiStoneCountRandDoubleGuess = Math.random() * playerStoneCount + 1;
                int aiStoneCountRandGuess = (int) aiStoneCountRandDoubleGuess;
                int finalGuess = aiStoneCountRand + aiStoneCountRandGuess;
                if (finalGuess != firstGuess) {
                    break;
                }
            }

        }
        if (moveChoice == 1) {
            System.out.println("Player's move");
            //Player's choice
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your number of stones that you want to take (range from " + 0 + "to " + playerStoneCount + ")");
            int playerChoice = scanner.nextInt();
            //Player's guess on ai's choice
            for(;;) {
                System.out.println("Enter your total number of stones in this round (range from " + 0 + "to " + (playerStoneCount + aiStoneCount) + ")");
                int playerGuess = scanner.nextInt();
                if (playerGuess != firstGuess) {
                    break;
                }
            }

        }
    }
    public static void gameStart(int playerStoneCount, int moveChoice) {}
    public static void gameStart(int playerStoneCount, int aiStoneCount, int moveChoice) {}
