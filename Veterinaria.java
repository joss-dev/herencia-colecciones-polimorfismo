
/**
 * Write a description of class Veterinaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class Veterinaria
{
    private String nombre;
    private ArrayList <Animal> animales;
    
    
    //getters
    public String getNombre() {
        return this.nombre;
    }
    
    public ArrayList <Animal> getAnimales() {
        return this.animales;
    }
    
    //setters
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    
    private void setAnimales(ArrayList <Animal> p_animales) {
        this.animales = p_animales;
    }
    
    
    //metodos
    
    public boolean ingresarAnimal(Animal p_animal) {
        return this.getAnimales().add(p_animal);
    }
    
    public boolean 
}
