package exercicioBridge;

public class Main {
	public static void main(String[] args) {
		Shape s = new Circle();
		s.setColor(new Blue());

		s.render();
	}
}
