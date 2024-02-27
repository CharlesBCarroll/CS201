/*********************************************************************
 *  Question object                                                  *
 *                                                                   *
 *  PROGRAMMER: Charles Carroll                                      *
 *  COURSE: CS201                                                    *
 *  DATE: 8/30/2023                                                  *
 *  REQUIREMENT: Assignment 1                                        *
 *                                                                   *
 *  DESCRIPTION:                                                     *
 *  The following program is the question object, it is to be used   *
 *  in the tester program, it can not be used on its own.            *
 *                                                                   *
 *  COPYRIGHT: This code is copyright (C) 2023 Charles Carroll and   *
 *  Dean Zeller                                                      *
 *                                                                   *
 ********************************************************************/
public class Question {
    String content;
    String userResponse;
    String correctAnswer;
    boolean Correct;
    int securityCode;
    /***********************************************************
     * METHOD: Question()                                      *
     * DESCRIPTION: initializes the current attributes         *
     * PARAMETERS: content, userResponse, correctAnswer,       *
     * securityCode                                            *
     **********************************************************/
    public Question(String content,String userResponse, String correctAnswer){
        this.content = content;
        this.userResponse = userResponse;
        this.correctAnswer = correctAnswer;
        this.securityCode = 6789;
    }
    /***********************************************************
     * METHOD: getContent()                                    *
     * DESCRIPTION: get the content/question being asked       *
     * PARAMETERS: content                                     *
     * RETURN VALUE: question being asked                      *
     **********************************************************/
    public String getContent(){
        return content;
    }
    /***********************************************************
     * METHOD: getUserResponse()                               *
     * DESCRIPTION: get the users response to the question     *
     * PARAMETERS: userResponse                                *
     * RETURN VALUE: answer to question by user                *
     **********************************************************/
    public String getUserResponse(){
        return userResponse;
    }
    /***********************************************************
     * METHOD: getCorrectAnswer()                                *
     * DESCRIPTION: get the correct answer to the question     *
     * PARAMETERS: correctAnswer                               *
     * RETURN VALUE: the correct answer to the question        *
     **********************************************************/
    public String getCorrectAnswer(){
        return correctAnswer;
    }
    /*******************************************************************
     * METHOD: setUserResponse()                                         *
     * DESCRIPTION: To set the current response to what the user wants *
     * PARAMETERS: userResponse, newUserResponse                       *
     * RETURN VALUE: new user response to question                     *
     ******************************************************************/
    public String setUserResponse(String newUserResponse){
        userResponse = newUserResponse;
        return newUserResponse;
    }
    /*******************************************************************
     * METHOD: setContent()                                            *
     * DESCRIPTION: To set the content to what the user wants          *
     * PARAMETERS: content, newContent, securityCode,                  *
     * newSecurityCode                                                 *
     * RETURN VALUE: updated content                                   *
     ******************************************************************/
    public void setContent(String newContent, int newSecurityCode){
        if(newSecurityCode==(securityCode)){
            content=newContent;
        }
        else{
            System.out.println("error: security code incorrect");
        }
    }
    /*******************************************************************
     * METHOD: setCorrectAnswer()                                      *
     * DESCRIPTION: To set the correct answer to what the user wants   *
     * PARAMETERS: correctAnswer, newCorrectAnswer, securityCode       *
     * newSecurityCode                                                 *
     * RETURN VALUE: new correct answer to question                    *
     ******************************************************************/
    public void setCorrectAnswer(String newCorrectAnswer, int newSecurityCode){
        if(newSecurityCode==(securityCode)){
            correctAnswer = newCorrectAnswer;
        }
        else{
            System.out.println("error: security code incorrect");
        }
    }
    /**********************************************************
     * METHOD: isCorrect()                                    *
     * DESCRIPTION: determines if user response is equal to   *
     * the correct answer                                     *
     * PARAMETERS: userResponse, correctAnswer, Correct       *
     * RETURN VALUE: true or false                            *
     *********************************************************/
    public boolean isCorrect(){
        if(userResponse.equals(correctAnswer)){
            Correct = true;
        }
        return Correct;
    }
    /**********************************************************
     * METHOD: toString()                                     *
     * DESCRIPTION: makes printing easier, returns string     *
     * PARAMETERS: content                                    *
     * RETURN VALUE: content as a string                      *
     *********************************************************/
    public String toString() {
        String v = "";
        v += this.content;
        return v;
    }
    /**********************************************************
     * METHOD: printSummary()                                 *
     * DESCRIPTION: shows neatly formatted summary of object  *
     * PARAMETERS: content, correctAnswer, userResponse       *
     * RETURN VALUE: summary text box, with all attributes    *
     *********************************************************/
    public void printSummary() {
        System.out.printf("+" + "------------------------------------------------" + "+%n");
        System.out.printf("| Content: %37s |%n", this.content);
        System.out.printf("| Correct Answer: %30s |%n", this.correctAnswer);
        System.out.printf("| User Response: %31s |%n", this.userResponse);
        System.out.printf("+" + "------------------------------------------------" + "+%n");
    }
}
