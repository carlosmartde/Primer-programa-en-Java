//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //DETERMINAR SI ES MAYOR DE EDAD O NO
        /*int edad;
        System.out.println("Ingrese su edad");
        edad = Integer.parseInt(System.console().readLine());
        if (edad >= 18) {
            System.out.println("Si es mayor de edad");
        }else if (edad < 18) {
            System.out.println("No es mayor de edad");
        }*/
        //DETERMINAR QUE NUMERO ES MAYOR
        /*float a,b;
        System.out.println("Ingrese el primer numero: ");
        a = Float.parseFloat(System.console().readLine());
        System.out.println("Ingrese el segundo numero: ");
        b = Float.parseFloat(System.console().readLine());
        if(a>b){
            System.out.println(a+" Es mayor que "+b);
        }else {
            System.out.println(b+"Es mayor que "+a);
        }*/
        //NUMERO PAR O IMPAR
        /*
        int numero;
        System.out.println("INGRESE UN NUMERO");
        numero = Integer.parseInt(System.console().readLine());
        if (numero % 2 == 0) {
            System.out.println(numero+" SI ES UN NUMERO PAR");
        }else {
            System.out.println(numero+" NO ES UN NUMERO PAR");
        }*/
        //CALCULAR EL FACTORIAL DE UN NUMERO
        /*
        int numero;
        int factorial=1;
        System.out.println("INGRESE UN NUMERO:");
        numero = Integer.parseInt(System.console().readLine());
        int i=numero;
        while (i>1){
            factorial*=i;
            i--;
        }
        System.out.println("El factorial de "+numero+" es: "+factorial);*/
        //NUMEROS IMPARES
        /*
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        while (true) {
            System.out.print("Por favor, ingrese un número mayor a 10 y menor que 30: ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero > 10 && numero < 30) {
                    break;
                } else {
                    System.out.println("El número debe ser mayor a 10 y menor que 30. Intente de nuevo.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.next(); // Descarta la entrada no válida
            }
        }
        System.out.println("Números impares desde 1 hasta " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        scanner.close();*/
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        // Solicitar al usuario un número válido
        while (true) {
            System.out.print("Por favor, ingrese un número mayor a 10 y menor que 30: ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero > 10 && numero < 30) {
                    break;
                } else {
                    System.out.println("El número debe ser mayor a 10 y menor que 30. Intente de nuevo.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.next(); // Descarta la entrada no válida
            }
        }

        // Mostrar los números impares desde 1 hasta el número ingresado
        System.out.println("Números impares desde 1 hasta " + numero + ":");
        int i = 1;
        while (i <= numero) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }

        scanner.close();
    }

    }
