public class Shapes {

    // pada kasus ini kami menggunakan metode extract class, dimana tidak perlu
    // ditambahka comment lagi
    // karenan penggunaan logic, method dan variabel sudah jelas
    private ShapeCalculator calculator;

    public Shapes() {
        calculator = new ShapeCalculator();
    }

    public void calc(int type, int side, int width) {
        double area = 0;
        String shapeType = "";

        if (type == 1) {
            area = calculator.calcSquareArea(side);
            shapeType = "square";
        } else if (type == 2) {
            area = calculator.calcRectangleArea(side, width);
            shapeType = "rectangle";
        } else if (type == 3) {
            area = calculator.calcCircleArea(side);
            shapeType = "circle";
        }

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
