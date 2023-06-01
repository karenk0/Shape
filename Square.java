public class Square extends CommonShape {
    private final double side;
    private final int numberOfSides = 4;
    public Square(double side, String color){
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public Double getArea() {
        return getSide() * getSide();
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
        return 4 * getSide();
    }
}