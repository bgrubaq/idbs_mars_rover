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

	@Test
	public void testDropFacingWest()
	{
		MarsRover rover = new MarsRover("West");
		Assertions.assertEquals("West", rover.getDirection());
	}

	@Test
	public void testDropFacingEast()
	{
		MarsRover rover = new MarsRover("East");
		Assertions.assertEquals("East", rover.getDirection());
	}

}
