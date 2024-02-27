/*********************************************************************
 *  Hand Object                                                      *
 *                                                                   *
 *  PROGRAMMER: Charles Carroll                                      *
 *  COURSE: CS201                                                    *
 *  DATE: 10/11/23                                                   *
 *  REQUIREMENT: Assignment 5                                        *
 *                                                                   *
 *  DESCRIPTION:                                                     *
 *  The following program is the hand object, which acts as an array *
 *  list of card, holding multiple cards, or a hand, used for games  *
 *                                                                   *
 *  COPYRIGHT: This code is copyright (C) 2023 Charles Carroll and   *
 *  Dean Zeller                                                      *
 *                                                                   *
 ********************************************************************/
import java.util.ArrayList;
import java.util.Collections;

public class Hand {
    ArrayList<Card> cards;
    /***********************************************************
     * METHOD: Hand()                                          *
     * DESCRIPTION: initializes the current attributes         *
     * PARAMETERS: numCards                                    *
     **********************************************************/
    public Hand(int numCards){
        cards = new ArrayList<Card>();
        for(int i=0; i<numCards; i++){
            Card m = new Card();
            this.cards.add(m);
        }
    }
    /***********************************************************
     * METHOD: add()                                           *
     * DESCRIPTION: adds a card to the array of hand           *
     * PARAMETERS: Cardcopy m                                  *
     * RETURN VALUE: none                                      *
     **********************************************************/
    public void add(Card m){
        cards.add(m);
    }
    /***********************************************************
     * METHOD: getRanks()                                      *
     * DESCRIPTION: gets the current ranks of all cards in the *
     * array                                                   *
     * PARAMETERS:                                             *
     * RETURN VALUE: rank values as an arraylist of integers   *
     **********************************************************/
    public ArrayList<Integer> getRanks(){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(Card m : cards){
            nums.add(m.getCurrentRank());
        }
        return nums;
    }
    /***********************************************************
     * METHOD: getRank()                                       *
     * DESCRIPTION: gets the current rank of n in array list   *
     * PARAMETERS: int n                                       *
     * RETURN VALUE: n rank value                              *
     **********************************************************/
    public int getRank(int n){
        Card m = cards.get(n);
        return m.getCurrentRank();
    }
    /***********************************************************
     * METHOD: getSuits()                                      *
     * DESCRIPTION: gets the current Suits of all cards in the *
     * array                                                   *
     * PARAMETERS:                                             *
     * RETURN VALUE: Suit chars as an arraylist of characters  *
     **********************************************************/
    public ArrayList<Character> getSuits(){
        ArrayList<Character> nums = new ArrayList<Character>();
        for(Card m : cards){
            nums.add(m.getCurrentSuit());
        }
        return nums;
    }
    /***********************************************************
     * METHOD: getSuit()                                       *
     * DESCRIPTION: gets the current suit of n in array list   *
     * PARAMETERS: int n                                       *
     * RETURN VALUE: n suit value                              *
     **********************************************************/
    public char getSuit(int n){
        Card m = cards.get(n);
        return m.getCurrentSuit();
    }
    /**********************************************************
     * METHOD: setRank()                                      *
     * DESCRIPTION: To set the rank of a certain card         *
     * PARAMETERS: int n, int x(value), in z(securitycode)    *
     * RETURN VALUE:                                          *
     *********************************************************/
    public void setRank(int n,int x,int z){
        Card m = cards.get(n);
        m.setCurrentRank(x,z);
    }
    /**********************************************************
     * METHOD: setSuit()                                      *
     * DESCRIPTION: To set the Suit of a certain card         *
     * PARAMETERS: int n, char x(value), in z(securitycode)   *
     * RETURN VALUE:                                          *
     *********************************************************/
    public void setSuit(int n, char x,int z){
        Card m = cards.get(n);
        m.setCurrentSuit(x,z);
    }
    /**********************************************************
     * METHOD: toString()                                     *
     * DESCRIPTION: makes printing easier, returns string     *
     * PARAMETERS: cards                                      *
     * RETURN VALUE: each card side by side in string form    *
     *********************************************************/
    public String toString() {
        String stuff = "";
        for(Card m :cards){
            stuff += m+ " ";
        }
        return stuff;
    }
    /**********************************************************
     * METHOD: printSummary()                                 *
     * DESCRIPTION: shows neatly formatted summary of object  *
     * PARAMETERS:                                            *
     * RETURN VALUE: summary text box, with all attributes    *
     *********************************************************/
    public void printSummary(){
        System.out.printf("+" + "-----------------------" + "+%n");
        String s = "| ";
        for(Card m: cards){
            s += m + " ";
        }
        s += "|";
        System.out.printf(s +"%n");
        System.out.printf("+" + "-----------------------" + "+%n");
    }
    /**********************************************************
     * METHOD: countRank()                                    *
     * Game(s): many card games                               *
     * Parameters: int n                                      *
     * Return Type: integer                                   *
     *    The number of n rank cards there are                *
     * Test Cases:                                            *
     *    n=1  4C 5H 9S 1S 10D  1                             *
     *    n=2  4C 5H 9S 1S 10D  0                             *
     *    n=3  4C 5H 9S 1S 10D  0                             *
     *    n=4  4C 5H 9S 1S 10D  1                             *
     *    n=5  4C 5H 9S 1S 10D  1                             *
     *********************************************************/
    public int countRank(int n){
        int sum = 0;
        for(Card m:cards){
            if(m.getCurrentRank()==n){
                sum++;
            }
        }
        return sum;
    }
    /**********************************************************
     * METHOD: countSuit()                                    *
     * Game(s): many card games                               *
     * Parameters: int n                                      *
     * Return Type: integer                                   *
     *    The number of n suit cards there are                *
     * Test Cases:                                            *
     *    n='C'  4C 5H 9S 1S 10D  1                           *
     *    n='D'  4C 5H 9S 1S 10D  1                           *
     *    n='H'  4C 5H 9S 1S 10D  1                           *
     *    n='S'  4C 5H 9S 1S 10D  2                           *
     *********************************************************/
    public int countSuit(char n){
        int sum = 0;
        for(Card m:cards){
            if(m.getCurrentSuit()==n){
                sum++;
            }
        }
        return sum;
    }
    /**********************************************************
     * METHOD: currentSum()                                   *
     * Game(s): blackjack                                     *
     * Parameters: none                                       *
     * Return Type: integer                                   *
     *    The sum of the ranks                                *
     * Test Cases:                                            *
     *    4C 5H 9                                             *
     *    9S 1S 10                                            *
     *    1S 10D 11                                           *
     *    5H 9S 14                                            *
     *    JD 4H 14                                            *
     *********************************************************/
    public int currentSum(){
        int sum = 0;
        for(Card m:cards){
            sum += m.getCurrentRank();
        }
        return sum;
    }
    /**********************************************************
     * METHOD: bust()                                         *
     * Game(s): blackjack                                     *
     * Parameters: none                                       *
     * Return Type: boolean                                   *
     *    true - if the score of the cards is over 21         *
     *    false- if the score of the cards is not over 21     *
     * Test Cases:                                            *
     *    4C 5H false                                         *
     *    9S 1S false                                         *
     *    1S 10D false                                        *
     *    5H 9S false                                         *
     *    JD 4H 8S true                                       *
     *********************************************************/
    public boolean bust(){
        if(currentSum()>21){
            return true;
        }
        return false;
    }
    /**********************************************************
     * METHOD: hasFlush()                                     *
     * Game(s): Poker                                         *
     * Parameters: none                                       *
     * Return Type: boolean                                   *
     *    true - all five cards have the same suit            *
     *    false - there is no suit with five or more cards    *
     * Test Cases:                                            *
     *    4C 5H 9S 1S 10D  false                              *
     *    4C 5H 9S 1S 9S  false                               *
     *    4H 5H 9S 1S 10H  false                              *
     *    4S 5S 9S 1S 10S  true                               *
     *********************************************************/
    public boolean hasFlush(){
        int numH = countSuit('H');
        int numD = countSuit('D');
        int numS = countSuit('S');
        int numC = countSuit('C');
        if(numH>=5){
            return true;
        }
        else if(numC>=5){
            return true;
        }
        else if(numD >=5){
            return true;
        }
        else if(numS>=5){
            return true;
        }
        else return false;
    }
}
