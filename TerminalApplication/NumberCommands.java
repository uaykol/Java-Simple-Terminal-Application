package TerminalApplication;

public class NumberCommands{

    public static boolean checkDirectory()
    {
        return Commands.prompt.equals("COM/number");
    }

    public static void addProc(String [] commands)
    {

        if(!checkDirectory())
        {
            System.out.println("This Command only available for COM/number directory");
            return;
        }

        if(commands.length == 3)
        {
            System.out.println(Integer.parseInt(commands[1]) + Integer.parseInt(commands[2]));
        }
    }

    public static void subProc(String [] commands)
    {
        if(!checkDirectory())
        {
            System.out.println("This Command only available for COM/number directory");
            return;
        }

        if(commands.length == 3)
        {
            System.out.println(Integer.parseInt(commands[1]) - Integer.parseInt(commands[2]));
        }
    }

    public static void divProc(String [] commands)
    {
        if(!checkDirectory())
        {
            System.out.println("This Command only available for COM/number directory");
            return;
        }

        if(commands.length == 3)
        {
            System.out.println(Integer.parseInt(commands[1]) / Integer.parseInt(commands[2]));
        }
    }

    public static void multipProc(String [] commands)
    {
        if(!checkDirectory())
        {
            System.out.println("This Command only available for COM/number directory");
            return;
        }

        if(commands.length == 3)
        {
            System.out.println(Integer.parseInt(commands[1]) * Integer.parseInt(commands[2]));
        }
    }
}
