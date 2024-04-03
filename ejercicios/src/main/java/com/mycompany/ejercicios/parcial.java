
package com.mycompany.ejercicios;

import Cuenta.Cuenta;

public class parcial {
     public static void main(String[] args) {
         
         Cuenta cuenta1= new Cuenta("luiggy sebastian");
          System.out.println("Titular de la cuenta: " + cuenta1.getTitular());
        System.out.println("Cantidad en la cuenta: " + cuenta1.getCantidad());
        
         Cuenta cuenta2= new Cuenta("jaime jamaica", 700);
         System.out.println("Titular de la cuenta: " + cuenta2.getTitular());
        System.out.println("Cantidad en la cuenta: " + cuenta2.getCantidad());
        
         cuenta2.ingresar(200);
        System.out.println("Cantidad en la cuenta después de ingresar dinero: " + cuenta2.getCantidad());

        // Retirar dinero de la cuenta
        cuenta2.retirar(300);
        System.out.println("Cantidad en la cuenta después de retirar dinero: " + cuenta2.getCantidad());
     }
}
