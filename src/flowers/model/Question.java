package flowers.model;

public class Question {

    private Long id;
    private String fileName;
    private String possibleAnswerOne;
    private String possibleAnswerTwo;
    private String possibleAnswerThree;
    private String possibleAnswerFour;
    private String realAnswer;


    public Question(Long id, String fileName, String possibleAnswerOne, String possibleAnswerTwo, String possibleAnswerThree, String possibleAnswerFour, String realAnswer) {
        this.id = id;
        this.fileName = fileName;
        this.possibleAnswerOne = possibleAnswerOne;
        this.possibleAnswerTwo = possibleAnswerTwo;
        this.possibleAnswerThree = possibleAnswerThree;
        this.possibleAnswerFour = possibleAnswerFour;
        this.realAnswer = realAnswer;
    }

    public Question() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPossibleAnswerOne() {
        return possibleAnswerOne;
    }

    public void setPossibleAnswerOne(String possibleAnswerOne) {
        this.possibleAnswerOne = possibleAnswerOne;
    }

    public String getPossibleAnswerTwo() {
        return possibleAnswerTwo;
    }

    public void setPossibleAnswerTwo(String possibleAnswerTwo) {
        this.possibleAnswerTwo = possibleAnswerTwo;
    }

    public String getPossibleAnswerThree() {
        return possibleAnswerThree;
    }

    public void setPossibleAnswerThree(String possibleAnswerThree) {
        this.possibleAnswerThree = possibleAnswerThree;
    }

    public String getPossibleAnswerFour() {
        return possibleAnswerFour;
    }

    public void setPossibleAnswerFour(String possibleAnswerFour) {
        this.possibleAnswerFour = possibleAnswerFour;
    }

    public String getRealAnswer() {
        return realAnswer;
    }

    public void setRealAnswer(String realAnswer) {
        this.realAnswer = realAnswer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", possibleAnswerOne='" + possibleAnswerOne + '\'' +
                ", possibleAnswerTwo='" + possibleAnswerTwo + '\'' +
                ", possibleAnswerThree='" + possibleAnswerThree + '\'' +
                ", possibleAnswerFour='" + possibleAnswerFour + '\'' +
                ", realAnswer='" + realAnswer + '\'' +
                '}';
    }
}
