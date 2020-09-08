package TerminalApplication;

public class StringCommands{

    public static boolean checkDirectory()
    {
        return Commands.prompt.equals("COM/string");
    }

    public static void lengthProc(String [] commands)
    {
        if(!checkDirectory())
        {
            System.out.println("This Command only available for COM/string directory");
            return;
        }

        if (commands.length == 2)
            System.out.println(commands[1].length());
        else
            System.out.println("Invalid arguments for length");

    }

    public static void reverseProc(String [] commands)
    {
        if(!checkDirectory())
        {
            System.out.println("This Command only available for COM/string directory");
            return;
        }

        if (commands.length == 2)
            System.out.println(new StringBuilder(commands[1]).reverse());
        else
            System.out.println("Invalid arguments for reverse");
    }

    public static void upperProc(String [] commands)
    {
        if(!checkDirectory())
        {
            System.out.println("This Command only available for COM/string directory");
            return;
        }

        if (commands.length == 2)
            System.out.println(commands[1].toUpperCase());
        else
            System.out.println("Invalid arguments for upper");
    }

    public static void lowerProc(String [] commands)
    {
        if(!checkDirectory())
        {
            System.out.println("This Command only available for COM/string directory");
            return;
        }

        if (commands.length == 2)
            System.out.println(commands[1].toLowerCase());
        else
            System.out.println("Invalid arguments for lower");
    }

}
