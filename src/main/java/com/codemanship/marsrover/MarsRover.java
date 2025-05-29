package com.codemanship.marsrover;

import java.util.Objects;

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
		this.direction = Objects.requireNonNull(direction);
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

	public void turnLeft()
	{
		switch (direction)
		{
			case NORTH:
				direction = Direction.WEST;
				break;
			case SOUTH:
				direction = Direction.EAST;
				break;
			case EAST:
				direction = Direction.NORTH;
				break;
			case WEST:
				direction = Direction.SOUTH;
		}
	}
	
	public void moveForward()
	{
		switch(direction)
		{
			case NORTH:
				y--;
				break;
			case EAST:
				x++;
				break;
			case SOUTH:
				y++;
				break;
			case WEST:
				x--;
				break;
		}
	}
}
