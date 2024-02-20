package calculo;

import java.util.Scanner;

public class Calculadora {

    private double numero_1;
    private double numero_2;

    // CPP
    public Calculadora(double numero_1, double numero_2) {
        this.numero_1 = numero_1;
        this.numero_2 = numero_2;
    }

    // CPD
    public Calculadora() {
        this.numero_1 = 0;
        this.numero_2 = 0;
    }

    /**
     * @return double return the numero_1
     */
    public double getNumero1() {
        return numero_1;
    }

    /**
     * @param numero_1 the numero_1 to set
     */
    public void setNumero1(double numero_1) {
        this.numero_1 = numero_1;
    }

    /**
     * @return double return the numero_2
     */
    public double getNumero2() {
        return numero_2;
    }

    /**
     * @param numero_2 the numero_2 to set
     */
    public void setNumero2(double numero_2) {
        this.numero_2 = numero_2;
    }
    // toString()

    @Override
    public String toString() {
        return "Calculadora [numero_1=" + numero_1 + ", numero_2=" + numero_2 + "]";
    }

    // metodos personalizados
    public double sumar() {
        return numero_1 + numero_2;
    }

    public double restar() {
        return numero_1 - numero_2;
    }

    public double multiplicar() {
        return numero_1 * numero_2;
    }

    public double dividir() throws Exception {
        if (numero_2 == 0) {
            throw new Exception("No puedo dividir entre 0");
        }
        return numero_1 / numero_2;
    }

    public double raiz_cuadrada() throws Exception {
        if (numero_1 < 0) {
            throw new Exception("No puedo calcular numeros imaginarios");
        }
        return Math.sqrt(numero_1);
    }

    public double potencia() throws Exception {
        if (numero_1 == 0) {
            throw new Exception("No se puedo hacer la potencia si la base es 0 ");
        } else if (numero_2 < 0) {
            throw new Exception("No se puedo hacer la potencia si el exponente es negativo ");
        }
        return Math.pow(numero_1, numero_2);
    }

    public double factorial() throws Exception {
        if (numero_1 < 0) {
            throw new Exception("No puedo calcular el factorial si el numero es negativo");
        }

        for (int i = 1; i < numero_1; i++) {
            i *= numero_1;
        }
        return numero_1;
    }

    public double logaritmo() throws Exception {
        if (numero_1 < 0) {
            throw new Exception("No puedo calcular logaritmos si el numero es negativo ");
        }
        return Math.log(numero_1);
    }

}
