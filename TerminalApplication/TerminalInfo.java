package TerminalApplication;

import java.util.function.Consumer;

public class TerminalInfo {
    public String name;
    public Consumer<String []> consumer;

    public TerminalInfo(String name, Consumer<String[]> consumer)
    {
        this.name = name;
        this.consumer = consumer;
    }
}
