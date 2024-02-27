/*********************************************************************
 *  Card Object                                                      *
 *                                                                   *
 *  PROGRAMMER: Charles Carroll                                      *
 *  COURSE: CS201                                                    *
 *  DATE: 8/30/2023                                                  *
 *  REQUIREMENT: Assignment 1                                        *
 *                                                                   *
 *  DESCRIPTION:                                                     *
 *  The following program is the card object used in the tester      *
 *  program, it is a single card, can only be used with the tester   *
 *                                                                   *
 *  COPYRIGHT: This code is copyright (C) 2023 Charles Carroll and   *
 *  Dean Zeller                                                      *
 *                                                                   *
 ********************************************************************/
public class Cardcopy {
    int rank;
    char suit;
    int securityCode;
    /***********************************************************
     * METHOD: Card()                                          *
     * DESCRIPTION: initializes the current attributes         *
     * PARAMETERS:  rank, suit, securityCode                   *
     **********************************************************/
    public Cardcopy(int rank, char suit){
        this.rank = rank;
        this.suit = suit;
        this.securityCode= 2048;
    }
    /***********************************************************
     * METHOD: Card()                                          *
     * DESCRIPTION: initializes rank to 2 and suit to 'C'      *
     * PARAMETERS:  rank, suit, securityCode                   *
     **********************************************************/
    public Cardcopy() {
        this.rank = 11;
        this.suit = 'C';
        this.securityCode=2048;
    }
    /***********************************************************
     * METHOD: getCurrentRank()                                *
     * DESCRIPTION: get the current rank                       *
     * PARAMETERS: rank                                        *
     * RETURN VALUE: value for card, 1-14                      *
     **********************************************************/
    public int getCurrentRank(){
        return rank;
    }
    /***********************************************************
     * METHOD: getCurrentSuit()                                *
     * DESCRIPTION: get the current suit                       *
     * PARAMETERS: suit                                        *
     * RETURN VALUE: Letter for card suit                      *
     **********************************************************/
    public char getCurrentSuit(){
        return suit;
    }
    /**********************************************************
     * METHOD: setCurrentRank()                               *
     * DESCRIPTION: To set the rank to what you want          *
     * PARAMETERS: rank, newRank, securityCode newSecurityCode*
     * RETURN VALUE: new value for rank                       *
     *********************************************************/
    public void setCurrentRank(int newRank, int newSecurityCode){
        if(newSecurityCode==(securityCode)){
            if(newRank >=1 && newRank <= 14){
                rank = newRank;
            }
            else{
                System.out.println("error: Rank values cannot be above 14 or below 1");
            }
        }
        else{
            System.out.println("error: security code incorrect");
        }
    }
    /**********************************************************
     * METHOD: setCurrentSuit()                               *
     * DESCRIPTION: To set the suit to what you want          *
     * PARAMETERS: suit, newSuit, securityCode newSecurityCode*
     * RETURN VALUE: new value for suit                       *
     *********************************************************/
    public void setCurrentSuit(char newSuit, int newSecurityCode){
        if(newSecurityCode==(securityCode)){
            if(newSuit == 'S'||newSuit=='H'||newSuit=='D'||newSuit=='C'){
                suit = newSuit;
            }
            else{
                System.out.println("error: suit must be a spade, heart, diamond, or club");
            }
        }
        else{
            System.out.println("error: security code incorrect");
        }
    }
    /***********************************************************
     * METHOD: getRankChar()                                   *
     * DESCRIPTION: get the current rank as a single character *
     * PARAMETERS: rank, returnRank                            *
     * RETURN VALUE: value for card in character form, A,K,Q,J *
     **********************************************************/
    public char getRankChar() {
        if (rank == 1) {
            return 'a';
        } else if (rank == 2) {
            return '2';
        } else if (rank == 3) {
            return '3';
        } else if (rank == 4) {
            return '4';
        } else if (rank == 5) {
            return '5';
        } else if (rank == 6) {
            return '6';
        } else if (rank == 7) {
            return '7';
        } else if (rank == 8) {
            return '8';
        } else if (rank == 9) {
            return '9';
        } else if (rank == 10) {
            return '0';
        } else if (rank == 11) {
            return 'J';
        } else if (rank == 12) {
            return 'Q';
        } else if (rank == 13) {
            return 'K';
        } else if (rank == 14) {
            return 'A';
        }
        else{
            return ' ';
        }
    }
    /***********************************************************
     * METHOD: getRankString()                                 *
     * DESCRIPTION: get the current rank as a string           *
     * PARAMETERS: rank, returnRankString                      *
     * RETURN VALUE: value for card in string form, ACE, King  *
     **********************************************************/
    public String getRankString(){
        if(rank==1){
            return "One/Ace";
        }
        else if(rank == 2){
            return "Two";
        }
        else if(rank ==3){
            return "Three";
        }
        else if(rank ==4){
            return "Four";
        }
        else if(rank == 5){
            return "Five";
        }
        else if(rank ==6){
            return "Six";
        }
        else if(rank ==7){
            return "Seven";
        }
        else if(rank == 8){
            return "Eight";
        }
        else if(rank == 9){
            return "Nine";
        }
        else if(rank == 10){
            return "Ten";
        }
        else if(rank == 11){
            return "Jack";
        }
        else if(rank == 12){
            return "Queen";
        }
        else if(rank ==13){
            return "King";
        }
        else if(rank == 14){
            return "Ace";
        }
        else{
            return " ";
        }
    }
    /***********************************************************
     * METHOD: getSuitString()                                 *
     * DESCRIPTION: get the current suit as a string           *
     * PARAMETERS: suit, returnSuitString                      *
     * RETURN VALUE: suit of card in string form, Spade, Heart *
     **********************************************************/
    public String getSuitString(){
        if(suit == 'S'){
            return "Spade";
        }
        else if(suit == 'H'){
            return "Heart";
        }
        else if(suit =='D'){
            return "Diamond";
        }
        else if(suit == 'C'){
            return "Club";
        }
        else{
            return " ";
        }
    }
    /**********************************************************
     * METHOD: toString()                                     *
     * DESCRIPTION: makes printing easier, returns string     *
     * PARAMETERS: rank, suit                                 *
     * RETURN VALUE: rank and suit together in string         *
     *********************************************************/
    public String toString() {
        String m = "";
        m += this.rank+""+this.suit;
        return m;
    }
    /**********************************************************
     * METHOD: printSummary()                                 *
     * DESCRIPTION: shows neatly formatted summary of object  *
     * PARAMETERS: rank, suit                                 *
     * RETURN VALUE: summary text box, with all attributes    *
     *********************************************************/
    public void printSummary() {
        System.out.printf("+" + "-----------------------" + "+%n");
        System.out.printf("| Rank: %15s |%n", this.rank);
        System.out.printf("| Suit: %15s |%n", this.suit);
        System.out.printf("+" + "-----------------------" + "+%n");
    }

}
