package patterns.factoryPattern;

public class shapeFactory {

    public static Shape getShape(String Type)
    {
        if (Type.equalsIgnoreCase("Circle"))
        {
            return new Circle();
        }
        else if (Type.equalsIgnoreCase("Rectangle"))
        {
            return new Rectangle();
        }

        return null;
    }
}
