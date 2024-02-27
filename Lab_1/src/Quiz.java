/*********************************************************************
 *  Quiz object                                                      *
 *                                                                   *
 *  PROGRAMMER: Charles Carroll                                      *
 *  COURSE: CS201                                                    *
 *  DATE: 10/11/23                                                   *
 *  REQUIREMENT: Assignment 5                                        *
 *                                                                   *
 *  DESCRIPTION:                                                     *
 *  The following program is the Quiz object, it stores multiple     *
 *  questions from the question program in an array list, for games  *
 *                                                                   *
 *  COPYRIGHT: This code is copyright (C) 2023 Charles Carroll and   *
 *  Dean Zeller                                                      *
 *                                                                   *
 ********************************************************************/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Quiz {
    ArrayList<Question> questions;
    /***********************************************************
     * METHOD: Quiz()                                          *
     * DESCRIPTION: initializes the current attributes         *
     * PARAMETERS: numQuestions                                *
     **********************************************************/
    public Quiz(int numQuestions){
        questions = new ArrayList<Question>();
        for(int i=0; i<numQuestions; i++){
            Question v = new Question("Who is the President?","Joe Biden", "Joe Biden");
            this.questions.add(v);
        }
    }
    /***********************************************************
     * METHOD: add()                                           *
     * DESCRIPTION: adds a question to the array of quiz       *
     * PARAMETERS: Questioncopy v                              *
     * RETURN VALUE: none                                      *
     **********************************************************/
    public void add(Question v){
        questions.add(v);
    }
    /***********************************************************
     * METHOD: getContents()                                   *
     * DESCRIPTION: gets the current contents of all pieces in *
     * the array                                               *
     * PARAMETERS:                                             *
     * RETURN VALUE: content strings as an arraylist of strings*
     **********************************************************/
    public ArrayList<String> getContents(){
        ArrayList<String> nums = new ArrayList<String>();
        for(Question v : questions){
            nums.add(v.getContent());
        }
        return nums;
    }
    /***********************************************************
     * METHOD: getContent()                                    *
     * DESCRIPTION: get the content of n in the arraylist      *
     * PARAMETERS: int n                                       *
     * RETURN VALUE: n content in array                        *
     **********************************************************/
    public String getContent(int n){
        Question v = questions.get(n);
        return v.getContent();
    }
    /***********************************************************
     * METHOD: getCorrectAnswers()                             *
     * DESCRIPTION: gets the correct answers for all the items *
     * in the array list                                       *
     * PARAMETERS:                                             *
     * RETURN VALUE: correctAnswer strings as an arraylist of  *
     * strings                                                 *
     **********************************************************/
    public ArrayList<String> getCorrectAnswers(){
        ArrayList<String> nums = new ArrayList<String>();
        for(Question v : questions){
            nums.add(v.getCorrectAnswer());
        }
        return nums;
    }
    /***********************************************************
     * METHOD: getCorrectAnswer()                              *
     * DESCRIPTION: get the correctAnswer of n in the arraylist*
     * PARAMETERS: int n                                       *
     * RETURN VALUE: n correctAnswer in array                  *
     **********************************************************/
    public String getCorrectAnswer(int n) {
        Question v = questions.get(n);
        return v.getCorrectAnswer();
    }
    /**********************************************************
     * METHOD: setContent()                                   *
     * DESCRIPTION: To set the content of a certain question  *
     * PARAMETERS: int n, String x(value), in z(securitycode) *
     * RETURN VALUE:                                          *
     *********************************************************/
    public void setContent(int n,String x,int z){
        Question v = questions.get(n);
        v.setContent(x,z);
    }
    /**********************************************************
     * METHOD: setCorrectAnswer()                             *
     * DESCRIPTION: To set the correctAnswer of a certain     *
     * question                                               *
     * PARAMETERS: int n, String x(value), in z(securitycode) *
     * RETURN VALUE:                                          *
     *********************************************************/
    public void setCorrectAnswer(int n,String x,int z){
        Question v = questions.get(n);
        v.setCorrectAnswer(x,z);
    }
    /**********************************************************
     * METHOD: toString()                                     *
     * DESCRIPTION: makes printing easier, returns string     *
     * PARAMETERS: questions                                  *
     * RETURN VALUE: question content seperated by newlines   *
     *********************************************************/
    public String toString() {
        String stuff = "";
        for(Question v: questions){
            stuff += v + " " + "\n";
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
        System.out.printf("+" + "-------------------------------------------" + "+%n");
        String s = "";
        for(Question v: questions){
            s += v +"\n";
        }
        System.out.printf(s);
        System.out.printf("+" + "-------------------------------------------" + "+%n");
    }
}
