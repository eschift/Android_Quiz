package com.erica.got_quiz;

/**
 * Created by schif_000 on 5/10/2016.
 */
public class Question {
    private int ID;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String answer;
    public Question()
    {
        ID = 0;
        question="";
        option1="";
        option2="";
        option3="";
        option4="";
        answer="";
    }
    public Question(String Question, String Option1, String Option2, String Option3, String Option4, String Answer) {
        question = Question;
        option1 = Option1;
        option2 = Option2;
        option3 = Option3;
        option4 = Option4;
        answer = Answer;
    }

    public int getID() {
        return ID;
    }

    public String getQuestion() {
        return question;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getAnswer() {
        return answer;
    }

    public void setID(int id) {
        this.ID = id;
    }

    public void setQuestion(String Question) {
        this.question = Question;
    }

    public void setOption1(String Option1) {
        option1 = Option1;
    }

    public void setOption2(String Option2) {
        option2 = Option2;
    }

    public void setOption3(String Option3) {
        option3 = Option3;
    }

    public void setOption4(String Option4) {
        option4 = Option4;
    }

    public void setAnswer(String Answer) {
        this.answer = Answer;
    }

}
