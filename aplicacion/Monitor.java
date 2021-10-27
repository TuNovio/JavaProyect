public class Monitor {
    // ATRIBUTOS
    private final int idMonitor;
    private String marcaMonitor;
    private double tamañoMonitor;
    private static int contador;

    // CONSTRUCTOR
    public Monitor(String nMarcaM, double nTamaño) {
        idMonitor=++Monitor.contador;
        marcaMonitor = nMarcaM;
        tamañoMonitor = nTamaño;
    }

    // METODOS
    public int darIde() {
        return idMonitor;
    }

    public String darMarca() {
        return marcaMonitor;
    }

    public double darTamaño() {
        return tamañoMonitor;
    }

    public void setMarca(String nMarca) {
        marcaMonitor = nMarca;
    }

    public void setTamaño(double nTamaño) {
        tamañoMonitor = nTamaño;
    }

    public String toString(){

	return "Monitor {"+ "idMonitor ="+ idMonitor+","+ super.toString() + "Marca"+ marcaMonitor + "," + "tamaño" + tamañoMonitor+"}";
    }
}
