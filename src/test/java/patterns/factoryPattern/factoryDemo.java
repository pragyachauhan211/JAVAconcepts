package patterns.factoryPattern;

public class factoryDemo {

    public static void main(String[] args) {
        Shape shape1 = shapeFactory.getShape("Rectangle");
        shape1.draw();
    }
}
