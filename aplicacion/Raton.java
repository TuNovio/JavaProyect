public class Raton extends DispositivoEntrada {
    // ATRIBUTOS
    private final int idRaton;
    private static int contadorRaton;

    // CONSTURCTOR
    public Raton(String nTipo, String nMarca) {
        super(nTipo, nMarca);
        idRaton = ++Raton.contadorRaton;
    }

    // METODOS
    public String toString(){
	return "Raton {"+ "idRaton ="+ idRaton+","+ super.toString()+"}";
    }
}
