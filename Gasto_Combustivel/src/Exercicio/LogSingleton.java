package exercicio;

import java.util.ArrayList;
import java.util.Collection;

public class LogSingleton {
	private static LogSingleton instance;
	private Collection<String> textos;
	private Object getTextos;

	private LogSingleton() {
	
	}

	public static LogSingleton getInstance() {
		
		if(instance ==null) {
			instance = new LogSingleton();
		}
		return instance;
	}
	public Collection<String> getTextos() {
		return textos;
	}

	public void setTextos(Collection<String> textos) {
		this.textos = textos;
	}
	
	public static void main(String[] args) {
		LogSingleton log = LogSingleton.getInstance();
		log.setTextos(new ArrayList<String>());
		
		log.getTextos().add("Log1");	
		log.getTextos().add("Log2");
		log.getTextos().add("Log3");		

		}		
	
}
