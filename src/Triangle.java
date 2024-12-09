public class Triangle implements Shape{
    private int ab;
    private  int bc;
    private int ca;
    private  String filling;
    private  String colorBorder;

    public Triangle(int ab, int bc, int ca, String filling, String colorBorder) {
        this.ab = ab;
        this.bc = bc;
        this.ca = ca;
        this.filling = filling;
        this.colorBorder = colorBorder;
    }
    @Override
    public double getPerimetr(){
        return ab+bc+ca;
    }

    @Override
    public double getArea() {
        double p = getPerimetr()/2;
        return Math.sqrt(p*(p-ab)*(p-bc)*(p-ca));
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
