package assignment2;

public class MethodMain {

	public static void main(String[] args) {
		// create object to call integer method.
		MethodUtility methodIntegers = new MethodUtility();

		// calling the sum method with return value.
		int c = methodIntegers.sumOfTwoIntegers(100, 200);

		// calling product method with return value.
		int k = methodIntegers.productOfTwoIntegers(100, 200);
		
		//calling the method areaOfCircle with return value
		Float a=	methodIntegers.areaOfCircle();

		// create object to call string method.
		MethodUtility methodString = new MethodUtility();

		// calling method with return value.
		int weather = methodString.lengthOfString("weather is very hot");
		

		// create object of AcessSpecifier class to call the methods.
		AccessSpecifier obj1 = new AccessSpecifier();
		
		// calling the method of myClassName which is returning the string value as
		// className
		String className = obj1.myClassName();
		obj1.representThePassword();

		// calling the method RepresentTheClass to represent the classID
		obj1.RepresentTheClass();
		
		// calling the method myClassSize to represent the classSize with return type
		int classSize = obj1.myClassSize();
		//calling static method factorsOfNumber directly with class name.
		MethodUtility.factorsOfNumber(10);
		//calling static method methodOfTwoIntegers directly with class name.
		MethodUtility.methodOfTwoIntegers(10, 15);
	}

}
