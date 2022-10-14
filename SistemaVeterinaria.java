
/**
 * Write a description of class SistemaVeterinaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class SistemaVeterinaria
{
    public static void main(String[] args) {
        ArrayList <Animal> animales = new ArrayList <Animal>();
        char sigue = 'S';
        String nombre;
        int edad;
        double precio;
        String estado;
        
        Veterinaria veterinaria = new Veterinaria("Ositos", animales);
        
        Perro perro1 = new Perro("tom", 1, 3000, "En venta");
        
        Gato gato1 = new Gato("jerry", 2, 2900, "En venta");
        
        veterinaria.ingresarAnimal(perro1);
        veterinaria.ingresarAnimal(gato1);
        System.out.println(veterinaria.recaudacion());
        
        veterinaria.verAnimales("En venta");
        veterinaria.verAnimales("Vendido");
        veterinaria.venderAnimal(gato1);
        veterinaria.venderAnimal(perro1);
        veterinaria.verAnimales("Vendido");
        System.out.println("recaudacion: "+ veterinaria.recaudacion());
    } 
}
