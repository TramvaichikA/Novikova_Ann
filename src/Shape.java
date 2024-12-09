
public interface Shape {
    double getPerimetr();

    double getArea();

    String getFillingShape();

    String getColorBorder();

    default void printFeatures() {
        System.out.println("Периметр: " + getPerimetr());
        System.out.println("Площадь: " + getArea());
        System.out.println("Цвет заливки: " + getFillingShape());
        System.out.println("Цвет границы: " + getColorBorder());
    }

}


