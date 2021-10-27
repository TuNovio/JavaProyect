public class Monitor{
    //ATRIBUTOS
    private final idMonitor;
    private String marcaMonitor;
    private double tamañoMonitor;
    private static int contador;
    //CONSTRUCTOR
    private Monitor(){
	idMonitor = ++Monitor.contador;
    }
    public Monitor(String nMarcaM, double nTamaño){
	marcaMonitor = nMarcaM;
	tamañoMonitor = nTamaño;
    }
    //METODOS
    public int darIde(){
	return idMonitor;
    }
    public String darMarca(){
	return marcaMonitor;
    }
    public double darTamaño(){
	retunr tamañoMonitor;
    }
    public void setMarca(String nMarca){
	marcaMonitor = nMarca;
    }
    public void setTamaño(double nTamaño){
	tamañoMonitor = nTamaño;
    }
    public String toString(){

	return "Monitor {"+ "idMonitor ="+ idMonitor+","+ super.toString() + "Marca"+ marcaMonitor + "," + "tamaño" + tamañoMonitor"}"
    }
}
