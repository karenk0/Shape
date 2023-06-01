public abstract class CommonShape implements Shape, Comparable<CommonShape> {
    private final String color;
    @Override
    public String getColor() {
        return color;
    }


    public CommonShape(String color){
        this.color = color;
    }


    public abstract boolean hasSides();
    public String toString(){
        return  "Area: " + getArea() +
                "\nPerimeter: "  + getPerimeter() +
                "\nColor: " + getColor() +
                "\nHas sides: " + hasSides();
    }

    public int compareTo(CommonShape commonShape){
        return this.getPerimeter().compareTo(commonShape.getPerimeter());
    }
}

