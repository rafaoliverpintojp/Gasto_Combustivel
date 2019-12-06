package exercicio;

import java.util.ArrayList;
import java.util.Collection;

public class Log {
	private Collection<String> textos;
	private Object getTexto;

	public Collection<String> getTexto() {
		return textos;
	}

	public void setTexto(Collection<String> texto) {
		this.textos = texto;
	}
	
	public static void main(String[] args) {
		Log log = new Log();
		log.setTexto(new ArrayList<String>());
		
		log.getTexto().add("Log1");	
		log.getTexto().add("Log2");
		log.getTexto().add("Log3");
		
		Log log2 = new Log();
		log2.setTexto(new ArrayList<String>());
		
		log2.getTexto().add("Log1");	
		log2.getTexto().add("Log2");
		log2.getTexto().add("Log4");
		}	

	
}
