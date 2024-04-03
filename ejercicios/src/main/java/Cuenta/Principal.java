
package Cuenta;
import com.mycompany.ejercicios.Persona;
import java.util.Scanner;

public class Principal {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir por teclado el nombre, edad, sexo, peso y altura
        System.out.println("Ingrese el nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la edad:");
        int edad = scanner.nextInt();

        System.out.println("Ingrese el sexo (H para hombre, M para mujer):");
        char sexo = scanner.next().charAt(0);

        System.out.println("Ingrese el peso en kg:");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese la altura en metros:");
        double altura = scanner.nextDouble();

        // Crear 3 objetos de la clase Persona
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        // Mostrar información y realizar comprobaciones para cada objeto
        System.out.println("\nInformación de la persona 1:");
        System.out.println(persona1.toString());
        System.out.println("\nInformación de la persona 2:");
        System.out.println(persona2.toString());
        System.out.println("\nInformación de la persona 3:");
        System.out.println(persona3.toString());

        scanner.close();
    }
}
