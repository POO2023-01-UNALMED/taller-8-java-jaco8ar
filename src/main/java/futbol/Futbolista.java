package futbol;

public abstract class Futbolista implements Comparable<Futbolista>{
    private String nombre;
    private int edad;
    private String posicion;

    public Futbolista (String nombre, int edad, String posicion){
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista(){
        this("Maradona", 30, "delantero");
    }
    public String toString(){
        return "El futbolista " + nombre + " tiene " + edad + " y juega  de " + posicion;
    }
    public boolean equals (Futbolista f){
        if (this == f){
            return true;
        }else{
            return false;
        }
    }
    public abstract boolean jugarConLasManos();

    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getPosicion(){
        return posicion;
    }
    public void setPosicion(String posicion){
        this.posicion = posicion;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
   
}   
