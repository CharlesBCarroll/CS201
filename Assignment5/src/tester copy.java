/*********************************************************************
 *  Tester                                                           *
 *                                                                   *
 *  PROGRAMMER: Charles Carroll                                      *
 *  COURSE: CS201                                                    *
 *  DATE: 10/11/2023                                                 *
 *  REQUIREMENT: Assignment 5                                        *
 *                                                                   *
 *  DESCRIPTION:                                                     *
 *  The following program is used as a tester for the Dice program,  *
 *  Hand program, Side program, and Quiz program, it outputs         *
 *  the die rolls, card picked, piece used and where it is moved,    *
 *  and the question, with the answer. All in array lists            *
 *                                                                   *
 *                                                                   *
 *  COPYRIGHT: This code is copyright (C) 2023 Charles Carroll and   *
 *  Dean Zeller                                                      *
 *                                                                   *
 ********************************************************************/
public class tester {
    public static void main(String[] args){
        //Dice
        Dice dice = new Dice(6,5);
        Diecopy b = new Diecopy(6);
        dice.add(b);
        dice.roll(4);
        dice.rolls();
        dice.setCurrentValue(4,6,1051);
        System.out.println(dice);
        dice.printSummary();
        System.out.println(dice.getCurrentValues());
        System.out.println(dice.getCurrentValue(4));
        System.out.println();

        //Hand
        Hand cards = new Hand(6);
        Cardcopy m = new Cardcopy(3, 'C');
        cards.add(m);
        cards.setRank(0,2,2048);
        cards.setRank(1,6,2048);
        cards.setRank(2,9,2048);
        cards.setRank(3,10,2048);
        cards.setRank(4,4,2048);
        cards.setRank(5,1,2048);
        cards.setSuit(0,'S',2048);
        cards.setSuit(1,'C',2048);
        cards.setSuit(2,'H',2048);
        cards.setSuit(3,'H',2048);
        cards.setSuit(4,'D',2048);
        cards.setSuit(5,'S',2048);
        System.out.println(cards);
        cards.printSummary();
        System.out.println(cards.getRank(3));
        System.out.println(cards.getSuit(5));
        System.out.println(cards.getRanks());
        System.out.println(cards.getSuits());
        System.out.println();

        //Side
        Side pieces = new Side(6);
        Piececopy o = new Piececopy("orange",4);
        pieces.add(o);
        pieces.setColor(0,"green",3456);
        pieces.setColor(1,"yellow",3456);
        pieces.setColor(2,"brown",3456);
        pieces.setColor(3,"red",3456);
        pieces.setColor(4,"blue",3456);
        pieces.setColor(5,"purple",3456);
        pieces.setLocation(0,3,3456);
        pieces.setLocation(1,45,3456);
        pieces.setLocation(2,7,3456);
        pieces.setLocation(3,20,3456);
        pieces.setLocation(4,89,3456);
        pieces.setLocation(5,23,3456);
        System.out.println(pieces);
        pieces.printSummary();
        System.out.println(pieces.getColor(3));
        System.out.println(pieces.getLocation(5));
        System.out.println(pieces.getColors());
        System.out.println(pieces.getLocations());
        System.out.println();

        //Quiz
        Quiz questions = new Quiz(6);
        Questioncopy v = new Questioncopy("Who is the president?","Joe Biden", "Joe Biden");
        questions.add(v);
        questions.setContent(0,"Who played the Hulk?",6789);
        questions.setContent(1,"Where is the Great Barrier Reef located?",6789);
        questions.setContent(2,"Which country gifted the Statue of Liberty?",6789);
        questions.setContent(3,"What sport does Cristiano Ronaldo play?",6789);
        questions.setContent(4,"How many bones are there in the human body?",6789);
        questions.setContent(5,"How many points are a touchdown worth?",6789);
        questions.setCorrectAnswer(0,"Mark Ruffalo",6789);
        questions.setCorrectAnswer(1,"Australia",6789);
        questions.setCorrectAnswer(2,"France",6789);
        questions.setCorrectAnswer(3,"Soccer",6789);
        questions.setCorrectAnswer(4,"206",6789);
        questions.setCorrectAnswer(5,"6",6789);
        System.out.println(questions);
        questions.printSummary();
        System.out.println(questions.getContent(3));
        System.out.println(questions.getCorrectAnswer(5));
        System.out.println(questions.getContents());
        System.out.println(questions.getCorrectAnswers());
        System.out.println();
    }
}
