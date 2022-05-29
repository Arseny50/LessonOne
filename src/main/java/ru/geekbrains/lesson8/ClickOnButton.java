package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickOnButton extends JFrame {
    public ClickOnButton() {
        setBounds(500,500,300,120);
        setTitle("Simple Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton button = new JButton("Нажми сюда!");
        add (button, BorderLayout.CENTER);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                button.setText("Нажал!");
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClickOnButton();
    }

}
