/*********************************************************************
 *  Side object                                                      *
 *                                                                   *
 *  PROGRAMMER: Charles Carroll                                      *
 *  COURSE: CS201                                                    *
 *  DATE: 10/11/23                                                   *
 *  REQUIREMENT: Assignment 5                                        *
 *                                                                   *
 *  DESCRIPTION:                                                     *
 *  The following program is the Side object, which holds multiple   *
 *  pieces with color and location in an array list, used for games  *
 *                                                                   *
 *  COPYRIGHT: This code is copyright (C) 2023 Charles Carroll and   *
 *  Dean Zeller                                                      *
 *                                                                   *
 ********************************************************************/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Side {
    ArrayList<Piece> pieces;
    /***********************************************************
     * METHOD: Side()                                          *
     * DESCRIPTION: initializes the current attributes         *
     * PARAMETERS: numPieces                                   *
     **********************************************************/
    public Side(int numPieces){
        pieces = new ArrayList<Piece>();
        for(int i=0; i<numPieces; i++){
            Piece o = new Piece("Orange");
            this.pieces.add(o);
        }
    }
    /***********************************************************
     * METHOD: add()                                           *
     * DESCRIPTION: adds a piece to the array of Side          *
     * PARAMETERS: Piececopy o                                 *
     * RETURN VALUE: none                                      *
     **********************************************************/
    public void add(Piece o){
        pieces.add(o);
    }
    /***********************************************************
     * METHOD: getColors()                                     *
     * DESCRIPTION: gets the current colors of all pieces in   *
     * the array                                               *
     * PARAMETERS:                                             *
     * RETURN VALUE: color strings as an arraylist of strings  *
     **********************************************************/
    public ArrayList<String> getColors(){
        ArrayList<String> nums = new ArrayList<String>();
        for(Piece o : pieces){
            nums.add(o.getColor());
        }
        return nums;
    }
    /***********************************************************
     * METHOD: getColor()                                      *
     * DESCRIPTION: gets the current color of n in array list  *
     * PARAMETERS: int n                                       *
     * RETURN VALUE: n color value                             *
     **********************************************************/
    public String getColor(int n){
        Piece o = pieces.get(n);
        return o.getColor();
    }
    /***********************************************************
     * METHOD: getLocations()                                  *
     * DESCRIPTION: gets the current locations of all pieces in*
     * the array                                               *
     * PARAMETERS:                                             *
     * RETURN VALUE: location values as an arraylist of integer*
     **********************************************************/
    public ArrayList<Integer> getLocations(){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(Piece o : pieces){
            nums.add(o.getLocation());
        }
        return nums;
    }
    /***********************************************************
     * METHOD: getLocation()                                   *
     * DESCRIPTION: gets the current location of n in array list*
     * PARAMETERS: int n                                       *
     * RETURN VALUE: n location value                          *
     **********************************************************/
    public int getLocation(int n){
        Piece o = pieces.get(n);
        return o.getLocation();
    }
    /**********************************************************
     * METHOD: setColor()                                     *
     * DESCRIPTION: To set the color of a certain piece       *
     * PARAMETERS: int n, String x(value), in z(securitycode) *
     * RETURN VALUE:                                          *
     *********************************************************/
    public void setColor(int n,String x,int z){
        Piece o = pieces.get(n);
        o.setColor(x,z);
    }
    /**********************************************************
     * METHOD: setLocation()                                  *
     * DESCRIPTION: To set the Location of a certain piece    *
     * PARAMETERS: int n, int x(value), in z(securitycode)    *
     * RETURN VALUE:                                          *
     *********************************************************/
    public void setLocation(int n,int x,int z){
        Piece o = pieces.get(n);
        o.setLocation(x,z);
    }
    /**********************************************************
     * METHOD: toString()                                     *
     * DESCRIPTION: makes printing easier, returns string     *
     * PARAMETERS: pieces                                     *
     * RETURN VALUE: each piece side by side in string format *
     *********************************************************/
    public String toString() {
        String stuff = "";
        for(Piece o: pieces){
            stuff += o + " ";
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
        System.out.printf("+" + "------------------------------------------------------" + "+%n");
        String s = "| ";
        for(Piece o: pieces){
            s += o.getColor() + o.getLocation()+" ";
        }
        s += "|";
        System.out.printf(s +"%n");
        System.out.printf("+" + "------------------------------------------------------" + "+%n");
    }

}
