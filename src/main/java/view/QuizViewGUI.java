package view;

import controller.QuizController;
import model.Question;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class QuizViewGUI extends JFrame {
    private QuizController controller;
    private JLabel questionLabel;
    private JRadioButton[] optionButtons;
    private JButton nextButton;
    private ButtonGroup buttonGroup;

    public QuizViewGUI() {
        setTitle("Quiz OCA 1Z0-808");
        setSize(600, 400); // Aumentando o tamanho da tela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Painel para a pergunta
        questionLabel = new JLabel("Pergunta aqui", SwingConstants.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(questionLabel, BorderLayout.NORTH);

        // Painel para opções
        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(4, 1));
        optionButtons = new JRadioButton[4];
        buttonGroup = new ButtonGroup();

        for (int i = 0; i < 4; i++) {
            optionButtons[i] = new JRadioButton();
            buttonGroup.add(optionButtons[i]);
            optionsPanel.add(optionButtons[i]);
        }

        add(optionsPanel, BorderLayout.CENTER);

        // Botão "Próxima"
        nextButton = new JButton("Próxima Pergunta");
        add(nextButton, BorderLayout.SOUTH);

        // Ação do botão "Próxima"
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processAnswer();
            }
        });

        setVisible(true);
    }

    public void setController(QuizController controller) {
        this.controller = controller;
        controller.nextQuestion(); // Carrega a primeira pergunta
    }

    public void displayQuestion(Question question) {
        questionLabel.setText(question.getText());
        List<String> options = question.getOptions();

        // Garantir que não haja erro de índice
        for (int i = 0; i < optionButtons.length; i++) {
            if (i < options.size()) {
                optionButtons[i].setText(options.get(i));
                optionButtons[i].setVisible(true);
            } else {
                optionButtons[i].setVisible(false); // Ocultar botões extras caso não haja 4 opções
            }
        }

        // Desmarcar todas as opções ao carregar uma nova pergunta
        buttonGroup.clearSelection();
    }

    private void processAnswer() {
        int selectedIndex = -1;
        for (int i = 0; i < optionButtons.length; i++) {
            if (optionButtons[i].isSelected()) {
                selectedIndex = i;
                break;
            }
        }

        if (selectedIndex != -1) {
            controller.checkAnswer(selectedIndex);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma opção antes de continuar.");
        }
    }

    public void showFinalScore(int score, int totalQuestions) {
        JOptionPane.showMessageDialog(this, "Quiz finalizado!\nAcertos: " + score + " de " + totalQuestions);
        System.exit(0);
    }
}