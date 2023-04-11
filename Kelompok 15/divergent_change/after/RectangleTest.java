class RectangleTest {

    void test() {
        Rectangle r = new Rectangle(5, 3);
        assertEquals(r.area(), 15);
        assertEquals(r.perimeter(), 16);

        System.out.println("");

        r.print("border");
        System.out.println("");
        r.print("full");
    }

    private void assertEquals(int area, int i) {

    }

}