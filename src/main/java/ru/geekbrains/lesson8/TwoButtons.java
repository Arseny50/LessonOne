package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;

public class TwoButtons extends JFrame {
    public TwoButtons() {
        setTitle("New window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,400,400);
        JButton button1 = new JButton("Верхняя кнопка");
        JButton button2 = new JButton("Нижняя кнопка");
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TwoButtons();
    }
}
