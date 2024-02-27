/*********************************************************************
 *  Die object                                                       *
 *                                                                   *
 *  PROGRAMMER: Charles Carroll                                      *
 *  COURSE: CS201                                                    *
 *  DATE: 8/30/2023                                                  *
 *  REQUIREMENT: Lab 2                                               *
 *                                                                   *
 *  DESCRIPTION:                                                     *
 *  The following program is used as a piece of a game or just a Die,*
 *  it is the Die itself, and it cannot be used by itself unless it  *
 *  has a tester.                                                    *
 *                                                                   *
 *  COPYRIGHT: This code is copyright (C) 2023 Charles Carroll and   *
 *  Dean Zeller                                                      *
 *                                                                   *
 ********************************************************************/
import java.util.Random;
//This package allows for the use of random numbers
public class Diecopy {
    //attributes for Die objects
    int numSides, currentValue;
    int securityCode;

    /***********************************************************
     * METHOD: Die()                                           *
     * DESCRIPTION: initializes the current attributes         *
     * PARAMETERS:  numSides, securityCode                     *
     **********************************************************/
    public Diecopy(int numSides){
        this.numSides = numSides;
        this.securityCode = 1051;
    }
    /***********************************************************
     * METHOD: Die()                                           *
     * DESCRIPTION: initializes numSides to 6                  *
     * PARAMETERS:  numSides, securityCode                     *
     **********************************************************/
    public Diecopy(){
        this.numSides = 6;
        this.securityCode = 1051;
    }

    /***********************************************************
     * METHOD: getCurrentValue()                               *
     * DESCRIPTION: get the current value                      *
     * PARAMETERS: currentValue                                *
     * RETURN VALUE: value for die roll                        *
     **********************************************************/
    public int getCurrentValue(){
        return currentValue;
    }
    /**********************************************************
     * METHOD: setCurrentValue()                              *
     * DESCRIPTION: To set the currentValue to what you want  *
     * PARAMETERS: currentValue, newValue, securityCode       *
     * newSecurityCode                                        *
     * RETURN VALUE: new value for die roll                   *
     *********************************************************/
    public void setCurrentValue(int newValue,int newSecurityCode) {
        if(newSecurityCode==(securityCode)){
            if(newValue >=1 && newValue <= numSides){
                currentValue = newValue;
            }
            else{
                System.out.println("error: the new value is not within die range");
            }
        }
        else{
            System.out.println("error: security code incorrect");
        }
    }
    /**********************************************************
     * METHOD: roll()                                         *
     * DESCRIPTION: outputs random number within numSides     *
     * PARAMETERS: numSides, currentValue                     *
     * RETURN VALUE: new value of die after random roll       *
     *********************************************************/
    public void roll(){
        Random rand = new Random();
        currentValue = rand.nextInt(numSides);
        currentValue += 1;
    }
    /**********************************************************
     * METHOD: toString()                                     *
     * DESCRIPTION: makes printing easier, returns string     *
     * PARAMETERS: currentValue                               *
     * RETURN VALUE: the current value of die in string form  *
     *********************************************************/
    public String toString() {
        String d = "";
        d += this.currentValue;
        return d;
    }
    /**********************************************************
     * METHOD: printSummary()                                 *
     * DESCRIPTION: shows neatly formatted summary of object  *
     * PARAMETERS: currentValue, numSides                     *
     * RETURN VALUE: summary text box, with all attributes    *
     *********************************************************/
    public void printSummary() {
        System.out.printf("+" + "-----------------------" + "+%n");
        System.out.printf("| Number of Sides: %4s |%n", this.numSides);
        System.out.printf("| Current Value: %6s |%n",this.currentValue);
        System.out.printf("+" + "-----------------------" + "+%n");
    }

}