

import java.io.*;
import java.util.Scanner;

public class Practica13 {
    public static void main(String[] args) {
        double[][] notas = new double[3][3];

        FileWriter fichero = null; // Abre el fichero
        PrintWriter pw = null; // escribe en el fichero poner iniciales de las clases donde vamos a escribir
        Scanner teclado = new Scanner(System.in);
        try {
            // Abrir el archivo, con el constructor de la primera clase
            fichero = new FileWriter("Practica13.txt");
            pw = new PrintWriter(fichero); // escribimos en el fichero

            // Escribir el contenido del archivo
            // usamos el scanner creado con anterioirdad para escribir en el fichero

            double nota = 0;
            for (int i = 0; i < 3; i++) {
                pw.println("Alumno " + (i + 1) + ": ");
                for (int j = 0; j < 3; j++) {
                    System.out.println("Introduce la nota " + (j + 1) + " del alumno " + (i + 1) + ": ");
                    nota = teclado.nextDouble();
                    notas[i][j] = nota;
                    pw.println("La nota " + (j + 1) + " es: " + nota);
                }
                double media = (notas[i][2] + notas[i][1] + notas[i][0]) / 3;
                pw.println("Su nota media es : " + media);
                if (media < 5) {
                    pw.println("tas suspenso premo");
                } else if (media >= 5 && media < 6) {
                    pw.println("aprobao raspao pare");
                } else if (media >= 6 && media < 7) {
                    pw.println("paso de bien ");
                } else if (media >= 7 && media < 9) {
                    pw.println("Se nota el esfuerzo hermano, toma notable");
                } else if (media >= 9 && media < 10) {
                    pw.println("Sobresaliente pa mi surmano");
                } else if (media == 10) {
                    pw.println("Excelente suprimo");
                } else {
                    pw.println("error");
                }
            }


            // frases predeteminadas

        } catch (IOException e) {
            // Manejar la excepción
            System.err.println("Error al leer el archivo: " + e.toString()); // ( serr - para problemas )
        } finally {
            // Cerrar el archivo en el bloque finally
            try {
                pw.close();
                fichero.close();
            } catch (IOException e) {
                // Manejar la excepción al cerrar el archivo
                System.err.println("Error al cerrar el archivo: " + e.toString());
            }
        } 
            File archivo = null; // Abre el archivo
            FileReader fr = null; // Lee el archivo car�cter a car�cter
            BufferedReader br = null; // Lee el archivo l�nea a l�nea

                try {
                    // Abrir el archivo
                    archivo = new File("Practica13.txt");
                    fr = new FileReader(archivo);
                    br = new BufferedReader(fr);
                    // Leer el contenido
                    String linea;
                
                    while ((linea = br.readLine()) != null) {
                        System.out.println(linea);
                        
                    }
                } catch (IOException e) {
                    // Manejar la excepción
                    System.err.println("Error al leer el archivo: " + e.toString());
                } finally {
                    // Cerrar el archivo en el bloque finally
                    try {
                        br.close();
                        fr.close();
                    } catch (IOException e) {
                        // Manejar la excepción al cerrar el archivo
                        System.err.println("Error al cerrar el archivo: " + e.toString());
                    }
                }
            
    }// main
}// class
