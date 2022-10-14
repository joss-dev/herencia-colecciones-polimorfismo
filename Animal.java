
/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Animal
{
    private String nombre;
    private int edad;
    private double costo;
    private String estado;
    
    //constructor
    public Animal(String p_nombre, int p_edad, double p_costo, String p_estado) {
        this.setNombre(p_nombre);
        this.setEdad(p_edad);
        this.setCosto(p_costo);
        this.setEstado(p_estado);
    }
    
    //getters
    public String getNombre() {
        return  this.nombre;
    }
    
    public int getEdad() {
        return this.edad;
    }
    
    public double getCosto() {
        return this.costo;
    }
    
    public String getEstado() {
        return this.estado;
    }
    
    //setters 
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }
    
    private void setEdad(int p_edad) {
        this.edad = p_edad;
    }
    
    private void setCosto(double p_costo) {
        this.costo = p_costo;
    }
    
    private void setEstado(String p_estado) {
        this.estado = p_estado;
    }
    
    //metodos
    public abstract String emitirSonido();
    
    public String queAnimal() {
        return "Soy un ";
    }
    
    public double precioVenta() {
        return this.getCosto() + (this.getCosto() * 0.25);
    }
    
    public void vender() {
        if(this.getEstado() != "Vendido") {
            this.setEstado("Vendido");
        }
    }
    
    public void mostrar() {
      System.out.println("Mi nombre es "+ this.getNombre() + " y tengo "+ this.getEdad() + " años");
      System.out.println("Precio de venta: "+ this.precioVenta());
    }
    
}
