
package com.mycompany.ejercicios;

import java.util.Random;

public class Persona {
    private final static char SEXO_DEFECTO = 'H';
    private final static int PESO_IDEAL_BAJO = -1;
    private final static int PESO_IDEAL_NORMAL = 0;
    private final static int PESO_IDEAL_ALTO = 1;

    private String nombre;
    private int edad;
    private char sexo;
    private String DNI;
    private double peso;
    private double altura;

    public Persona() {
        this("", 0, SEXO_DEFECTO, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        this.DNI = generaDNI();
    }

    public int calcularIMC() {
        double imc = peso / Math.pow(altura, 2);
        if (imc < 20) {
            return PESO_IDEAL_BAJO;
        } else if (imc >= 20 && imc <= 25) {
            return PESO_IDEAL_NORMAL;
        } else {
            return PESO_IDEAL_ALTO;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    private char comprobarSexo(char sexo) {
        return (sexo == 'H' || sexo == 'M') ? sexo : SEXO_DEFECTO;
    }

    private String generaDNI() {
        Random rnd = new Random();
        int numDNI = rnd.nextInt(90000000) + 10000000; // Genera un número de 8 cifras
        String tablaAsignacion = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letraDNI = tablaAsignacion.charAt(numDNI % 23); // Calcula la letra correspondiente al número
        return Integer.toString(numDNI) + letraDNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getDNI() {
        return DNI;
    }

    @Override
    public String toString() {
        return "Información de la Persona:\n" +
                "Nombre: " + nombre + "\n" +
                "Edad: " + edad + " años\n" +
                "Sexo: " + sexo + "\n" +
                "DNI: " + DNI + "\n" +
                "Peso: " + peso + " kg\n" +
                "Altura: " + altura + " m\n" +
                "IMC: " + calcularIMC() + "\n" +
                "Mayor de edad: " + esMayorDeEdad();
    }

}
