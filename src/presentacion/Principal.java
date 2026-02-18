package presentacion;

import logica.Piezas;
import logica.Alfil;
import logica.Peon;
import logica.Torre;

public class Principal {
	
	public Principal() {
		Piezas p;
		p = new Torre(4, 4);
		System.out.println(p.calcularMovimientos());
		
		p = new Peon(4, 4);
		System.out.println(p.calcularMovimientos());
		
		p = new Alfil(4, 4);
		System.out.println(p.calcularMovimientos());
	}

	public static void main(String[] args) {
		new Principal();
	}
}

