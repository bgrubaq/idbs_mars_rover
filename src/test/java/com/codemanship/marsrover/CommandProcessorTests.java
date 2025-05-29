package com.codemanship.marsrover;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import org.junit.jupiter.api.Test;

public class CommandProcessorTests
{
    private interface TestTarget
    {
        void sampleOperation();
    }

    @Test
    public void canRunCommand()
    {
        Map<String, Consumer<TestTarget>> commands = new HashMap<>();

        commands.put("S", TestTarget::sampleOperation);

        TestTarget target = mock(TestTarget.class);

        InputStream in = new ByteArrayInputStream("S\n".getBytes());

        new CommandProcessor<>(target, commands, in).run();

        verify(target).sampleOperation();
    }
}