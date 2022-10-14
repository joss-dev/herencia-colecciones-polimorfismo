
/**
 * Write a description of class Perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perro extends Animal
{
    
    public Perro(String p_nombre, int p_edad, double p_costo, String p_estado) {
        super(p_nombre, p_edad, p_costo, p_estado);
    }
    
    public String emitirSonido() {
        return "Guau!";
    }
    
    public String queAnimal() {
       String aux = super.queAnimal();
       return aux + "Perro";
    }
    
    public double precioVenta() {
        double aux = super.precioVenta();
        return aux + 50;
    }
}
