package FunWithQuizzes;

import java.util.ArrayList;

public class MultipleChoice extends Question {

    public MultipleChoice(String questionText, String answer) {
        super(questionText, answer);
    }


    public boolean correctAnswer(String answer){
     if(answer.toLowerCase().equals(this.getAnswer().toLowerCase())) {
        return true;
    }else {
        return false;


        }
    }
}

