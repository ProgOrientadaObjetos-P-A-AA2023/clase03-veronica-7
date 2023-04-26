/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoclases03;

import java.util.Scanner;
/**
 *
 * @author SALA H
 */
public class Ejecutable05 {
    public static void main(String[] args){
       
        Hospital miHospital = new Hospital();
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        int numeroCamas;
        double presupuesto;
        
        //Los valores se ingresan por teclado
        System.out.println("Ingrese el nombre del Hospital:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el numero de camas del Hospital:");
        numeroCamas = entrada.nextInt();
        System.out.println("Ingrese el prespuesto del Hospital");
        presupuesto = entrada.nextDouble();
        
        //Dar valores y atributos
        miHospital.establecerNombre(nombre);
        miHospital.establecerNumeroCamas(numeroCamas);
        miHospital.establecerPresupuesto(presupuesto);
        
        //Presnetar los valores del objeto
        System.out.printf("%s - %d - %.2f\n",  miHospital.obtenerNombre(),
                 miHospital.obtenerNumeroCamas(),  miHospital.obtenerPresupuesto());
     }
    
}       
        






