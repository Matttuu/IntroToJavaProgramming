package ChapterNine;

/*
*Two double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height.
* A no-arg constructor that creates a default rectangle.
* A constructor that creates a rectangle with the specified width and height.
* A method named getArea() that returns the area of this rectangle.
* A method named getPerimeter() that returns the perimeter.
* */



public class TheRectangleClass {

    // Two double data fields
    private double width;
    private double height;

    //A no-arg constructor that creates a default rectangle
    public TheRectangleClass() {
        this.width = 1.0;
        this.height = 1.0;
    }

    // A constructor that creates a rectangle with the specified width and height.
    public TheRectangleClass(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Return Area
    public double getArea() {
        return this.width * this.height;
    }

    // Return Perimeter

    public double getPerimeter() {
        return this.width * 2 + this.height * 2;
    }
}