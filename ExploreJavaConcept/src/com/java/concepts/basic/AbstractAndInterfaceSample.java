package com.java.concepts.basic;

import com.java.concepts.basic.Logic.Algorithms;

interface Dimensions {

	/**
	 * IMPORTANT NOTE # Interfaces all variables will public, static and final.
	 * You cannot change default_dimension value. Even if you dont provide the
	 * access modifiers any variable you define in interface will be public
	 * static final.
	 */
	int default_dimension = 2;
	

	// private int method(); //ERROR - Illegal modifier for the interface method
	// method; only public, abstract, default, static and strictfp are permitted

	// private int i = 5; //ERROR - Illegal modifier for the interface field
	// Dimensions.i; only public, static & final are permitted

	// int i; //ERROR - The blank final field i may not have been initialized

	public int getDimension();

	/**
	 * IMPORTANT NOTE #6 Interface cannot have contractor. Interface objects
	 * cannot be instantiated by user or run-time environment. All methods in
	 * the interfaces are abstract methods. Non-abstracted methods cannot be
	 * defined in an interface.
	 */
	// public Dimensions() { }

}

// IMPORTANT NOTE - you can have empty abstract class
abstract class empty {
}

// IMPORTANT - Abstract class with nested class sample.
abstract class Device {

	abstract public void switchOnDevice();

	abstract public void drawShapeOnDevice(Shape s);

	class PaintEditor {
		public PaintEditor() {
			System.out.println("Paint Editor Constructed!");
		}

		public void openEditor() {
			System.out.println("Open Paint Editor!");
		}
	}

	static class Battery {
		public void provideEnergy() {
			System.out.println("Providing Energy...\n");
		}
	}

}

class Logic {

	public Algorithms getAlgorithmInstance() {
		return new Algorithms();
	}

	class Algorithms {
		public void solveProblem() {
			System.out.println("Solving the problem.\n");
		}
	}
}

class Phone extends Device {

	Battery battery = new Battery();

	public void drawShapeOnDevice(Shape s) {
		PaintEditor pe = new PaintEditor();
		pe.openEditor();
		s.draw();
	}

	@Override
	public void switchOnDevice() {
		System.out.println("Phone Switched On!");

	}
}

/**
 * IMPORTANT NOTE #4 AN Abstract class can have 0 to more abstract methods.
 * Abstract methods will have no implementation code, You will just define the
 * method signature and no curly braces or code. The abstract class can have 0
 * to more abstract methods.
 * 
 * @author Priyanka
 *
 */
abstract class Shape implements Dimensions {

	/**
	 * IMPORTANT NOTE #2 Abstract class can have a constructor. But this
	 * constructor is used to construct the subclass object and cannot be used
	 * to construct/instantiate the abstract class object. Is called by super()
	 * method by child class constructors. We cannot create an object of the
	 * abstract class but runtime environment creates the object of the abstract
	 * class and uses its constructor method for constructing the child class
	 * objects.
	 */

	public Shape() {
		System.out.println("Shape Constructor called.");
	}

	public abstract void draw(); // no defination or implementation can be
									// provided.

	/**
	 * IMPORTANT NOTE #5 Can have abstract and non-abstract methods too.
	 * 
	 * @return
	 */
	public int getDimension() {
		return default_dimension;
	}
}

/**
 * IMPORTANT NOTE #3 The type Square must implement the inherited abstract
 * method Shape.draw(). else define the class as abstract too.
 */
abstract class Square extends Shape {

}

class Circle extends Shape {
	public Circle() {
		super(); // Shape contractor is called.
		System.out.println("Circle constructor called.");
	}

	public void draw() {
		System.out.println("Draw a shape circle.\n");
	}
}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("Draw a shape rectangle.\n");
	}
}

class Polygon extends Shape {
	public void draw() {
		System.out.println("Draw a shape polygon.\n");
	}
}

public class AbstractAndInterfaceSample {

	public static void main(String[] args) {

		/**
		 * IMPORTANT NOTE #1 Cannot create the instance/object of the abstract
		 * class. Even if the constructor is provided in abstract class.
		 */
		// Shape s = new Shape();

		Shape s = new Circle(); // Same type. But object of circle is created.
		s.draw(); // draw() of circle is called. Runtime polymorphism.

		/**
		 * OUTPUT - Shape Constructor called. Circle constructor called. Draw a
		 * shape circle.
		 **/

		Phone phone = new Phone();
		phone.switchOnDevice();
		phone.drawShapeOnDevice(s);

		/**
		 * VERY IMPORTANT SCENARIOS Paint Editor is the inner class in the
		 * abstract class Device
		 * 
		 * Cannot create the paintEditor instance unless you create the instance
		 * of the parent class Device.
		 * 
		 * No enclosing instance of type Device is accessible. Must qualify the
		 * allocation with an enclosing instance of type Device (e.g. x.new A()
		 * where x is an instance of Device).
		 **/
		// PaintEditor pe = new PaintEditor();

		/**
		 * VERY IMPORTANT SCENARIOS Paint Editor is the inner class in the
		 * abstract class Device
		 * 
		 * Cannot create the instance of the child class unless you create the
		 * instance of the parent class Device.
		 * 
		 * No enclosing instance of type Device is accessible. Must qualify the
		 * allocation with an enclosing instance of type Device (e.g. x.new A()
		 * where x is an instance of Device). Also for creating the instance of
		 * the inner class you have create the instance of outer class
		 * 
		 **/
		// Device.PaintEditor pe = new Device.PaintEditor();

		/**
		 * VERY IMPORTANT SCENARIOS
		 * 
		 * Can create the instance of static class Battery of the abstract class
		 * Device. Since the class can be accessed without creating the instance
		 * of Device class.
		 */
		Device.Battery battery = new Device.Battery();
		battery.provideEnergy();

		/**
		 * 
		 * Logic is a simple class with the nested class Algorithms.
		 * 
		 * Cannot create the instance of the child class Algorithm unless you
		 * create the instance of the parent class Logic.
		 * 
		 * No enclosing instance of type Logic is accessible. Must qualify the
		 * allocation with an enclosing instance of type Logic (e.g. x.new A()
		 * where x is an instance of Logic).
		 */
		// Logic.Algorithms la = new Logic.Algorithms(); //ERROR
		Logic l = new Logic();
		Algorithms a = l.new Algorithms();
		a.solveProblem();
		
		

	}
}
