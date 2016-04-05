package com.wf.ect.decorator;

public class RedCircle  implements Shape{

	Circle circle;
	public RedCircle(Circle circle)
	{
		this.circle=circle;
	}
	
	private void paintRed()
	{
		System.out.println("Painting the circle Red");
	}

	@Override
	public Circle draw() {
		circle.draw();
		paintRed();
		return circle;
	}
}
