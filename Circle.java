public class Circle extends CommonShape{
    private final double radius;
    private final int numberOfSides = 0;
    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    @Override
    public Double getArea(){
        return Math.PI*getRadius()*getRadius();
    }

    @Override
    public boolean hasSides() {
        if(numberOfSides > 0){
            return true;
        }
        return false;
    }

    @Override
    public Double getPerimeter() {
        return 2*Math.PI*getRadius();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }
}
