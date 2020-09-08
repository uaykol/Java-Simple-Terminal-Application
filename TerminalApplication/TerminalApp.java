package TerminalApplication;

import java.util.Scanner;

public class TerminalApp {

    static Scanner kb;

    static {
        kb = new Scanner(System.in);
    }

    private boolean commandProc(String [] commandStr)
    {
        for (TerminalInfo ci : Commands.commandsList) {
            if (commandStr[0].length() >= 2 && ci.name.startsWith(commandStr[0])) {
                ci.consumer.accept(commandStr);
                return true;
            }
        }

        return false;
    }

    public TerminalApp(String prompt)
    {
        Commands.prompt = prompt;
    }

    public static void setPrompt(String prompt)
    {
        Commands.prompt = Commands.prompt.concat("/" + prompt);
    }

    public void run()
    {
        System.out.println("Welcome to Terminal Application");
        System.out.println("Information About Terminal: COM Directory is default directory \n" +
                "There is 2 directory for now : string and number\n" +
                "Write \"show\" to see commands for your directory\n" +
                "For string directory you can do some processes like \"length\", \"reverse\", \"upper\", \"lower\"\n" +
                "For number directory you can do some processes like \"addition\", \"subtraction\", \"division\", \"multiplication\" \n" +
                "cd : change directory. \tls : list of available directories for your directory.\n" +
                "pwd : To see your directory.\t quit : To quit from terminal application.\n");


        for (;;) {
            java.lang.System.out.printf("%s>", Commands.prompt);
            String cmd = kb.nextLine().trim();
            String [] commandStr = cmd.split("[ \t]+");

            if (!commandProc(commandStr))
                System.out.println("Invalid command");
        }
    }
}




