package granja;

/**
 * Creación de Granja con herencia
 *
 * @version 1.02
 * @since Netbeans IDE 20
 * @author Pedro Jesús Gómez Pérez
 */
public class Cabra extends Granja {

    private int edad;
    private String color;
    private double peso;
    private int numero;

    // CONTRUCTOR POR PARAMETROS

    /**
     *
     * @param nombre
     * @param clase_de_animal
     * @param capacidad
     * @param ubicacion
     * @param edad
     * @param color
     * @param peso
     * @param numero
     */
    public Cabra(String nombre, String clase_de_animal, int capacidad, String ubicacion, int edad, String color,
            double peso, int numero) {
        super(nombre, clase_de_animal, capacidad, ubicacion);
        this.edad = edad;
        this.color = color;
        this.peso = peso;
        this.numero = numero;
    }

    // CONTRUCTOR POR DEFECTO

    /**
     *
     */
    public Cabra() {
        super(); // llamada al constructor por defecto de la clase padre
        this.edad = 0;
        this.color = "";
        this.peso = 0;
        this.numero = 0;
    }

    /**
     * @return int return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return int return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return String return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return double return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Nombre : " + getNombre() + "\n" + "Clase de animal :  " + getClaseDeAnimal() + "\n" + "Ubicación : "
                + getUbicacion() + "\n"
                + "Capacidad :  " + getCapacidad() + "\n" + "Cabra [ Numero: " + numero + ", edad : " + edad + ", color : "
                + color
                + ", peso : " + peso
                + "]";
    }

    // METODO PERSONALIZADO

    /**
     *
     */
    @Override
    public void informeProduccionLeche() {
        double produccionDiariaPorAnimal = (Math.random() * (2 - 0.8) + 0.8);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Características de la cabra elegida");
        System.out.println("Numero: " + numero);
        System.out.println("Edad: " + edad);
        System.out.println("Color: " + color);
        System.out.println("Peso: " + peso);
        System.out.println("Producción diaria del animal: " + produccionDiariaPorAnimal + " Litros/día");
        System.out.println("----------------------------------------------------------------------");
    }
}
