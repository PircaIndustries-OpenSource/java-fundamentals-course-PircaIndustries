
class Animal {
    
    // DEFINIMOS LOS ATRIBUTOS
    
    private double Altura;
    private String Nombre;

    // INICIALIZAMOS EL CONSTRUCTOR PASÁNDOLE LOS DATOS NECESARIOS
    
    public Animal(double altura, String nombre) {
        this.Altura = altura;
        this.Nombre = nombre;
    }
    
    // GETTER DE ALTURA (ACCESO A ALTURA)
    
    public double getAltura() {
        return this.Altura;
    }
    
    // GETTER DE NOMBRE (ACCESO A NOMBRE)
    
    public String getNombre() {
        return this.Nombre;
    }
    
    // SETTER DE NOMBRE (CAMBIO DE NOMBRE)
    
    public void setNombre(String valor) {
        this.Nombre = valor;
    }
    
    // DEFINIMOS LOS MÉTODOS 
    
    public void emitirSonido() {
        System.out.println("El animal " + this.Nombre + " esta emitiendo un sonido");
    }
}


// APLICAMOS HERENCIA DE CLASES

class Gato extends Animal {
    
    // ATRIBUTOS DE LA CLASE HIJA
    
    private boolean Pelaje;
    
    // CONSTRUCTOR DE LA CLASE HIJA
    
    public Gato(double altura, String nombre, boolean pelaje) {
        
        //USAMOS EL CONSTRUCTOR DEL PADRE LLAMÁNDOLO CON SUPER Y PASANDOLE LOS PARÁMETROS
        
        super(altura, nombre);
        this.Pelaje = pelaje;
        
    }
    
    // GETTER DE PELAJE (ACCESO A PELAJE)
    
    public boolean getPelaje() {
        return this.Pelaje;
    }
    
    // MÉTODO DE LA CLASE HIJA
    
    public void jugarPelota() {
        System.out.println("El gato juega con una pelota");
    }
}



public class Main
{
	public static void main(String[] args) {
	    
	    // DEFINIMOS LA CLASE PERRO Y USAMOS SUS MÉTODOS
	    
		Animal perro = new Animal(60, "Canino");
		perro.emitirSonido();
		System.out.println("Altura: " + perro.getAltura());
		
		// DEFINIMOS LA CLASE GATITO Y USAMOS SUS MÉTODOS
		
		Gato gatito = new Gato(20, "Gatito", true);
		gatito.jugarPelota();
		System.out.println("Nombre: " + gatito.getNombre());
	}
}