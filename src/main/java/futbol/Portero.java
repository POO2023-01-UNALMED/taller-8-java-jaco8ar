package futbol;

public class Portero extends Futbolista {
    private short golesRecibidos;
    private byte dorsal;
    

    public Portero(String nombre, int edad,
            short golesRecibidos, byte dorsal){
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal; 
    }







    //metodos get y set
    public void setDorsal (byte dorsal) {
        this.dorsal = dorsal;}
    public void setGolesRecibidos (short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;}
    
    public byte getDorsal() {
        return dorsal;}
    public short getGolesRecibidos() {
        return golesRecibidos;}
    
}
