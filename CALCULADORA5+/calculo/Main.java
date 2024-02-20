package calculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------------------------------");
        System.out.println("Introduzca el numero 1");
        System.out.println("------------------------------------------------------------");
        calculadora.setNumero1(scanner.nextDouble());
        System.out.println("------------------------------------------------------------");
        System.out.println("Introduzca el numero 2");
        System.out.println("------------------------------------------------------------");
        calculadora.setNumero2(scanner.nextDouble());
        boolean abierto = true;
        while (abierto) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("---------SELECIONA LA OPCIÓN DESEADA PARA REALIZAR------------");
            System.out.println("--------------------1  <<<< SUMAR >>>>         ---------------");
            System.out.println("--------------------2  <<<< RESTAR >>>         ---------------");
            System.out.println("--------------------3  <<<< MULTIPLICAR >>>    ---------------");
            System.out.println("--------------------4  <<<< DIVIDIR >>>        ---------------");
            System.out.println("--------------------5  <<<< RAIZ CUADRADA >>>  ---------------");
            System.out.println("--------------------6  <<<< POTENCIA >>>       ---------------");
            System.out.println("--------------------7  <<<< FACTORIAL >>>      ---------------");
            System.out.println("--------------------8  <<<< LOGARITMO >>>      ---------------");
            System.out.println("--------------------9  <<<< CAMBIAR NUMEROS >>>---------------");
            System.out.println("--------------------10 <<<< SALIR >>>          ---------------");
            System.out.println("--------------------------------------------------------------");
            System.out.println("------------------  <NUMEROS DEL 1 AL 9...>    ---------------");
            System.out.println("--------------------------------------------------------------");

            int opcion = scanner.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        System.out.println("El resultado es = " + calculadora.sumar());
                        break;
                    case 2:
                        System.out.println("El resultado es = " + calculadora.restar());
                        break;
                    case 3:
                        System.out.println("El resultado es = " + calculadora.multiplicar());
                        break;
                    case 4:
                        System.out.println("El resultado es = " + calculadora.dividir());
                        break;
                    case 5:
                        System.out.println(
                                "¿A que numero de los 2 le quieres hacer la raiz cuadrada? ¿Al numero <1> o al numero <2> ?");
                        int eleccion = scanner.nextInt();
                        if (eleccion == 2) {
                            calculadora.setNumero1(calculadora.getNumero2());
                            System.out.println("DE ACUERDO!!");

                        } else if (eleccion == 1) {
                            System.out.println("DE ACUERDO!!");
                        } else {
                            System.out.println("Revise el numero introducido por favor");
                        }
                        System.out.println("El resultado es = " + calculadora.raiz_cuadrada());
                        break;
                    case 6:
                        System.out.println("El resultado es = " + calculadora.potencia());
                        break;
                    case 7:
                        System.out.println(
                                "¿A que numero de los 2 le quieres hacer el factorial ? ¿Al numero <1> o al numero <2> ?");
                        int eleccion_fact = scanner.nextInt();

                        if (eleccion_fact == 2) {
                            calculadora.setNumero1(calculadora.getNumero2());
                            System.out.println("DE ACUERDO!!");

                        } else if (eleccion_fact == 1) {
                            System.out.println("DE ACUERDO!!");
                        } else {
                            System.out.println("Revise el numero introducido por favor");
                        }
                        System.out.println("El resultado es = " + calculadora.factorial());
                        break;
                    case 8:
                        System.out.println(
                                "¿A que numero de los 2 le quieres hacer el logaritmo ? ¿Al numero <1> o al numero <2> ?");
                        int eleccion_log = scanner.nextInt();
                        if (eleccion_log == 2) {
                            calculadora.setNumero1(calculadora.getNumero2());
                            System.out.println("DE ACUERDO!!");

                        } else if (eleccion_log == 1) {
                            System.out.println("DE ACUERDO!!");
                        } else {
                            System.out.println("Revise el numero introducido por favor");
                        }
                        System.out.println("El resultado es = " + calculadora.logaritmo());
                        break;
                    case 9:
                        System.out.println("Vueve a introducir el valor 1");
                        calculadora.setNumero1(scanner.nextDouble());
                        System.out.println("Vueve a introducir el valor 2");
                        calculadora.setNumero2(scanner.nextDouble());

                        break;

                    case 10:
                        abierto = false;
                        break;

                    default:
                        System.out.println("Te has equivocado de numero vuelve a intentarlo");
                        break;
                }
            } catch (Exception error) {
                System.out.println("Error: " + error.toString());
            }
        }
    }
}
