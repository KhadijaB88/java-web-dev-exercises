package FunWithQuizzes;

public class TrueFalse extends Question {
    public TrueFalse(String questionText, String answer) {
        super(questionText, answer);
    }

    public boolean correctAnswer(String answer) {

        if(answer.toLowerCase().equals(this.getAnswer().toLowerCase())) {
            return true;
        }else {
            return false;
        }
    }
}

