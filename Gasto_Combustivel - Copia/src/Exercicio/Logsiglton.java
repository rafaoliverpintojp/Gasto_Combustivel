package Exercicio;

import java.util.ArrayList;
import java.util.Collection;

public class Logsiglton {
	private static Logsiglton instance;

	private Collection<String> texto;

	private Logsiglton() {

	}

	public static Logsiglton getInstance() {
		if (instance == null) {

			instance = new Logsiglton();
		}
		
		return instance;
	}

	public Collection<String> getTexto() {
		return texto;
	}

	public void setTexto(Collection<String> texto) {
		this.texto = texto;
	}

	public static void main(String[] args) {

		Logsiglton log = Logsiglton.getInstance();
		
		log.setTexto(new ArrayList<String>());
		log.getTexto().add("log1");
		log.getTexto().add("log2");
		log.getTexto().add("log3");

		
		Logsiglton log2 = Logsiglton.getInstance();
		log2.getTexto().add("log4");
		log2.getTexto().add("log5");
		log2.getTexto().add("log6");

		System.out.println(log == log2);

	}

}
