public class DispositivoEntrada{
    //ATRIBUTOS
    //tipo de elemento de entrada al dispositivo
    private String tipoEntrada;
    //marca del dispositivo
    private String marca;
    //CONSTUCTOR
    public DispositivoEntrada(String nTipo, String nMarca){
	tipoEntrada = nTipo;
	marca = nMarca;
    }
    //METODOS
    public String darTipo(){
	return tipoEntrada;
    }

    public String darMarca(){
	return marca;
    }
    public void setMarca(String nMarca){
	marca = nMarca;
    }
    public void setTipo(String nTipo){
	tipoEntrada = nTipo;
    }
    @Overrride
    public String toString(){
	return "DispositivoEntrada{"+"tipoEntrada" + tipoEntrada + ", Marca" +marca"}";
}

