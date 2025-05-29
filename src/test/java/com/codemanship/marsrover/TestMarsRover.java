package com.codemanship.marsrover;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMarsRover
{
	@Test
	public void testDropFacingNorth()
	{
		MarsRover rover = new MarsRover("North");
		Assertions.assertEquals("North", rover.getDirection());
	}
	
	@Test
	public void testDropFacingSouth()
	{
		MarsRover rover = new MarsRover("South");
		Assertions.assertEquals("South", rover.getDirection());
	}
}
