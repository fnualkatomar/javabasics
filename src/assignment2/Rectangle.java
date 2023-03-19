package assignment2;

public class Rectangle {
	//instance variables.
	private Float length;
	private Float width;

	//generate non parameterized constructor with default values 0.
	public Rectangle() {
		super();
		this.length = 0f;
		this.width = 0f;
	}
	
	//generate parameterized constructor.

	public Rectangle(Float length, Float width) {
		super();
		this.length = length;
		this.width = width;
	}



	/**
	 * @return the length
	 */
	public Float getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(Float length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public Float getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(Float width) {
		this.width = width;
	}

	//create the method of areaOfRectangle with return type.
	public Float areaOfRectangle() {
		Float c = this.getLength() * this.getWidth();
		System.out.println("area:" + c);
		return c;

	}

	// create the method of perimeterOfRectangle with return type.
	public Float perimeterOfRectangle() {
		Float perimeter = 2 * (this.length + this.width);
		System.out.println("perimeter:" + perimeter);
		return perimeter;
	}

}