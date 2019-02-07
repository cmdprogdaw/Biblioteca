
public class Prueba {

	public static void main(String[] args) {
		Libro libro = new Libro("123", "danza", 1996, true);
		System.out.println(libro);
		libro.prestado();
		Ejemplar e = libro;
		((Libro) e).prestar();     // conversion de tipo, la variable e es un libro
		Prestable p = libro;
		p.prestar();
	}

}
