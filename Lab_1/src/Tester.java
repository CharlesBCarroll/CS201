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
public class Tester {
    public static void main(String[] args){
        //CARD
        Card m = new Card();
        System.out.println("Picking a Card from a 52 card deck:");
        System.out.println(m.getRankChar()+" "+m.getSuitString());
        m.printSummary();
        //DIE
        Die d = new Die();
        System.out.println("Rolling a 6-sided die 10 times:");
        for(int i=0; i < 10; i++){
            d.roll();
            System.out.print(d+" ");
        }
        System.out.println();
        d.setCurrentValue(3,1051);
        d.printSummary();
        //PIECE
        Piece o = new Piece("Black");
        System.out.println("Selecting a piece color and board location:");
        System.out.println(o);
        o.printSummary();
        //QUESTION
        Question v = new Question("What is the biggest animal?","Blue whale","Blue whale");
        System.out.println(v.getContent());
        System.out.println(v.getUserResponse());
        System.out.println("The correct answer is "+ v.getCorrectAnswer());
        System.out.println(v.isCorrect());
        v.printSummary();
        System.out.println();

        //Dice
        Dice dice = new Dice(6,5);
        Die b = new Die(6);
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
        Hand cards = new Hand(5);
        cards.setRank(0,2,2048);
        cards.setRank(1,1,2048);
        cards.setRank(2,9,2048);
        cards.setRank(3,1,2048);
        cards.setRank(4,4,2048);
        cards.setSuit(0,'D',2048);
        cards.setSuit(1,'D',2048);
        cards.setSuit(2,'D',2048);
        cards.setSuit(3,'D',2048);
        cards.setSuit(4,'C',2048);
        System.out.println(cards);
        cards.printSummary();
        System.out.println(cards.getRank(3));
        System.out.println(cards.getSuit(4));
        System.out.println(cards.getRanks());
        System.out.println(cards.getSuits());
        System.out.println();

        //Side
        Side pieces = new Side(6);
        Piece p = new Piece("orange",4);
        pieces.add(p);
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
        Question n = new Question("Who is the president?","Joe Biden", "Joe Biden");
        questions.add(n);
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
