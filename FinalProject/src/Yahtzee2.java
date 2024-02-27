/*********************************************************************
 *  Yahtzee Game                                                     *
 *                                                                   *
 *  PROGRAMMER: Charles Carroll                                      *
 *  COURSE: CS201                                                    *
 *  DATE: 10/23/23                                                   *
 *  REQUIREMENT: Final Project                                       *
 *                                                                   *
 *  DESCRIPTION:                                                     *
 *  The following program is a simple yahtzee game, with the ability *
 *  to have as many players as you want, with the rules of this      *
 *  yahtzee included in the rules section of the program.            *
 *                                                                   *
 *                                                                   *
 *  COPYRIGHT: This code is copyright (C) 2023 Charles Carroll and   *
 *  Dean Zeller                                                      *
 *                                                                   *
 ********************************************************************/
import java.util.Scanner;
public class Yahtzee2 {
    public static void main(String[] args) {
        int[] Players;
        int[] UpperScores;
        int[] LowerScores;
        String[] Used;
        System.out.println("********Menu********");
        System.out.println("1. Play Yahtzee");
        System.out.println("2. Quit");
        System.out.print("Make selection: ");
        Scanner myObj = new Scanner(System.in);
        int option = myObj.nextInt();
        if(option == 1){
            System.out.println("Welcome to Yahtzee");
            System.out.print("How many players will be participating: ");
            int numOfPlayers = myObj.nextInt();
            Players = new int[numOfPlayers];
            UpperScores = new int[numOfPlayers];
            LowerScores = new int[numOfPlayers];
            Used = new String[numOfPlayers];
            for(int i = 0; i<numOfPlayers; i++){
                UpperScores[i] = 0;
                LowerScores[i] = 0;
                Used[i] = "";
            }
            for(int i = 0; i<(13*numOfPlayers);i++) {
                System.out.println("Turn Start");
                Dice dice = new Dice(6, 5);
                dice.rolls();
                System.out.println(dice);
                System.out.print("How many would you like to reroll?(0 if you do not want to reroll): ");
                int numOfReRoll = myObj.nextInt();
                if(numOfReRoll==1){
                    System.out.print("Which one do you want to reroll?: ");
                    int reRoll1 = myObj.nextInt();
                    dice.reRollDie(reRoll1);
                }
                if(numOfReRoll==2){
                    System.out.print("Which 2 die do you want to reroll?(press enter after each one): ");
                    int reRoll2 = myObj.nextInt();
                    int reRoll3 = myObj.nextInt();
                    dice.reRollDie(reRoll2);
                    dice.reRollDie(reRoll3);
                }
                if(numOfReRoll==3){
                    System.out.print("Which 3 dice do you want to reroll?(press enter after each one): ");
                    int reRoll4 = myObj.nextInt();
                    int reRoll5 = myObj.nextInt();
                    int reRoll6 = myObj.nextInt();
                    dice.reRollDie(reRoll4);
                    dice.reRollDie(reRoll5);
                    dice.reRollDie(reRoll6);
                }
                if(numOfReRoll==4){
                    System.out.print("Which 4 dice do you want to reroll?(press enter after each one): ");
                    int reRoll7 = myObj.nextInt();
                    int reRoll8 = myObj.nextInt();
                    int reRoll9 = myObj.nextInt();
                    int reRoll10 = myObj.nextInt();
                    dice.reRollDie(reRoll7);
                    dice.reRollDie(reRoll8);
                    dice.reRollDie(reRoll9);
                    dice.reRollDie(reRoll10);
                }
                if(numOfReRoll==5){
                    dice.rolls();
                }
                if(numOfReRoll==0){
                    System.out.println("No rerolls will be done");
                }
                System.out.println(dice);
                System.out.print("How many would you like to reroll?(this is your last time, 0 for no reroll): ");
                int numOfReRoll2 = myObj.nextInt();
                if(numOfReRoll2==1){
                    System.out.print("Which one do you want to reroll?: ");
                    int reRoll1 = myObj.nextInt();
                    dice.reRollDie(reRoll1);
                }
                if(numOfReRoll2==2){
                    System.out.print("Which 2 die do you want to reroll?(press enter after each one): ");
                    int reRoll2 = myObj.nextInt();
                    int reRoll3 = myObj.nextInt();
                    dice.reRollDie(reRoll2);
                    dice.reRollDie(reRoll3);
                }
                if(numOfReRoll2==3){
                    System.out.print("Which 3 dice do you want to reroll?(press enter after each one): ");
                    int reRoll4 = myObj.nextInt();
                    int reRoll5 = myObj.nextInt();
                    int reRoll6 = myObj.nextInt();
                    dice.reRollDie(reRoll4);
                    dice.reRollDie(reRoll5);
                    dice.reRollDie(reRoll6);
                }
                if(numOfReRoll2==4){
                    System.out.print("Which 4 dice do you want to reroll?(press enter after each one): ");
                    int reRoll7 = myObj.nextInt();
                    int reRoll8 = myObj.nextInt();
                    int reRoll9 = myObj.nextInt();
                    int reRoll10 = myObj.nextInt();
                    dice.reRollDie(reRoll7);
                    dice.reRollDie(reRoll8);
                    dice.reRollDie(reRoll9);
                    dice.reRollDie(reRoll10);
                }
                if(numOfReRoll2==5){
                    dice.rolls();
                }
                if(numOfReRoll2==0){
                    System.out.println("No rerolls will be done.");
                }
                System.out.println(dice);
                System.out.print("Now it is time to score, enter which player you are(1 for player 1, etc.): ");
                int PlayerNum = myObj.nextInt();
                System.out.println("These are the options, true meaning you have it, false meaning you do not.");
                System.out.println("1. Ones - " + dice.hasOnes());
                System.out.println("2. Twos - " + dice.hasTwos());
                System.out.println("3. Threes - " + dice.hasThrees());
                System.out.println("4. Fours - " + dice.hasFours());
                System.out.println("5. Fives - " + dice.hasFives());
                System.out.println("6. Sixes - " + dice.hasSixes());
                System.out.println("7. Three of a kind - " + dice.has3kind());
                System.out.println("8. Four of a kind - " + dice.has4kind());
                System.out.println("9. Full House - " + dice.hasFullHouse());
                System.out.println("10.Small Straight - " + dice.hasSmallStraight());
                System.out.println("11.Large Straight - " + dice.hasLargeStraight());
                System.out.println("12.Yahtzee(5 of a kind) - " + dice.hasYahtzee());
                System.out.println("13.Chance - " + dice.hasChance());
                System.out.println();
                System.out.println("These are the ones you have already picked: ");
                System.out.println(Used[PlayerNum-1]);
                System.out.print("Please select which category you would like to score this round(Type the #): ");
                int selection = myObj.nextInt();
                if(selection == 1){
                    UpperScores[PlayerNum-1] += dice.scoreOnes();
                    Used[PlayerNum-1] += " Ones:" + dice.scoreOnes();
                }
                if(selection == 2){
                    UpperScores[PlayerNum-1] += dice.scoreTwos();
                    Used[PlayerNum-1] += " Twos:" + dice.scoreTwos();
                }
                if(selection == 3){
                    UpperScores[PlayerNum-1] += dice.scoreThrees();
                    Used[PlayerNum-1] += " Threes:" + dice.scoreThrees();
                }
                if(selection == 4){
                    UpperScores[PlayerNum-1] += dice.scoreFours();
                    Used[PlayerNum-1] += " Fours:" + dice.scoreFours();
                }
                if(selection == 5){
                    UpperScores[PlayerNum-1] += dice.scoreFives();
                    Used[PlayerNum-1] += " Fives:" + dice.scoreFives();
                }
                if(selection == 6){
                    UpperScores[PlayerNum-1] += dice.scoreSixes();
                    Used[PlayerNum-1] += " Sixes:" + dice.scoreSixes();
                }
                if(selection == 7){
                    LowerScores[PlayerNum-1] += dice.score3kind();
                    Used[PlayerNum-1] += " Three of a Kind:" + dice.score3kind();
                }
                if(selection == 8){
                    LowerScores[PlayerNum-1] += dice.score4kind();
                    Used[PlayerNum-1] += " Four of a Kind:" + dice.score4kind();
                }
                if(selection == 9){
                    LowerScores[PlayerNum-1] += dice.scoreFullHouse();
                    Used[PlayerNum-1] += " Full House:" + dice.scoreFullHouse();
                }
                if(selection == 10){
                    LowerScores[PlayerNum-1] += dice.scoreSmallStraight();
                    Used[PlayerNum-1] += " Small Straight:" + dice.scoreSmallStraight();
                }
                if(selection == 11){
                    LowerScores[PlayerNum-1] += dice.scoreLargeStraight();
                    Used[PlayerNum-1] += " Large Straight:" + dice.scoreLargeStraight();
                }
                if(selection == 12){
                    LowerScores[PlayerNum-1] += dice.scoreYahtzee();
                    Used[PlayerNum-1] += " Yahtzee:" + dice.scoreYahtzee();
                }
                if(selection == 13){
                    LowerScores[PlayerNum-1] += dice.scoreChance();
                    Used[PlayerNum-1] += " Chance:" + dice.scoreChance();
                }
            }
            System.out.println("Now for the scores!");
            for(int i = 0; i<numOfPlayers;i++){
                if(UpperScores[i]>=63){
                    UpperScores[i] += 35;
                }
                Players[i] =UpperScores[i] + LowerScores[i];
            }
            for(int i = 0; i<numOfPlayers; i++){
                int num = i+1;
                System.out.println("Player "+num+" Score = "+Players[i]);
            }
            int score = 0;
            for(int i = 0; i<numOfPlayers; i++){
                if(score<Players[i]){
                    score = Players[i];
                }
            }
            for(int i=0; i<numOfPlayers; i++){
                if (score == Players[i]){
                    int num = i+1;
                    System.out.println("Player "+num+ " Wins!");
                }
            }
            System.out.println("Thanks for playing");
        }
        if(option == 2){
            System.out.println("Thanks for Playing!");
            System.exit(0);
        }
    }
}
