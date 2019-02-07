
public class Libro extends Ejemplar implements Prestable{
	
	private boolean prestado = false;

	public Libro(String codigo, String titulo, int año, boolean prestado) {
		super(codigo, titulo, año);
		this.prestado = prestado;
	}
	
	public Libro(String codigo, String titulo, int año) {
		super(codigo, titulo, año);
	}

	@Override
	public String toString() {
		return super.toString() + " Libro [prestado=" + prestado + "]";
	}
	
	@Override
	public void prestar() {
		prestado = true;
	}
	
	@Override
	public void devolver() {
		prestado = false;
	}
	
	@Override
	public boolean prestado() {
		return prestado;
	}
}
