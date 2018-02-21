package capturadedatos;

import java.util.Scanner;


public class CapturadeDatos {


    public static void main(String[] args) {
        
        String nombre;
        int edad;
        String telefono;
        double sueldo;
        char sexo;
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Digite un nombre: "); nombre=entrada.next();
        System.out.print("Digite la edad: "); edad=entrada.nextInt();
        System.out.print("Digite el telefono: "); telefono=entrada.next();
        System.out.print("Digite el sueldo: "); sueldo=entrada.nextDouble();
        System.out.print("Digite el sexo: "); sexo=entrada.next().charAt(0);
        
        System.out.println("\n");
        
        System.out.println("El sexo digitado es: " + sexo);
        System.out.println("La edad Digitada es: " + edad);
        System.out.println("El nombre digitado es: " + nombre);
        System.out.println("El sueldo digitado es: " + sueldo + " pesos");
        System.out.println("El numero de telefono digitado es: " + telefono);
        
    }
 
}
