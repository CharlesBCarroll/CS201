 /*********************************************************************
 *  Dice object                                                      *
 *                                                                   *
 *  PROGRAMMER: Charles Carroll                                      *
 *  COURSE: CS201                                                    *
 *  DATE: 10/11/23                                                   *
 *  REQUIREMENT: Assignment 5                                        *
 *                                                                   *
 *  DESCRIPTION:                                                     *
 *  The following program is used as a piece of a game, the dice     *
 *  object takes the original die object, and makes it into an array *
 *  list, to have multiple die, roll multiple die at once            *
 *                                                                   *
 *  COPYRIGHT: This code is copyright (C) 2023 Charles Carroll and   *
 *  Dean Zeller                                                      *
 *                                                                   *
 ********************************************************************/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Dice {
    ArrayList<Die> dice;

    /***********************************************************
     * METHOD: Dice()                                          *
     * DESCRIPTION: initializes the current attributes         *
     * PARAMETERS:  numSides, numDice                          *
     **********************************************************/
    public Dice(int numSides, int numDice) {
        dice = new ArrayList<Die>();
        for (int i = 0; i < numDice; i++) {
            Die b = new Die(numSides);
            this.dice.add(b);
        }
    }

    /***********************************************************
     * METHOD: add()                                           *
     * DESCRIPTION: adds a die to the array of dice            *
     * PARAMETERS: Diecopy d                                   *
     * RETURN VALUE: none                                      *
     **********************************************************/
    public void add(Die b) {
        dice.add(b);
    }

    /***********************************************************
     * METHOD: getCurrentValues()                              *
     * DESCRIPTION: gets the current values of all dice in the *
     * array                                                   *
     * PARAMETERS:                                             *
     * RETURN VALUE: die values as an arraylist of integers    *
     **********************************************************/
    public ArrayList<Integer> getCurrentValues() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (Die b : dice) {
            nums.add(b.getCurrentValue());
        }
        return nums;
    }

    /***********************************************************
     * METHOD: getCurrentValue()                               *
     * DESCRIPTION: get the current value of 1 die in the array*
     * PARAMETERS: int n                                       *
     * RETURN VALUE: value of die in number n in array         *
     **********************************************************/
    public int getCurrentValue(int n) {
        Die b = dice.get(n);
        return b.getCurrentValue();
    }

    /**********************************************************
     * METHOD: rolls()                                        *
     * DESCRIPTION: rolls all die in the arraylist            *
     * PARAMETERS:                                            *
     * RETURN VALUE:                                          *
     *********************************************************/
    public void rolls() {
        for (Die b : dice) {
            b.roll();
        }
    }

    /**********************************************************
     * METHOD: roll()                                         *
     * DESCRIPTION: roll die n in arraylist                   *
     * PARAMETERS: int n                                      *
     * RETURN VALUE:                                          *
     *********************************************************/
    public void roll(int n) {
        Die b = dice.get(n);
        b.roll();
    }

    /**********************************************************
     * METHOD: setCurrentValue()                              *
     * DESCRIPTION: To set the currentValue of a certain die  *
     * PARAMETERS: int n, int x(value), in z(securitycode)    *
     * RETURN VALUE:                                          *
     *********************************************************/
    public void setCurrentValue(int n, int x, int z) {
        Die b = dice.get(n);
        b.setCurrentValue(x, z);
    }

    /**********************************************************
     * METHOD: toString()                                     *
     * DESCRIPTION: makes printing easier, returns string     *
     * PARAMETERS: dice                                       *
     * RETURN VALUE: the current value of dice in string form *
     *********************************************************/
    public String toString() {
        String stuff = "";
        for (Die b : dice) {
            stuff += b + " ";
        }
        return stuff;
    }

    /**********************************************************
     * METHOD: printSummary()                                 *
     * DESCRIPTION: shows neatly formatted summary of object  *
     * PARAMETERS:                                            *
     * RETURN VALUE: summary text box, with all attributes    *
     *********************************************************/
    public void printSummary() {
        System.out.printf("+" + "-------------" + "+%n");
        String s = "| ";
        for (Die b : dice) {
            s += b + " ";
        }
        s += "|";
        System.out.printf(s + "%n");
        System.out.printf("+" + "-------------" + "+%n");
    }

    /**********************************************************
     * METHOD: count()                                        *
     * Game(s): many dice games                               *
     * Parameters: int n                                      *
     * Return Type: integer                                   *
     *    The number of n die there are                       *
     * Test Cases:                                            *
     *    n=1  14516 2                                        *
     *    n=2  26145 1                                        *
     *    n=3  36333 4                                        *
     *    n=4  13652 0                                        *
     *    n=5  55555 5                                        *
     *********************************************************/
    public int count(int n) {
        int num = 0;
        for (Die d : dice) {
            if (d.getCurrentValue() == n) {
                num++;
            }
        }
        return num;
    }

    /**********************************************************
     * METHOD: has3kind()                                     *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: boolean                                   *
     *    true - has three or more dice with the same value   *
     *    false - does not have 3 dice with the same value    *
     * Test Cases:                                            *
     *    12161 true                                          *
     *    23456 false                                         *
     *    33513 true                                          *
     *    44344 true                                          *
     *    12321 false                                         *
     *********************************************************/
    public boolean has3kind() {
        int num1 = count(1);
        int num2 = count(2);
        int num3 = count(3);
        int num4 = count(4);
        int num5 = count(5);
        int num6 = count(6);
        if (num1 >= 3 || num2 >= 3 || num3 >= 3 || num4 >= 3 || num5 >= 3 || num6 >= 3) {
            return true;
        } else return false;
    }

    /**********************************************************
     * METHOD: sum()                                          *
     * Game(s): many dice games                               *
     * Parameters: none                                       *
     * Return Type: integer                                   *
     *    The sum of all the die                              *
     * Test Cases:                                            *
     *    12161 11                                            *
     *    23456 20                                            *
     *    33513 15                                            *
     *    44344 19                                            *
     *    12321 9                                             *
     *********************************************************/
    public int sum() {
        int sum = 0;
        for (Die d : dice) {
            sum += d.getCurrentValue();
        }
        return sum;
    }

    /**********************************************************
     * METHOD: score3kind()                                   *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: integer                                   *
     *    The sum of the die if there is 3k, 0 if not         *
     * Test Cases:                                            *
     *    12161 11                                            *
     *    23456 0                                             *
     *    33513 15                                            *
     *    44344 19                                            *
     *    12321 0                                             *
     *********************************************************/
    public int score3kind() {
        if (has3kind()) {
            return sum();
        } else return 0;
    }

    /**********************************************************
     * METHOD: has4kind()                                     *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: boolean                                   *
     *    true - has four or more dice with the same value    *
     *    false - does not have 4 dice with the same value    *
     * Test Cases:                                            *
     *    12161 false                                         *
     *    23456 false                                         *
     *    33533 true                                          *
     *    44344 true                                          *
     *    12321 false                                         *
     *********************************************************/
    public boolean has4kind() {
        int num1 = count(1);
        int num2 = count(2);
        int num3 = count(3);
        int num4 = count(4);
        int num5 = count(5);
        int num6 = count(6);
        if (num1 >= 4 || num2 >= 4 || num3 >= 4 || num4 >= 4 || num5 >= 4 || num6 >= 4) {
            return true;
        } else return false;
    }

    /**********************************************************
     * METHOD: score4kind()                                   *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: integer                                   *
     *    The sum of the die if there is 4k, 0 if not         *
     * Test Cases:                                            *
     *    12161 0                                             *
     *    23456 0                                             *
     *    33533 15                                            *
     *    44344 19                                            *
     *    12321 0                                             *
     *********************************************************/
    public int score4kind() {
        if (has4kind()) {
            return sum();
        } else return 0;
    }

    /**********************************************************
     * METHOD: hasYahtzee()                                   *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: boolean                                   *
     *    true - has five die with the same value             *
     *    false - does not have 5 die with the same value     *
     * Test Cases:                                            *
     *    12161 false                                         *
     *    23456 false                                         *
     *    33333 true                                          *
     *    44344 false                                         *
     *    12321 false                                         *
     *********************************************************/
    public boolean hasYahtzee() {
        int num1 = count(1);
        int num2 = count(2);
        int num3 = count(3);
        int num4 = count(4);
        int num5 = count(5);
        int num6 = count(6);
        if (num1 >= 5 || num2 >= 5 || num3 >= 5 || num4 >= 5 || num5 >= 5 || num6 >= 5) {
            return true;
        } else return false;
    }

    /**********************************************************
     * METHOD: scoreYahtzee()                                 *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: integer                                   *
     *    Returns 50 if there is yahtzee                      *
     * Test Cases:                                            *
     *    12161 0                                             *
     *    23456 0                                             *
     *    33333 50                                            *
     *    44344 0                                             *
     *    12321 0                                             *
     *********************************************************/
    public int scoreYahtzee() {
        if (hasYahtzee()) {
            return 50;
        } else return 0;
    }

    /**********************************************************
     * METHOD: hasSmallStraight()                             *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: boolean                                   *
     *    true - if dice contain a run of 4 in a row          *
     *    false - dice do not contain a run of 4 in a row     *
     * Test Cases:                                            *
     *    12161 false                                         *
     *    32345 true                                          *
     *    33333 false                                         *
     *    45631 true                                          *
     *    12321 false                                         *
     *********************************************************/
    public boolean hasSmallStraight() {
        int num1 = count(1);
        int num2 = count(2);
        int num3 = count(3);
        int num4 = count(4);
        int num5 = count(5);
        int num6 = count(6);
        if (num1 >= 1 && num2 >= 1 && num3 >= 1 && num4 >= 1 || num2 >= 1 && num3 >= 1 && num4 >= 1 && num5 >= 1 || num3 >= 1 && num4 >= 1 && num5 >= 1 && num6 >= 1) {
            return true;
        } else return false;
    }

    /**********************************************************
     * METHOD: scoreSmallStraight()                           *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: integer                                   *
     *    Returns 35 if there is a small straight             *
     * Test Cases:                                            *
     *    12161 0                                             *
     *    23456 0                                             *
     *    33333 0                                             *
     *    23451 35                                            *
     *    12321 0                                             *
     *********************************************************/
    public int scoreSmallStraight() {
        if (hasSmallStraight()) {
            return 30;
        } else return 0;
    }

    /**********************************************************
     * METHOD: hasLargeStraight()                             *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: boolean                                   *
     *    true - if dice contain a run of 5 in a row          *
     *    false - dice do not contain a run of 5 in a row     *
     * Test Cases:                                            *
     *    12161 false                                         *
     *    62345 true                                          *
     *    33333 false                                         *
     *    45231 true                                          *
     *    12321 false                                         *
     *********************************************************/
    public boolean hasLargeStraight() {
        int num1 = count(1);
        int num2 = count(2);
        int num3 = count(3);
        int num4 = count(4);
        int num5 = count(5);
        int num6 = count(6);
        if (num1 == 1 && num2 == 1 && num3 == 1 && num4 == 1 && num5 == 1 || num2 == 1 && num3 == 1 && num4 == 1 && num5 == 1 && num6 == 1) {
            return true;
        } else return false;
    }
    /**********************************************************
     * METHOD: scoreLargeStraight()                           *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: integer                                   *
     *    Returns 45 if there is a small straight             *
     * Test Cases:                                            *
     *    12161 0                                             *
     *    23456 0                                             *
     *    33333 0                                             *
     *    23451 45                                            *
     *    12321 0                                             *
     *********************************************************/
    public int scoreLargeStraight() {
        if (hasLargeStraight()) {
            return 40;
        } else return 0;
    }
    /**********************************************************
     * METHOD: hasFullHouse()                                 *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: boolean                                   *
     *    true - dice contain 3 of one number and 2 of another*
     *    false -dice do not contain 3 of one and 2 of another*
     * Test Cases:                                            *
     *    12161 false                                         *
     *    66644 true                                          *
     *    33333 false                                         *
     *    55333 true                                          *
     *    12321 false                                         *
     *********************************************************/
    public boolean hasFullHouse() {
        int num1 = count(1);
        int num2 = count(2);
        int num3 = count(3);
        int num4 = count(4);
        int num5 = count(5);
        int num6 = count(6);
        if ((num1 == 3 || num2 == 3 || num3 == 3 || num4 == 3 || num5 == 3 || num6 == 3) && (num1 == 2 || num2 == 2 || num3 == 2 || num4 == 2 || num5 == 2 || num6 == 2)) {
            return true;
        } else return false;
    }
    /**********************************************************
     * METHOD: scoreFullHouse()                               *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: integer                                   *
     *    Returns 25 if there is a Full House                 *
     * Test Cases:                                            *
     *    12161 0                                             *
     *    23456 0                                             *
     *    33333 0                                             *
     *    22555 45                                            *
     *    12321 0                                             *
     *********************************************************/
    public int scoreFullHouse() {
        if (hasFullHouse()) {
            return 25;
        } else return 0;
    }
    /**********************************************************
     * METHOD: hasChance()                                    *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: boolean                                   *
     *    true - dice contain any combination                 *
     *    false -not possible                                 *
     * Test Cases:                                            *
     *    12161 true                                          *
     *    66644 true                                          *
     *    33333 true                                          *
     *    55333 true                                          *
     *    12321 true                                          *
     *********************************************************/
    public boolean hasChance() {
        int num1 = count(1);
        int num2 = count(2);
        int num3 = count(3);
        int num4 = count(4);
        int num5 = count(5);
        int num6 = count(6);
        if (num1 > 0 || num2 > 0 || num3 > 0 || num4 > 0 || num5 > 0 || num6 > 0) {
            return true;
        } else return false;
    }
    /**********************************************************
     * METHOD: scoreChance()                                  *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: integer                                   *
     *    Returns sum of dice if there is a Chance            *
     * Test Cases:                                            *
     *    12161 11                                            *
     *    23456 20                                            *
     *    33333 15                                            *
     *    22555 45                                            *
     *    12321 9                                             *
     *********************************************************/
    public int scoreChance() {
        if (hasChance()) {
            return sum();
        } else return 0;
    }
    /**********************************************************
     * METHOD: hasOnes()                                      *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: boolean                                   *
     *    true - dice contain any amount of ones              *
     *    false - dice contains no ones                       *
     * Test Cases:                                            *
     *    12161 true                                          *
     *    66644 false                                         *
     *    33333 false                                         *
     *    55333 false                                         *
     *    12321 true                                          *
     *********************************************************/
    public boolean hasOnes() {
        if (count(1) > 0) {
            return true;
        } else return false;
    }
    /**********************************************************
     * METHOD: scoreOnes()                                    *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: integer                                   *
     *    Returns sum of all the ones                         *
     * Test Cases:                                            *
     *    12161 3                                             *
     *    23456 0                                             *
     *    33333 0                                             *
     *    22555 0                                             *
     *    12321 2                                             *
     *********************************************************/
    public int scoreOnes() {
        int score;
        if (count(1) > 0) {
            score = 1 * count(1);
            return score;
        } else return 0;
    }
    /**********************************************************
     * METHOD: hasTwos()                                      *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: boolean                                   *
     *    true - dice contain any amount of twos              *
     *    false - dice contains no twos                       *
     * Test Cases:                                            *
     *    12161 true                                          *
     *    66644 false                                         *
     *    33333 false                                         *
     *    55333 false                                         *
     *    12321 true                                          *
     *********************************************************/
    public boolean hasTwos() {
        if (count(2) > 0) {
            return true;
        } else return false;
    }
    /**********************************************************
     * METHOD: scoreTwos()                                    *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: integer                                   *
     *    Returns score of all the 2s added up                *
     * Test Cases:                                            *
     *    12161 2                                             *
     *    23456 2                                             *
     *    33333 0                                             *
     *    22555 4                                             *
     *    12321 4                                             *
     *********************************************************/
    public int scoreTwos() {
        int score;
        if (count(2) > 0) {
            score = 2 * count(2);
            return score;
        } else return 0;
    }
    /**********************************************************
     * METHOD: hasThrees()                                    *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: boolean                                   *
     *    true - dice contain any amount of Threes            *
     *    false - dice contains no Threes                     *
     * Test Cases:                                            *
     *    12161 false                                         *
     *    66644 false                                         *
     *    33333 true                                          *
     *    55333 true                                          *
     *    12321 true                                          *
     *********************************************************/
    public boolean hasThrees() {
        if (count(3) > 0) {
            return true;
        } else return false;
    }
    /**********************************************************
     * METHOD: scoreThrees()                                  *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: integer                                   *
     *    Returns score of all the 3s added up                *
     * Test Cases:                                            *
     *    12161 0                                             *
     *    23456 3                                             *
     *    33333 15                                            *
     *    22555 0                                             *
     *    12321 3                                             *
     *********************************************************/
    public int scoreThrees() {
        int score;
        if (count(3) > 0) {
            score = 3 * count(3);
            return score;
        } else return 0;
    }
    /**********************************************************
     * METHOD: hasFours()                                     *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: boolean                                   *
     *    true - dice contain any amount of Fours             *
     *    false - dice contains no Fours                      *
     * Test Cases:                                            *
     *    12161 false                                         *
     *    66644 true                                          *
     *    33333 false                                         *
     *    55333 false                                         *
     *    12321 false                                         *
     *********************************************************/
    public boolean hasFours() {
        if (count(4) > 0) {
            return true;
        } else return false;
    }
    /**********************************************************
     * METHOD: scoreFours()                                   *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: integer                                   *
     *    Returns score of all the 4s added up                *
     * Test Cases:                                            *
     *    12161 0                                             *
     *    23456 4                                             *
     *    33333 0                                             *
     *    22555 0                                             *
     *    12321 0                                             *
     *********************************************************/
    public int scoreFours() {
        int score;
        if (count(4) > 0) {
            score = 4 * count(4);
            return score;
        } else return 0;
    }
    /**********************************************************
     * METHOD: hasFives()                                     *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: boolean                                   *
     *    true - dice contain any amount of fives             *
     *    false - dice contains no fives                      *
     * Test Cases:                                            *
     *    12161 false                                         *
     *    66644 false                                         *
     *    33333 false                                         *
     *    55333 true                                          *
     *    12321 false                                         *
     *********************************************************/
    public boolean hasFives() {
        if (count(5) > 0) {
            return true;
        } else return false;
    }
    /**********************************************************
     * METHOD: scoreFives()                                   *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: integer                                   *
     *    Returns score of all the 5s added up                *
     * Test Cases:                                            *
     *    12161 0                                             *
     *    23456 5                                             *
     *    33333 0                                             *
     *    22555 15                                            *
     *    12321 0                                             *
     *********************************************************/
    public int scoreFives() {
        int score;
        if (count(5) > 0) {
            score = 5 * count(5);
            return score;
        } else return 0;
    }
    /**********************************************************
     * METHOD: hasSixes()                                     *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: boolean                                   *
     *    true - dice contain any amount of sixes             *
     *    false - dice contains no sixes                      *
     * Test Cases:                                            *
     *    12161 true                                          *
     *    66644 true                                          *
     *    33333 false                                         *
     *    55333 false                                         *
     *    12321 false                                         *
     *********************************************************/
    public boolean hasSixes() {
        if (count(6) > 0) {
            return true;
        } else return false;
    }
    /**********************************************************
     * METHOD: scoreSixes()                                   *
     * Game(s): Yahtzee!                                      *
     * Parameters: none                                       *
     * Return Type: integer                                   *
     *    Returns score of all the 6s added up                *
     * Test Cases:                                            *
     *    12161 6                                             *
     *    23456 6                                             *
     *    33333 0                                             *
     *    22555 0                                             *
     *    12321 0                                             *
     *********************************************************/
    public int scoreSixes() {
        int score;
        if (count(6) > 0) {
            score = 6 * count(6);
            return score;
        } else return 0;
    }
    /**********************************************************
     * METHOD: reRollDie()                                    *
     * Game(s): Yahtzee!                                      *
     * Parameters: int n (die you want to reroll)             *
     * Return Type: void                                      *
     *    Returns rerolled die value in place of old value    *
     * Test Cases:                                            *
     *    12345 reroll 4 = 12365                              *
     *********************************************************/
    public void reRollDie(int n) {
        for (int i = 0; i < 5; i++) {
            if (getCurrentValue(i) == n) {
                roll(i);
                break;
            }
        }
    }
}
