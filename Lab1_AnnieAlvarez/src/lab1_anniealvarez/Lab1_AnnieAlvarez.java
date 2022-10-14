/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1_anniealvarez;
import java.util.Scanner;
/**
 *
 * @author anniealvarez
 */
public class Lab1_AnnieAlvarez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("--Bienvenido al sistrma de calculo de promedio--");
        System.out.print("Ingrese su nombre: ");//se ingresa el nombre del usuaria
        String nombre = entrada.nextLine();
        
        //se ingresan las notas de las cuatros clases
        System.out.print("Ingrese la nota final de la primera clase: ");
        double primeraClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la segunda clase: ");
        double segundaClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la tercera clase: ");
        double terceraClase = entrada.nextDouble();
        
        System.out.print("Ingrese la nota final de la cuarta clase: ");
        double cuartaClase = entrada.nextDouble();
        
        //se calculo del promedio
        double sumaClase = primeraClase + segundaClase + terceraClase + cuartaClase;
        double promedio = sumaClase/4;
        
        //se implime el calculo del promedio
        System.out.println("--"+ nombre+ " el promedio de las cuatro clases es: "+promedio);
        
    }
    
}
