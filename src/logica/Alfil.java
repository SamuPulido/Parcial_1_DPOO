package logica;

public class Alfil extends Piezas {

	public Alfil(int fila, int columna) {
		super(fila, columna);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcularMovimientos() {
		int movimientos = 0;
		
		// TODO Auto-generated method stub
		
		movimientos += Math.min(7 - fila, 7 -columna); //diagonal superior a la derecha min devuelve, el minimo entre las dos opciones
		
		movimientos += Math.min(7 - fila, columna); //diagonal superior a la izquierda
			
		movimientos += Math.min(fila, 7 -columna); //diagonal inferior a la derecha
		
		movimientos += Math.min(fila, columna); //diagonal inferior a la izquierda
		
		
		return movimientos;
	}

}
