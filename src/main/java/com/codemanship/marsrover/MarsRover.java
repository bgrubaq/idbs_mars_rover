package com.codemanship.marsrover;

public class MarsRover
{
	private String direction;
	private int x, y;
	
	public MarsRover(String direction, int x, int y)
	{
		this.direction = direction;
		this.x = x;
		this.y = y;
	}
	
	public String getDirection()
	{
		return direction;
	}

	public int[] getLocation()
	{
		return new int[] {x, y};
	}
}
