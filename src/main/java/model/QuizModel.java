package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuizModel {
    private List<Question> questions;
    private int currentQuestionIndex = 0;
    private int score = 0;

    public QuizModel(List<Question> questions) {
        this.questions = questions;
        Collections.shuffle(this.questions); // Embaralha as perguntas
    }

    public boolean hasNextQuestion() {
        return currentQuestionIndex < questions.size();
    }

    public Question getCurrentQuestion() {
        if (hasNextQuestion()) {
            return questions.get(currentQuestionIndex);
        }
        return null;
    }

    public void checkAnswer(int userAnswer) {
        Question question = questions.get(currentQuestionIndex);
        if (question.getCorrectAnswerIndex() == userAnswer) {
            score++;
        }
        currentQuestionIndex++;
    }

    public int getScore() {
        return score;
    }

    public int getTotalQuestions() {
        return questions.size();
    }
}
