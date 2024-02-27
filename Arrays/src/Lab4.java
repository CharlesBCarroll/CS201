/*********************************************************************
 *  ArrayLists                                                       *
 *                                                                   *
 *  PROGRAMMER: Charles Carroll                                      *
 *  COURSE: CS201                                                    *
 *  DATE: 9/18/2023                                                  *
 *  REQUIREMENT: Lab 4                                               *
 *                                                                   *
 *  DESCRIPTION:                                                     *
 *  This code segment demonstrates the use Arraylists and shows the  *
 *  code of an example output.                                       *
 *                                                                   *
 *  COPYRIGHT: This code is copyright (C) 2023 Charles Carroll and   *
 *  Dean Zeller                                                      *
 *                                                                   *
 ********************************************************************/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Lab4 {
    public static void main(String[] args) {
        //Integer
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome to Charles demonstration of ArrayLists on Integers");
        System.out.print("How many integers to start? => ");
        int Size = myObj.nextInt();
        System.out.print("Enter " + Size+ " integers => ");
        for(int i = 0; i < Size; i++){
            myNumbers.add(myObj.nextInt());
        }
        System.out.print("Your numbers are:  ");
        for (int i : myNumbers){
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.print("Lets add some more number. How many numbers to add? => ");
        int Size2 = myObj.nextInt();
        Size += Size2;
        System.out.print("Enter "+ Size2 + " integers => ");
        for(int i=0; i < Size2; i++){
            myNumbers.add(myObj.nextInt());
        }
        System.out.print("Your numbers are:  ");
        for (int i : myNumbers){
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.println("Some Statistics:");
        System.out.printf("%9s %10s %n","Size:", Size);
        int max = Collections.max(myNumbers);
        System.out.printf("%12s %7s %n","Largest:", max);
        int min = Collections.min(myNumbers);
        System.out.printf("%13s %6s %n","Smallest:", min);
        double sum = 0;
        for (int i : myNumbers){
            sum +=i;
        }
        System.out.printf("%8s %11.0f %n","Sum:", sum);
        double average = sum/Size;
        System.out.printf("%12s %11.3f %n","Average:", average);
        Collections.sort(myNumbers);
        System.out.printf("%19s","Sorted order:  ");
        for (int i : myNumbers){
            System.out.printf("%2s",i +" ");
        }
        System.out.println();
        System.out.println();
        //String
        ArrayList<String> myNames = new ArrayList<String>();
        System.out.println("Welcome to Charles demonstration of ArrayLists on Strings");
        System.out.print("How many strings to start? => ");
        int Size3 = myObj.nextInt();
        System.out.print("Enter " + Size3+ " names => ");
        for(int i = 0; i < Size3; i++){
            myNames.add(myObj.next());
        }
        System.out.print("Your names are:  ");
        for (String i : myNames){
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.println("Say hello to everyone:");
        for (String i : myNames){
            System.out.printf("%10s","Hello ");
            System.out.printf(i+"!");
            System.out.println();
        }
        System.out.print("Add some more names. How many more names? =>");
        int Size4 = myObj.nextInt();
        Size3 += Size4;
        System.out.print("Enter "+ Size4 + " names => ");
        for(int i=0; i < Size4; i++){
            myNames.add(myObj.next());
        }
        System.out.println("Say hello to everyone:");
        for (String i : myNames){
            System.out.printf("%10s","Hello ");
            System.out.printf(i+"!");
            System.out.println();
        }
        System.out.println("Some Statistics:");
        System.out.printf("%9s %10s %n","Size:", Size3);
        Collections.sort(myNames);
        System.out.printf("%19s","Sorted order:  ");
        for (String i : myNames){
            System.out.printf("%2s",i +" ");
        }
    }
}
