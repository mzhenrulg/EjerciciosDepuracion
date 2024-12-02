package ejercicios.depuracion;

import java.util.Scanner;

public class Ejemplo1While {
    private int suma,numero;
    public Ejemplo1While(){
        this.suma=0;
        this.numero=0;
    }
    public static void main(String[] args) {
        int suma = 0, numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número, por favor: ");
        numero= sc.nextInt();
        while (numero>= 0){
               suma = suma + numero;
               System.out.print("Introduzca un número por favor: ");
               numero = sc.nextInt();
        }
        System.out.println("La suma es: " + suma );
    }
}

