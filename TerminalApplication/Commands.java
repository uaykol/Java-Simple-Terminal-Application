package TerminalApplication;

import java.util.ArrayList;

public class Commands {

    public static String prompt;
    public static final ArrayList<TerminalInfo> commandsList;
    public static final String [] comDirectories = {"string", "number"};
    public static final String [] stringDirectories = {"No Directory Available"};
    public static final String [] numberDirectories = {"No Directory Available"};
    public static final String [] stringCommands = {"length", "reverse", "upper", "lower"};
    public static final String [] numberCommands = {"addition", "subtraction", "division", "multiplication"};
    public static final String [] COM_Commands = {"clear", "quit", "ls", "pwd", "cd"};


    static {
        commandsList = new ArrayList<>();
        commandsList.add(new TerminalInfo("length", StringCommands::lengthProc));
        commandsList.add(new TerminalInfo("reverse", StringCommands::reverseProc));
        commandsList.add(new TerminalInfo("upper", StringCommands::upperProc));
        commandsList.add(new TerminalInfo("lower", StringCommands::lowerProc));
        commandsList.add(new TerminalInfo("clear", Commands::clearProc));
        commandsList.add(new TerminalInfo("quit", Commands::quitProc));
        commandsList.add(new TerminalInfo("show", Commands::showCommandsProc));
        commandsList.add(new TerminalInfo("cd", Commands::cdProc));
        commandsList.add(new TerminalInfo("ls", Commands::lsProc));
        commandsList.add(new TerminalInfo("pwd", Commands::pwdProc));
        commandsList.add(new TerminalInfo("addition", NumberCommands::addProc));
        commandsList.add(new TerminalInfo("subtraction", NumberCommands::subProc));
        commandsList.add(new TerminalInfo("division", NumberCommands::divProc));
        commandsList.add(new TerminalInfo("multiplication", NumberCommands::multipProc));
    }

    private Commands() {}

    private static void lsProc(String [] commands)
    {
        switch (prompt)
        {
            case "COM":
                for(String directory: comDirectories)
                    System.out.print(directory + "\t");

                System.out.println();
                break;

            case "COM/string":
                for(String directory: stringDirectories)
                    System.out.print(directory + "\t");

                System.out.println();
                break;

            case "COM/number":
                for (String directory: numberDirectories)
                    System.out.println(directory + "\t");

                break;

        }

    }

    private static void pwdProc(String [] commands)
    {
        System.out.println("Location : " + prompt);
    }

    private static void cdProc(String [] commands)
    {

        if(!(commands.length == 2))
            System.out.println("Change Directory Process Have to 2 commands");
        else if(!(prompt.contains("string") || prompt.contains("number")))
        {
            switch (commands[1])
            {
                case "string":
                    TerminalApp.setPrompt("string");
                    break;
                case "number":
                    TerminalApp.setPrompt("number");
                    break;
                default:
                    System.out.println("There is no directory like " + commands[1]);
            }
        }
        else if(commands[1].equals(".."))
            Commands.prompt = "COM";
        else
            System.out.println("There is no directory like " + commands[1]);

    }

    private static void clearProc(String [] commands)
    {
        if (commands.length == 1) {
            for (int i = 0; i < 25; ++i)
                System.out.println();
        }
        else
            System.out.println("Invalid arguments for quit");
    }

    private static void showCommandsProc(String [] commands)
    {

        switch (prompt)
        {
            case "COM":
                for(String command: COM_Commands)
                    System.out.print(command + "\t");

                System.out.println();
                break;
            case "COM/string":
                for(String command: stringCommands)
                    System.out.print(command + "\t");

                System.out.println();
                break;

            case "COM/number":
                for(String command: numberCommands)
                    System.out.print(command + "\t");

                System.out.println();
                break;
        }

    }

    private static void quitProc(String [] commands)
    {
        if (commands.length == 1) {
            System.out.println("Good Bye");
            java.lang.System.exit(0);
        }
        System.out.println("Invalid arguments for quit");
    }

}

