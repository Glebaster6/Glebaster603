package ru.itis;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ConsoleKeyListener implements KeyListener {

    private Console console;
    private String commandStartCharacters = "";

    public ConsoleKeyListener(Console console) {
        this.console = console;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char character = e.getKeyChar();
        if (character == '\t') {
            console.onCommandTyping(commandStartCharacters);
            commandStartCharacters = "";
        } else if (character == '\b') {
            // commandStartCharacters = commandStartCharacters.substring(0, commandStartCharacters.length() - 2);
        } else if (character != '\n') {
            commandStartCharacters += character;
        }  else {
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
