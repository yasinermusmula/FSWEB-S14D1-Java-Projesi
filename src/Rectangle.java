public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width < 0 ? 0 : width;
        this.length = width < 0 ? 0 : width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return getWidth()*getLength();
    }
}
