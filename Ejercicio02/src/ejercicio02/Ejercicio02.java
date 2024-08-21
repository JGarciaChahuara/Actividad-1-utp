
package ejercicio02;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        double sueldo1, sueldo2, sueldo3, sueldo4, sueldo5;
        double totalSueldos, promedioSueldos;
        
        Scanner lectura = new Scanner ( System.in);
        System.out.print( "Ingrese el ler sueldo: ");
        sueldo1 = lectura.nextDouble();
        System.out.print( "Ingrese el 2do sueldo: ");
        sueldo2 = lectura.nextDouble();
        System.out.print("Ingrese el 3er sueldo:");
        sueldo3 = lectura.nextDouble();
        System.out.print("Ingrese el 4to sueldo:");
        sueldo4 = lectura.nextDouble();
        System.out.print("Ingrese el 5to sueldo:");
        sueldo5 = lectura.nextDouble();
        totalSueldos = sueldo1 + sueldo2 + sueldo3 + sueldo4 + sueldo5;
        promedioSueldos = totalSueldos / 5;
        System.out.println("Total de Sueldo:" + totalSueldos);
        System.out.println("Promedio de Sueldo:" + promedioSueldos);
        
                
    }
    
}
