package ChapterNine;

public class TheRectangleClass9_1 {
    public static void main(String[] args) {

        TheRectangleClass[] rectangles = new TheRectangleClass[2];
        rectangles[0] = new TheRectangleClass(4,40);
        rectangles[1] = new TheRectangleClass(3.5, 35.9);

        for (int i = 0; i < 2; i++) {
            System.out.println("Rectangle " + (i+1) +":");
            System.out.print("Area = " + rectangles[i].getArea() + "\n");
            System.out.println(" Perimeter = " +  rectangles[i].getPerimeter() +"\n");
        }
    }

}
