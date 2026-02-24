package Orientacion_a_objetos.Ejercicios_Normales.Gatos;

import java.util.Scanner;

public class Gato {
    // Atributo
    String color;
    String raza;
    String sexo;
    int edad;
    float peso;

    // Contructor

    public Gato(String color, String raza, String sexo, int edad, float peso) {
        this.color = color;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }


    // Metodo

    void maullar(){
        System.out.println("miaaaauuuuuuuuuuu");
    }
    void ronronear(){
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrr");
    }

    void comer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Come Pescasdo? (S/N)");
        String comida = sc.next().toUpperCase();

        if (comida.equals("S")){
            System.out.println(" Yummy Yummy");
        }
        else {
            System.out.println("buahhh, mejor no");
        }
    }

    void pelear(Gato otroGato) {
        if (this.sexo.equals(otroGato.sexo)) {
            System.out.println("ven aquí que te vas a enterar");
        }
        else {
            System.out.println("la violencia nunca es la solución");
        }
    }
}