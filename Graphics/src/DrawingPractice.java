/*********************************************************************
 *  Drawing Practice                                                 *
 *                                                                   *
 *  PROGRAMMER: Charles Carroll                                      *
 *  COURSE: CS201                                                    *
 *  DATE: 9/7/2023                                                   *
 *  REQUIREMENT: Lab 3                                               *
 *                                                                   *
 *  DESCRIPTION:                                                     *
 *  The following program is a drawing of an ocean with the sun and  *
 *  a raft afloat. There are light blue waves crashing in the        *
 *  background, with a text underlined describing the picture in the *
 *  top left. This picture was created using features from the       *
 *  StdDraw library, and was fully created by me Charles Carroll.    *
 *                                                                   *
 *                                                                   *
 *  COPYRIGHT: This code is copyright (C) 2023 Charles Carroll and   *
 *  Dean Zeller                                                      *
 *                                                                   *
 ********************************************************************/
import java.awt.*;
public class DrawingPractice {
    public static void main(String[] args){
        StdDraw.setCanvasSize(1000,1000);
        //draw the sun
        StdDraw.setPenColor(255,255,0);
        StdDraw.filledCircle(.93,.93,.12);
        StdDraw.setPenRadius(.01);
        StdDraw.line(.8,.96,.65,.96);
        StdDraw.line(.8,.90,.65,.87);
        StdDraw.line(.82,.83,.68,.78);
        StdDraw.line(.86,.80,.83,.68);
        StdDraw.line(.94,.78,.94,.68);
        //draw the waves using for loop
        StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
        StdDraw.setPenRadius(.03);
        double x = .2;
        double y = .2;
        int angle1 = 0;
        int angle2 = 180;
        double radius = .2;
        for(int i =0;i<5;i++){
            StdDraw.arc(x,y,radius,angle1,angle2);
            x= x+.1;
        }
        //draw the ocean
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledRectangle(.5,.1,1,.2);
        //draw the raft
        StdDraw.setPenColor(150,75,0);
        StdDraw.filledSquare(.6,.10,.05);
        //write the text
        StdDraw.setPenColor(Color.red);
        Font font = new Font("Comic Sans MS",Font.BOLD,30);
        StdDraw.setFont(font);
        StdDraw.text(.3,.8,"A Raft In The Ocean With Waves");
        //draw the underline of text
        StdDraw.setPenColor(Color.green);
        StdDraw.setPenRadius(.02);
        StdDraw.line(.05,.76,.55,.76);
    }
}
