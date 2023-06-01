public class Rectangle extends CommonShape {
    private final double length;
    private final double width;
    private final int numberOfSides = 4;
    public Rectangle(double length,double width,String color){
        super(color);
        this.length = length;
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    @Override
    public boolean hasSides() {
        if(numberOfSides > 0){
            return true;
        }
        return false;
    }

    @Override
    public Double getArea() {
        return getLength()*getWidth();
    }

    @Override
    public Double getPerimeter() {
        return 2 * ( getLength() + getWidth());
    }




}
