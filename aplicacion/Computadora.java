public class Computadora {
    // ATRIBUTOS
    private int idComputadora;
    private String nombre;
    private Monitor miMonitor;
    private Teclado miTeclado;
    private Raton miRaton;
    private static int contadorComputadora;

    public Computadora(String nNombre, Monitor nMonitor, Teclado nTeclado, Raton nRaton) {
        idComputadora= ++Computadora.contadorComputadora;
        nombre = nNombre;
        miMonitor = nMonitor;
        miTeclado = nTeclado;
        miRaton = nRaton;
    }

    // METODOS
    public int darId() {
        return idComputadora;
    }

    public String darNombre() {
        return nombre;
    }

    public Monitor darMonitor() {
        return miMonitor;
    }

    public Teclado darTeclado() {
        return miTeclado;
    }

    public Raton darRaton() {
        return miRaton;
    }

    public void setNombre(String nNombre) {
        nombre = nNombre;
    }

    public void setMonitor(Monitor nMonitor) {
        miMonitor = nMonitor;
    }

    public void setTeclado(Teclado nTeclado) {
        miTeclado = nTeclado;
    }

    public void setRaton(Raton nRaton) {
        miRaton = nRaton;
    }

    public String toString(){
	return "Computadora{"+"idComputadora="+idComputadora+","+
	    "Nombre="+nombre+","+"Teclado="+miTeclado+","+
	    "Raton"+miRaton+","+"Monitor"+miMonitor+"}";
    }
}
