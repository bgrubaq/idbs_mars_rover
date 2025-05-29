package com.codemanship.marsrover;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public class CommandProcessor<Target>
{
    private final Target target;

    private final Map<String, Consumer<Target>> commands;

    private final InputStream in;

    public CommandProcessor(
        Target target,
        Map<String, Consumer<Target>> commands,
        InputStream in
    )
    {
        this.target = target;
        this.commands = new HashMap<>(commands);
        this.in = in;
    }

    public void run()
    {
        Scanner s = new Scanner(in);

        while (s.hasNextLine()){
            String input = s.nextLine();
            Consumer<Target> cmd = commands.get(input);
            if (cmd != null)
                cmd.accept(target);
        }
    }
}
