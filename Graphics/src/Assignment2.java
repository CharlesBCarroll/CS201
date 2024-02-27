/*********************************************************************
 *  Checkerboard/Assignment2                                         *
 *                                                                   *
 *  PROGRAMMER: Charles Carroll                                      *
 *  COURSE: CS201                                                    *
 *  DATE: 9/11/2023                                                  *
 *  REQUIREMENT: Assignment 2                                        *
 *                                                                   *
 *  DESCRIPTION:                                                     *
 *  The following program is a animation of a checkerboard, with 6   *
 *  checkers of each color, red and blue, coming onto screen like a  *
 *  player was placing them onto the board. Then a start screen comes*
 *  up, as if it were an online game.                                *
 *                                                                   *
 *                                                                   *
 *  COPYRIGHT: This code is copyright (C) 2023 Charles Carroll and   *
 *  Dean Zeller                                                      *
 *                                                                   *
 ********************************************************************/
import java.awt.*;
public class Assignment2 {
    public static void main(String[] args){
        //Canvas size
        StdDraw.setCanvasSize(1000,1000);
        //checkerboard
        int N = 6;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((i + j) % 2 != 0) StdDraw.setPenColor(StdDraw.BLACK);
                else                  StdDraw.setPenColor(StdDraw.RED);
                StdDraw.filledSquare(i + .5, j + .5, .5);
            }
        }
        //enable double buffering so it comes onto screen at a different rate
        //6 red checkers each coming onto screen at about a 1-second rate
        StdDraw.enableDoubleBuffering();
        StdDraw.setPenRadius(.02);
        StdDraw.setPenColor(Color.red);
        StdDraw.circle(3.5, .55, .4);
        StdDraw.setPenRadius();
        StdDraw.setPenColor(139, 0, 0);
        StdDraw.filledCircle(3.5, .55, .39);
        StdDraw.show(1000);

        StdDraw.setPenRadius(.02);
        StdDraw.setPenColor(Color.red);
        StdDraw.circle(1.5, .55, .4);
        StdDraw.setPenRadius();
        StdDraw.setPenColor(139, 0, 0);
        StdDraw.filledCircle(1.5, .55, .39);
        StdDraw.show(1000);

        StdDraw.setPenRadius(.02);
        StdDraw.setPenColor(Color.red);
        StdDraw.circle(5.5, .55, .4);
        StdDraw.setPenRadius();
        StdDraw.setPenColor(139, 0, 0);
        StdDraw.filledCircle(5.5, .55, .39);
        StdDraw.show(1000);

        StdDraw.setPenRadius(.02);
        StdDraw.setPenColor(Color.red);
        StdDraw.circle(.5, 1.5, .4);
        StdDraw.setPenRadius();
        StdDraw.setPenColor(139, 0, 0);
        StdDraw.filledCircle(.5, 1.5, .39);
        StdDraw.show(1000);

        StdDraw.setPenRadius(.02);
        StdDraw.setPenColor(Color.red);
        StdDraw.circle(2.5, 1.5, .4);
        StdDraw.setPenRadius();
        StdDraw.setPenColor(139, 0, 0);
        StdDraw.filledCircle(2.5, 1.5, .39);
        StdDraw.show(1000);

        StdDraw.setPenRadius(.02);
        StdDraw.setPenColor(Color.red);
        StdDraw.circle(4.5, 1.5, .4);
        StdDraw.setPenRadius();
        StdDraw.setPenColor(139, 0, 0);
        StdDraw.filledCircle(4.5, 1.5, .39);
        StdDraw.show(1000);

        //6 blue checkers each coming onto screen at a 1-second rate
        StdDraw.setPenRadius(.02);
        StdDraw.setPenColor(Color.blue);
        StdDraw.circle(.5,5.5,.4);
        StdDraw.setPenRadius();
        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
        StdDraw.filledCircle(.5,5.5,.39);
        StdDraw.show(1000);

        StdDraw.setPenRadius(.02);
        StdDraw.setPenColor(Color.blue);
        StdDraw.circle(2.5,5.5,.4);
        StdDraw.setPenRadius();
        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
        StdDraw.filledCircle(2.5,5.5,.39);
        StdDraw.show(1000);

        StdDraw.setPenRadius(.02);
        StdDraw.setPenColor(Color.blue);
        StdDraw.circle(4.5,5.5,.4);
        StdDraw.setPenRadius();
        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
        StdDraw.filledCircle(4.5,5.5,.39);
        StdDraw.show(1000);

        StdDraw.setPenRadius(.02);
        StdDraw.setPenColor(Color.blue);
        StdDraw.circle(1.5,4.5,.4);
        StdDraw.setPenRadius();
        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
        StdDraw.filledCircle(1.5,4.5,.39);
        StdDraw.show(1000);

        StdDraw.setPenRadius(.02);
        StdDraw.setPenColor(Color.blue);
        StdDraw.circle(3.5,4.5,.4);
        StdDraw.setPenRadius();
        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
        StdDraw.filledCircle(3.5,4.5,.39);
        StdDraw.show(1000);

        StdDraw.setPenRadius(.02);
        StdDraw.setPenColor(Color.blue);
        StdDraw.circle(5.5,4.5,.4);
        StdDraw.setPenRadius();
        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
        StdDraw.filledCircle(5.5,4.5,.39);
        StdDraw.show(1000);

        //box in middle with word "Start", if this was used for a checker game
        StdDraw.setPenRadius();
        StdDraw.setPenColor(Color.pink);
        StdDraw.filledRectangle(3,3,1.5,1);
        StdDraw.setPenColor(Color.yellow);
        Font font = new Font("Comic Sans MS",Font.BOLD,80);
        StdDraw.setFont(font);
        StdDraw.text(3,3,"START");
        StdDraw.show(1000);
    }
}


