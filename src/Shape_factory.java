
public class Shape_factory {
	public Shapes createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("rectengle")) {
            return new Rectengle();
        }
        return null;
    }

}
