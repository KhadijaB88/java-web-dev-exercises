package FunWithQuizzes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class CheckBox extends Question{

    public CheckBox(String questionText, String answer){
        super(questionText, answer);
    }

    public boolean correctAnswer(String answer){

        if(answer.toLowerCase().equals(this.getAnswer().toLowerCase())) {
            return true;
        }else{
            return false;
        }
    }

}
