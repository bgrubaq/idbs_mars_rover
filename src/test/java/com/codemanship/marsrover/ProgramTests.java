package com.codemanship.marsrover;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class ProgramTests
{
    @Test
    public void runsKnownRoverCommand()
    {
        InputStream in = new ByteArrayInputStream("Q\n".getBytes());
        InputStream originalIn = System.in;
        System.setIn(in);

        PrintStream originalOut = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Program.main(new String[]{});

        assertEquals("This doesn't do anything yet.\n", out.toString());

        System.setIn(originalIn);
        System.setOut(originalOut);
    }
}
