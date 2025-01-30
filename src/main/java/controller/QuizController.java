package controller;

import model.QuizModel;
import view.QuizViewGUI;

public class QuizController {
    private QuizModel model;
    private QuizViewGUI view;

    public QuizController(QuizModel model, QuizViewGUI view) {
        this.model = model;
        this.view = view;
    }

    public void nextQuestion() {
        if (model.hasNextQuestion()) {
            view.displayQuestion(model.getCurrentQuestion());
        } else {
            view.showFinalScore(model.getScore(), model.getTotalQuestions());
        }
    }

    public void checkAnswer(int userAnswer) {
        model.checkAnswer(userAnswer);
        nextQuestion();
    }
}