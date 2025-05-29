package com.codemanship.marsrover;

public class MarsRover
{
	public enum Direction
	{
		NORTH, EAST, SOUTH, WEST;
	}
	
	private Direction direction;
	private int x, y;
	
	public MarsRover(Direction direction, int x, int y)
	{
		this.direction = direction;
		this.x = x;
		this.y = y;
	}
	
	public Direction getDirection()
	{
		return direction;
	}

	public int[] getLocation()
	{
		return new int[] {x, y};
	}
}
