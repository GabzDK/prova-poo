package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngressoCinemaGui{

    public static void main(String[] args) {

        JFrame frame = new JFrame("Precos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel diaLabel= new JLabel("Dia da semana:");
        JTextField diaField = new JTextField();
        JCheckBox estudanteCheckBox = new JCheckBox("Estudante");
        JButton calcularButton = new JButton("Calcular Preço");
        JLabel resultadoLabel = new JLabel("Preço: ");

        frame.add(diaLabel);
        frame.add(diaField);
        frame.add(estudanteCheckBox);
        frame.add(new JLabel()); // Placeholder for layout alignment
        frame.add(calcularButton);
        frame.add(resultadoLabel);

        // Adiciona o listener ao botão
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String day = diaField.getText().trim().toUpperCase();

                    if (day.isEmpty()) {
                        throw new IllegalArgumentException("Por favor, preencha o campo do dia da semana.");
                    }

                    boolean isStudent = estudanteCheckBox.isSelected();

                    IngressoCinema ingresso = new IngressoCinema(DiaSemana.valueOf(day),isStudent );

                    resultadoLabel.setText(String.format("Preço: R$ %.2f", ingresso.precoIngresso()));

                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Ocorreu um erro inesperado: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Torna o frame visível
        frame.setVisible(true);
    }
}
