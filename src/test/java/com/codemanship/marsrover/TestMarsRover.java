package com.codemanship.marsrover;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.codemanship.marsrover.MarsRover.Direction;

public class TestMarsRover
{
	public void testDropFacingNorthAtLocation()
	{
		MarsRover rover = new MarsRover(Direction.NORTH, 2, 2);
		Assertions.assertEquals(Direction.NORTH, rover.getDirection());
		Assertions.assertArrayEquals(new int[] {2,2}, rover.getLocation());
	}
	
	@Test
	public void testDropFacingSouthAtLocation()
	{
		MarsRover rover = new MarsRover(Direction.SOUTH, 4, 7);
		Assertions.assertEquals(Direction.SOUTH, rover.getDirection());
		Assertions.assertArrayEquals(new int[] {4, 7}, rover.getLocation());
	}

	@Test
	public void testDropFacingWest()
	{
		MarsRover rover = new MarsRover(Direction.WEST, 6, 2);
		Assertions.assertEquals(Direction.WEST, rover.getDirection());
		Assertions.assertArrayEquals(new int[] {6, 2}, rover.getLocation());
	}

	@Test
	public void testDropFacingEast()
	{
		MarsRover rover = new MarsRover(Direction.EAST, 35, 1);
		Assertions.assertEquals(Direction.EAST, rover.getDirection());
		Assertions.assertArrayEquals(new int[] {35, 1}, rover.getLocation());
	}

}
