/*********************************************************************
 *  Die Tester                                                       *
 *                                                                   *
 *  PROGRAMMER: Charles Carroll                                      *
 *  COURSE: CS201                                                    *
 *  DATE: 8/30/2023                                                  *
 *  REQUIREMENT: Lab 2                                               *
 *                                                                   *
 *  DESCRIPTION:                                                     *
 *  The following program is used as a tester for the die program,   *
 *  it rolls and changes the sides 4 times, outputting the 10        *
 *  different rolls.                                                 *
 *                                                                   *
 *  COPYRIGHT: This code is copyright (C) 2023 Charles Carroll and   *
 *  Dean Zeller                                                      *
 *                                                                   *
 ********************************************************************/
public class DieTester {
    public static void main(String[] args){
        //6 sided die, rolled 10 times
        Die d = new Die(6);
        System.out.println("Rolling a 6-sided die 10 times:");
        for(int i=0; i < 10; i++){
            d.roll();
            System.out.print(d.getCurrentValue()+" ");
        }
        //Prints new line to start, then a 10 sided die rolled 10 times
        System.out.println();
        Die f = new Die(10);
        System.out.println("Rolling a 10-sided die 10 times:");
        for(int i=0; i < 10; i++){
            f.roll();
            System.out.print(f.getCurrentValue()+" ");
        }
        //Prints new line, 20 sided die rolled 10 times
        System.out.println();
        Die h = new Die(20);
        System.out.println("Rolling a 20-sided die 10 times:");
        for(int i=0; i < 10; i++){
            h.roll();
            System.out.print(h.getCurrentValue()+" ");
        }
        //Prints new line, 100 sided die rolled 10 times
        System.out.println();
        Die l = new Die(100);
        System.out.println("Rolling a 100-sided die 10 times:");
        for(int i=0; i < 10; i++){
            l.roll();
            System.out.print(l.getCurrentValue()+" ");
        }
    }
}