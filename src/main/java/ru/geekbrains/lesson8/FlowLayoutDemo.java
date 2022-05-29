package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {
    public FlowLayoutDemo() {
        setBounds(500,500,500,300);
        setTitle("FlowLayoutDemo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout() );
        for (int i = 0; i <= 30; i++) {
            add (new JButton("Кнопка" + i));
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}
