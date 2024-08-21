package ejercicio01;
import java.util.Scanner;

/**
 *
 * @author JOSE
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        
        String empleado, producto;
        double precio, igv, subtotal, total;
        int cantidad;
        // TODO code application logic here
        Scanner lectura = new Scanner (System.in);
        System.out.print("Nombre del Cliente: ");
        empleado = lectura.next();
        System.out.print("Ingrese Producto: ");
        producto = lectura.next();
        System.out.print("Ingrese el Precio del Producto:");
        precio = lectura.nextDouble();
        System.out.print("Ingrese la Cantidad de Productos:");
        cantidad = lectura.nextInt();
        subtotal = precio * cantidad;
        igv = subtotal * 0.18;
        total = subtotal - igv;
        System.out.println("El subtotal es: " + subtotal);
        System.out.println("El IGV es: " + igv);
        System.out.println("El total es: " + total);
    }
    
}
