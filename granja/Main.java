package granja;

/**
 * Creación de Granja con herencia
 *
 * @version 1.02
 * @since Netbeans IDE 20
 * @author Pedro Jesús Gómez Pérez
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Granja miGranja1 = new Granja("Granja Paco", "Vacas", 100, "Andorra");
        Granja miGranja2 = new Granja("Granja Pepe", "Cabras", 200, "Almería");
        Vaca vaca1 = new Vaca("Granja Paco", "Vacas", 100, "Andorra", 14, "Verde", 300, 151);
        Cabra cabra1 = new Cabra("Granja Pepe", "Cabra", 200, "Almería", 4, "Blanca", 50, 181);
        System.out.println("----------------------------------------------------------------------");
        System.out.println(vaca1);
        System.out.println("----------------------------------------------------------------------");
        System.out.println(cabra1);
        System.out.println("----------------------------------------------------------------------");
        System.out.println(miGranja1);
        System.out.println("----------------------------------------------------------------------");
        System.out.println(miGranja2);
        System.out.println("----------------------------------------------------------------------");

        vaca1.informeProduccionLeche();
        cabra1.informeProduccionLeche();
        miGranja1.informeProduccionLeche();
        miGranja2.informeProduccionLeche();
    }

}
