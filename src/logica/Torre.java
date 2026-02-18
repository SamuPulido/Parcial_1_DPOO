package logica;

public class Torre extends Piezas{
	


	public Torre(int fila, int columna) {
		super(fila, columna);
		// TODO Auto-generated constructor stub
	}


	@Override
	public int calcularMovimientos() {
		// TODO Auto-generated method stub
		return (7 - fila) + fila + (7 - columna) + columna;
	}
}
