public class Teclado extends DispositivoEntrada{
    //ATRIBUTOS
    public final int idTeclado;
    public static int contadorTeclado;
    //CONSTRUCTOR
    public Teclado(String nTipo, String nMarca){
	super(nTipo, nMarca);
	idTeclado = ++Teclado.contadorTeclado;
    }
    //METODOS
    public String toString(){
	
	return "Teclado {"+ "idTeclado ="+ idTeclado+","+ super.toString() "}"
    }
}
