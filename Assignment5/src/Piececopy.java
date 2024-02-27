/*********************************************************************
 *  Piece object                                                     *
 *                                                                   *
 *  PROGRAMMER: Charles Carroll                                      *
 *  COURSE: CS201                                                    *
 *  DATE: 8/30/2023                                                  *
 *  REQUIREMENT: Assignment 1                                        *
 *                                                                   *
 *  DESCRIPTION:                                                     *
 *  The following program is the Piece object used in the tester     *
 *  program, it is a single Piece, can only be used with the tester  *
 *                                                                   *
 *  COPYRIGHT: This code is copyright (C) 2023 Charles Carroll and   *
 *  Dean Zeller                                                      *
 *                                                                   *
 ********************************************************************/
public class Piececopy {
    String color;
    int location;
    char symbol;
    int securityCode;
    /***********************************************************
     * METHOD: Piece()                                         *
     * DESCRIPTION: initializes the current attributes         *
     * PARAMETERS:  color, location, symbol, securityCode      *
     **********************************************************/
    public Piececopy(String color, int location, char symbol){
        this.color= color;
        this.location= location;
        this.symbol= symbol;
        this.securityCode= 3456;
    }
    /***********************************************************
     * METHOD: Piece()                                         *
     * DESCRIPTION: initializes color, location to 0, symbol to*
     * first letter of color                                   *
     * PARAMETERS:  color, location, symbol, securityCode      *
     **********************************************************/
    public Piececopy(String color){
        this.color= color;
        this.location= 0;
        this.symbol= color.charAt(0);
        this.securityCode = 3456;
    }
    /***********************************************************
     * METHOD: Piece()                                         *
     * DESCRIPTION: initializes attributes, symbol to first    *
     * letter of color.                                        *
     * PARAMETERS:  color, location, symbol, securityCode      *
     **********************************************************/
    public Piececopy(String color,int location){
        this.color= color;
        this.location= location;
        this.symbol= color.charAt(0);
        this.securityCode = 3456;
    }
    /***********************************************************
     * METHOD: getLocation()                                   *
     * DESCRIPTION: get the location of the piece              *
     * PARAMETERS: location                                    *
     * RETURN VALUE: location on board, number                 *
     **********************************************************/
    public int getLocation(){
        return location;
    }
    /***********************************************************
     * METHOD: getColor()                                      *
     * DESCRIPTION: get the color of piece                     *
     * PARAMETERS: color                                       *
     * RETURN VALUE: color of piece, string                    *
     **********************************************************/
    public String getColor(){
        return color;
    }
    /************************************************************
     * METHOD: setLocation                                      *
     * DESCRIPTION: To set the current location to what you want*
     * PARAMETERS: location, newLocation, securityCode          *
     * newSecurityCode                                          *
     * RETURN VALUE: new value for location on board            *
     ***********************************************************/
    public void setLocation(int newLocation, int newSecurityCode){
        if(newSecurityCode==(securityCode)){
            location = newLocation;
        }
        else{
            System.out.println("error: security code incorrect");
        }
    }
    /**********************************************************
     * METHOD: setColor()                                     *
     * DESCRIPTION: To set the current color to what you want *
     * PARAMETERS: color, newColor, securityCode,             *
     * newSecurityCode                                        *
     * RETURN VALUE: new color for piece                      *
     *********************************************************/
    public void setColor(String newColor,int newSecurityCode) {
        if(newSecurityCode==(securityCode)){
            color = newColor;
        }
        else{
            System.out.println("error: security code incorrect");
        }
    }
    /***********************************************************
     * METHOD: getSymbol()                                     *
     * DESCRIPTION: get the symbol of the piece                *
     * PARAMETERS: symbol                                      *
     * RETURN VALUE: symbol of the piece, char                 *
     **********************************************************/
    public char getSymbol(){
        return symbol;
    }
    /**********************************************************
     * METHOD: setSymbol()                                    *
     * DESCRIPTION: To set the current symbol to what you want*
     * PARAMETERS: symbol, newSymbol, securityCode,           *
     * newSecurityCode                                        *
     * RETURN VALUE: new color for piece                      *
     *********************************************************/
    public void setSymbol(char newSymbol, int newSecurityCode){
        if(newSecurityCode==(securityCode)){
            symbol = newSymbol;
        }
        else{
            System.out.println("error: security code incorrect");
        }
    }
    /**********************************************************
     * METHOD: toString()                                     *
     * DESCRIPTION: makes printing easier, returns string     *
     * PARAMETERS: symbol                                     *
     * RETURN VALUE: symbol as a string                       *
     *********************************************************/
    public String toString() {
        String o = "";
        o += color.charAt(0);
        return o;
    }
    /**********************************************************
     * METHOD: printSummary()                                 *
     * DESCRIPTION: shows neatly formatted summary of object  *
     * PARAMETERS: color, location, symbol                    *
     * RETURN VALUE: summary text box, with all attributes    *
     *********************************************************/
    public void printSummary() {
        System.out.printf("+" + "-----------------------" + "+%n");
        System.out.printf("| Color: %14s |%n", this.color);
        System.out.printf("| Location: %11s |%n", this.location);
        System.out.printf("| Symbol: %13s |%n", this.symbol);
        System.out.printf("+" + "-----------------------" + "+%n");
    }

}
