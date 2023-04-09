public class Shapes {

    public void calc(int type, int side, int width) {
        // creates a new variable
        int area = 0;
        String shapeType = "";

        // check for shape types
        if (type == 1) {
            // square is side squared
            area = side * side;
            shapeType = "square";
        } else if (type == 2) {
            // rectangle is width times height
            area = side * width;
            shapeType = "rectangle";
        } else if (type == 3) {
            // circle is pi times radius squared
            area = (int) (3.14 * side * side);
            shapeType = "circle";
        }

        // prints out the area for user
        System.out.println("Area of " + shapeType + " : " + area);
    }

    public static void main(String[] args) {

        int squareSide = 7;
        int rectangleWidth = 8;
        int rectangleHeight = 3;
        int circleRadius = 10;

        Shapes shapes = new Shapes();

        shapes.calc(1, squareSide, 0);
        shapes.calc(2, rectangleWidth, rectangleHeight);
        shapes.calc(3, circleRadius, 0);
    }
}
