package com.codemanship.marsrover;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import com.codemanship.marsrover.MarsRover.Direction;

public class Program {
    public static void main(String[] args) {
        MarsRover rover = new MarsRover(Direction.NORTH, 0, 0);

        Map<String, Consumer<MarsRover>> commands = new HashMap<>();
        commands.put("Q", MarsRover::outputStatus);

        new CommandProcessor<>(rover, commands, System.in).run();
    }
}
