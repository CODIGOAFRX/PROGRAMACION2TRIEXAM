package granja;

/**
 * Creación de Granja con herencia
 *
 * @version 1.02
 * @since Netbeans IDE 20
 * @author Pedro Jesús Gómez Pérez
 */
import java.util.Scanner;

import java.lang.Math;

/**
 *
 * @author AlumnoT
 */
public class Granja {

    private String nombre;
    private String clase_de_animal;
    private String ubicacion;
    private int capacidad;

    // CONTRUCTOR POR PARAMETRO

    /**
     *
     * @param nombre
     * @param clase_de_animal
     * @param capacidad
     * @param ubicacion
     */
    public Granja(String nombre, String clase_de_animal, int capacidad, String ubicacion) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        this.clase_de_animal = clase_de_animal;

    }

    // CONSTRUCTOR POR DEFECTO

    /**
     *
     */
    public Granja() {
        this.nombre = "";
        this.clase_de_animal = "";
        this.ubicacion = "";
        this.capacidad = 0;
    }

    // GETTERS Y SETTERS
    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return String return the clase_de_animal
     */
    public String getClaseDeAnimal() {
        return clase_de_animal;
    }

    /**
     * @param clase_de_animal the clase_de_animal to set
     */
    public void setClaseDeAnimal(String clase_de_animal) {
        this.clase_de_animal = clase_de_animal;
    }

    /**
     * @return String return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    /**
     * @return int return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    // @OVERRIDE SIRVE PARA LA SOBRECARGA Y DARLE AL MÉTODO NUEVA FUNCIONALIDAD

    /**
     *
     * @return
     */
    @Override
    // IMPRIME Y RESUME TODOS LOS MÉTODOS EN UNA SOLA VEZ.
    public String toString() {
        String mensaje = "Nombre : " + nombre + "\n" + "Clase de animal :  " + clase_de_animal + "\n" + "Ubicación : "
                + ubicacion + "\n"
                + "Capacidad :  " + capacidad;
        return mensaje;
    }

    // METODO PERSONALIZADO

    /**
     *
     */
    public void informeProduccionLeche() {
        double produccionDiariaPorAnimal;
        if (clase_de_animal == "Vacas") { //clase_de_animal.equals("vacas")
            produccionDiariaPorAnimal = (Math.random() * (4 - 2) + 2); // Producción diaria de leche por vaca en
            // litros
        } else {
            produccionDiariaPorAnimal = (Math.random() * (2 - 0.8) + 0.8);// Producción diaria de leche por cabra en
            // litros
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Introduce el numero de animales de la granja");
        System.out.println("----------------------------------------------------------------------");
        int cantidadAnimales = scanner.nextInt(); // Cantidad de animales
        double produccionTotalDiaria = produccionDiariaPorAnimal * cantidadAnimales;
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Informe de Producción de Leche");
        System.out.println("Granja: " + nombre);
        System.out.println("Tipo de animal: " + clase_de_animal);
        System.out.println("Cantidad de animales: " + cantidadAnimales);
        System.out.println("Producción total diaria de leche: " + produccionTotalDiaria + " litros");
        System.out.println("----------------------------------------------------------------------");
    }
}
