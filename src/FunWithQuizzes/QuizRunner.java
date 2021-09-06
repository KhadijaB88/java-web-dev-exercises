package FunWithQuizzes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//import static FunWithQuizzes.QuizClass.runQuiz;


public class QuizRunner {


    public static void main(String[] args) {

        TrueFalse question1 = new TrueFalse("Does a dog bark?", "True");

        ArrayList<String> answerChoicesMC = new ArrayList<>();

        answerChoicesMC.add("A.Triceratops");
        answerChoicesMC.add("B.Brachiosaurus");
        answerChoicesMC.add("C. T-Rex");

        MultipleChoice question2 = new MultipleChoice("Choose some carnivorous Dinosaurs:", "C");

        CheckBox question3 = new CheckBox("Choose some herbivore Dinosaurs: A. Triceratops, B.Brachiosaurus C. T-Rex D. A and B", "d");

    }

    }





