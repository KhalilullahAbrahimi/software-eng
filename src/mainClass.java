
public class mainClass {
	public static void main(String[] args) {
        Shape_factory obj = new Shape_factory();

        Shapes circle = obj.createShape("circle");
        circle.draw();

        Shapes square = obj.createShape("square");
        square.draw();

        Shapes rectengle = obj.createShape("rectengle");
        rectengle.draw();
    }

}
