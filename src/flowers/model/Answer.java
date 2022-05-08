package flowers.model;

public class Answer {

    private String fileName;

    private String answer;

    private String realAnswer;

    private Boolean correctAnswer;

    public Answer() {
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getRealAnswer() {
        return realAnswer;
    }

    public void setRealAnswer(String realAnswer) {
        this.realAnswer = realAnswer;
    }

    public Boolean getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "fileName='" + fileName + '\'' +
                ", answer='" + answer + '\'' +
                ", realAnswer='" + realAnswer + '\'' +
                ", correctAnswer=" + correctAnswer +
                '}';
    }
}
