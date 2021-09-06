package FunWithQuizzes;

public abstract class Question {


    private String questionText;
    protected String answer;

    public Question(String questionText, String answer) {

        this.questionText = questionText;
        this.answer = answer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getAnswer() {
        return answer;
    }

    public abstract boolean correctAnswer(String answer);
}