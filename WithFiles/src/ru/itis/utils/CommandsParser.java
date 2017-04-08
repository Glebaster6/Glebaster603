package ru.itis.utils;

public class CommandsParser {

    private final String[] COMMANDS = {"ls", "cd", "rm", "mv", "cp", "dir"};

    /**
     * Возвращает оставшуюся строку команды. На вход приходит l, функция возвращает s
     * @param prefixOfCommand начало команды
     * @return суффикс команды
     */
    public String autoCompleteCommand(String prefixOfCommand) {
        for (String command : COMMANDS) {
            if (command.startsWith(prefixOfCommand)) {
                String parsedCommand[] = command.split(prefixOfCommand);
                return parsedCommand[1];
            }
        }
        return "";
    }

}
