public class Restangle implements Shape{
    private int width;
    private  int heitgh;
    private  String filling;
    private  String colorBorder;

    public Restangle(int width, int heitgh, String filling, String colorBorder) {
        this.width = width;
        this.heitgh = heitgh;
        this.filling = filling;
        this.colorBorder = colorBorder;
    }
    @Override
    public double getPerimetr(){
        return 2 * (width + heitgh);
    }

    @Override
    public double getArea() {
        return width*heitgh;
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
