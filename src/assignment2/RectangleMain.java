package assignment2;

public class RectangleMain {

	public static void main(String[] args) {
		//create object to call method.
		Rectangle rectangle = new Rectangle();
		
		//set the values. 
		rectangle.setLength(45.5f);
		rectangle.setWidth(34.6f);
		
		//calling the method with return type.
		Float c = rectangle.areaOfRectangle();
		
		//calling the method with return type.
	Float perimeter=	rectangle.perimeterOfRectangle();
	
	
	
		
	}
}