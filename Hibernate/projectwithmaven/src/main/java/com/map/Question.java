package com.map;


import java.util.List;

// import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Question {
    @Id
    private int questionId;
    private String question;

    @OneToMany(mappedBy = "question")
    private List<Answer> answer;

    public Question(int questionId, String question, List<Answer> answer) {
        super();
        this.questionId = questionId;
        this.question = question;
        this.answer = answer;
    }

    public Question() {
        super();
    }

    public List<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", question='" + question + '\'' +
                ", answer=" + answer +
                '}';
    }
}
