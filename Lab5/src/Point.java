/*********************************************************************
 *  Point Object                                                    *
 *                                                                   *
 *  PROGRAMMER: Charles Carroll                                      *
 *  COURSE: CS201                                                    *
 *  DATE: 10/2/23                                                    *
 *  REQUIREMENT: Lab 5                                               *
 *                                                                   *
 *  DESCRIPTION:                                                     *
 *  The following program is the point object that initiates the     *
 *  point with x and y values, and has methods used in the tester to *
 *  set, get or find origin of the point.                            *
 *                                                                   *
 *  COPYRIGHT: This code is copyright (C) 2023 Charles Carroll and   *
 *  Dean Zeller                                                      *
 *                                                                   *
 ********************************************************************/
import java.lang.Math;
public class Point {
    // Fields
    private int x;
    private int y;
    public double d;
    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Getters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    // Setters
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    // Instance print method
    public void print() {
        System.out.println("x=" + x + ", y=" + y);
    }
    /**********************************************************
     * METHOD: distanceFromOrigin()                           *
     * DESCRIPTION: To calculate distance from origin for     *
     * point provided                                         *
     * PARAMETERS:                                            *
     * RETURN VALUE: Distance from origin                     *
     *********************************************************/
    public double distanceFromOrigin(){
        this.d= Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return d;
    }
}