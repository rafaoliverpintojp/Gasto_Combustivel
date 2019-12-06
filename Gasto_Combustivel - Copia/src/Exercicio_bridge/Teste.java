package Exercicio_bridge;

public class Teste {
public static void main(String[] args) {
	
	Shape s = new Circle();
	s.setColor(new Red());
	s.render();
}
}
