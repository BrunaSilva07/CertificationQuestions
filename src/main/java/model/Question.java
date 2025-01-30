package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question {
    private final String text;
    private final List<String> options;
    private int correctAnswerIndex;

    public Question(String text, List<String> options, int correctAnswerIndex) {
        this.text = text;
        this.options = new ArrayList<>(options); // Criar cópia para evitar modificar lista original
        shuffleOptions(correctAnswerIndex);
    }

    private void shuffleOptions(int originalCorrectIndex) {
        String correctAnswer = options.get(originalCorrectIndex); // Salva a resposta correta
        Collections.shuffle(options); // Embaralha as respostas
        correctAnswerIndex = options.indexOf(correctAnswer); // Atualiza o índice da resposta correta
    }

    public String getText() {
        return text;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
}