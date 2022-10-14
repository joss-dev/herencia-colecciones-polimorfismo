
/**
 * Write a description of class Gato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gato extends Animal
{
    
    public Gato(String p_nombre, int p_edad, double p_costo, String p_estado) {
        super(p_nombre, p_edad, p_costo, p_estado);
    }
    
    public String emitirSonido() {
        return "Miau!";
    }
    
    public String queAnimal() {
        String aux = super.queAnimal();
        return aux +  "Gato";
    }
    
}
