/*********************************************************************
 *  Tester                                                           *
 *                                                                   *
 *  PROGRAMMER: Charles Carroll                                      *
 *  COURSE: CS201                                                    *
 *  DATE: 8/30/2023                                                  *
 *  REQUIREMENT: Assignment 1                                        *
 *                                                                   *
 *  DESCRIPTION:                                                     *
 *  The following program is used as a tester for the Die program,   *
 *  Card program, Piece program, and Question program, it outputs    *
 *  the die rolls, card picked, piece used and where it is moved,    *
 *  and the question, with the answer and if it is true or false.    *
 *                                                                   *
 *                                                                   *
 *  COPYRIGHT: This code is copyright (C) 2023 Charles Carroll and   *
 *  Dean Zeller                                                      *
 *                                                                   *
 ********************************************************************/
public class Testercopy{
    public static void main(String[] args){
        //CARD
        Cardcopy m = new Cardcopy();
        System.out.println("Picking a Card from a 52 card deck:");
        System.out.println(m.getRankChar()+" "+m.getSuitString());
        m.printSummary();
        //DIE
        Diecopy d = new Diecopy();
        System.out.println("Rolling a 6-sided die 10 times:");
        for(int i=0; i < 10; i++){
            d.roll();
            System.out.print(d+" ");
        }
        System.out.println();
        d.setCurrentValue(3,1051);
        d.printSummary();
        //PIECE
        Piececopy o = new Piececopy("Black");
        System.out.println("Selecting a piece color and board location:");
        System.out.println(o);
        o.printSummary();
        //QUESTION
        Questioncopy v = new Questioncopy("What is the biggest animal?","Blue whale","Blue whale");
        System.out.println(v.getContent());
        System.out.println(v.getUserResponse());
        System.out.println("The correct answer is "+ v.getCorrectAnswer());
        System.out.println(v.isCorrect());
        v.printSummary();
    }
}
