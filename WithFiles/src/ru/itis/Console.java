package ru.itis;

import ru.itis.utils.CommandsParser;

import javax.swing.*;
import java.awt.*;

// Console - потомок JFrame - окно
public class Console extends JFrame {

    // текстовое поле
    private JTextPane textPane;
    // штука, которая команды автокомплитит
    private CommandsParser parser;

    private String consoleText = "";

    // конструктор
    public Console() {
        super ("Console");
        // границы окна
        setBounds (0, 0, 640, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // создали текстовое окно
        textPane = new JTextPane();
        // сделали его черным цветом
        textPane.setBackground(Color.BLACK);
        textPane.setForeground(Color.LIGHT_GRAY);
        // шрифт задали
        textPane.setFont(new Font("courier", Font.BOLD, 15));
        // добавили слушатель клавиатуры
        textPane.addKeyListener(new ConsoleKeyListener(this));
        // добавили текстовое поле в окно
        getContentPane().add(textPane);
        textPane.setCaretColor(Color.WHITE);
        // сделали видимым
        setVisible (true);

        parser = new CommandsParser();
    }

    public void onCommandTyping(String command) {
        String other = parser.autoCompleteCommand(command + "");
        consoleText = textPane.getText().replace("\t", "");
        textPane.setText(consoleText + "" +  other + " ");
    }
}
