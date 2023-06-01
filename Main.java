import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(20, 30, "blue");
        Circle circle = new Circle(5,"white");
        Square square = new Square(10, "Black");
        ArrayList<CommonShape> al = new ArrayList<CommonShape>();
        al.add(rectangle);
        al.add(circle);
        al.add(square);

        Collections.sort(al);
        for(CommonShape st:al){
            System.out.println(st.toString() + "\n");
        }
        //System.out.print(rectangle);
    }
}