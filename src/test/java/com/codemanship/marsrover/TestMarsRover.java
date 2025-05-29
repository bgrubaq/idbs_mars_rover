package com.codemanship.marsrover;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMarsRover
{
	@Test
	public void testDropFacingNorth()
	{
		MarsRover rover = new MarsRover();
		Assertions.assertEquals("North", rover.getDirection());
	}
}
