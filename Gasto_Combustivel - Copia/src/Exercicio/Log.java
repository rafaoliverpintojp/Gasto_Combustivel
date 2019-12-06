package Exercicio;

import java.util.ArrayList;
import java.util.Collection;

public class Log {
	private Collection<String> texto;

	

	public Collection<String> getTexto() {
		return texto;
	}

	public void setTexto(Collection<String> texto) {
		this.texto = texto;
	}
	
    public static void main(String[] args) {
    	
    	Log log = new Log();
    	log.setTexto(new ArrayList<String>());
        log.getTexto().add("log1");
        log.getTexto().add("log2");
        log.getTexto().add("log3");
        
        
        Log log2 = new Log();
    	log2.setTexto(new ArrayList<String>());
        log2.getTexto().add("log4");
        log2.getTexto().add("log5");
        log2.getTexto().add("log6");
        
        System.out.println(log2.getTexto());
      
        
    }
	
	
	
}
