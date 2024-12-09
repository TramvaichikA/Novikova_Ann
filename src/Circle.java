public class Circle implements Shape {
    private int radius;
    private String filling;
    private String colorBorder;

    public Circle(int radius, String filling, String colorBorder) {
        this.radius = radius;
        this.filling = filling;
        this.colorBorder = colorBorder;
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getFillingShape() {
        return filling;
    }

    @Override
    public String getColorBorder() {
        return colorBorder;
    }
}
