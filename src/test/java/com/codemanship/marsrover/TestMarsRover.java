package com.codemanship.marsrover;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMarsRover
{
	@Test
	public void testDropFacingNorthAtLocation()
	{
		MarsRover rover = new MarsRover("North", 2, 2);
		Assertions.assertEquals("North", rover.getDirection());
		Assertions.assertArrayEquals(new int[] {2,2}, rover.getLocation());
	}
	
	@Test
	public void testDropFacingSouthAtLocation()
	{
		MarsRover rover = new MarsRover("South", 4, 7);
		Assertions.assertEquals("South", rover.getDirection());
		Assertions.assertArrayEquals(new int[] {4, 7}, rover.getLocation());
	}

	@Test
	public void testDropFacingWest()
	{
		MarsRover rover = new MarsRover("West", 6, 2);
		Assertions.assertEquals("West", rover.getDirection());
		Assertions.assertArrayEquals(new int[] {6, 2}, rover.getLocation());
	}

	@Test
	public void testDropFacingEast()
	{
		MarsRover rover = new MarsRover("East", 35, 1);
		Assertions.assertEquals("East", rover.getDirection());
		Assertions.assertArrayEquals(new int[] {35, 1}, rover.getLocation());
	}

}
