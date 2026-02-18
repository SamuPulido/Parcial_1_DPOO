package logica;

public class Peon extends Piezas{

	public Peon(int fila, int columna) {
		super(fila, columna);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcularMovimientos() {
		// TODO Auto-generated method stub
		
		if (fila == 8) {
			return 0;
		
		} else if (fila == 2) {
			return 2;
		
		} else {
			return 1;
		}
	}

}
