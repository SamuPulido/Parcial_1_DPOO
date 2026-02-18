package logica;

public abstract class Piezas {
	protected int fila;
	protected int columna;
	
		
		public Piezas(int fila, int columna) {
		// TODO Auto-generated constructor stub
			this.fila = fila;
			this.columna = columna;
					
	}

		public int getFila() {
		return fila;
	}


	public void setFila(int fila) {
		this.fila = fila;
	}


	public int getColumna() {
		return columna;
	}



	public void setColumna(int columna) {
		this.columna = columna;
	}

		public abstract int calcularMovimientos();
		
}
