//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("**************MENU**************");
            System.out.println("[1] MAYOR DE EDAD");
            System.out.println("[2] CUAL ES EL NUMERO MAYOR");
            System.out.println("[3] NUMERO PAR O IMPAR");
            System.out.println("[4] CALCULAR FACTORIAL");
            System.out.println("[5] NUMEROS IMPARES CON FOR");
            System.out.println("[6] NUMEROS IMPARES CON WHILE");
            System.out.println("[7] DIAS DE LA SEMANA");
            System.out.println("[0] SALIR DEL PROGRAMA");
            System.out.println("SELECCIONA UNA OPCION:");
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1: {
                    int edad;
                    System.out.println("Ingrese su edad");
                    edad = Integer.parseInt(System.console().readLine());
                    if (edad >= 18) {
                        System.out.println("Si es mayor de edad");
                    }else if (edad < 18) {
                        System.out.println("No es mayor de edad");
                    }
                }
                break;
                case 2: {
                    float a,b;
                    System.out.println("Ingrese el primer numero: ");
                    a = Float.parseFloat(System.console().readLine());
                    System.out.println("Ingrese el segundo numero: ");
                    b = Float.parseFloat(System.console().readLine());
                    if(a>b){
                        System.out.println(a+" Es mayor que "+b);
                    }else {
                        System.out.println(b+" Es mayor que "+a);
                    }
                }
                break;
                case 3: {
                    int numero;
                    System.out.println("INGRESE UN NUMERO");
                    numero = Integer.parseInt(System.console().readLine());
                    if (numero % 2 == 0) {
                        System.out.println(numero+" SI ES UN NUMERO PAR");
                    }else {
                        System.out.println(numero+" ES UN NUMERO IMPAR");
                    }
                }
                break;
                case 4: {
                    int numero;
                    int factorial=1;
                    System.out.println("INGRESE UN NUMERO:");
                    numero = Integer.parseInt(System.console().readLine());
                    int i=numero;
                    while (i>1){
                        factorial*=i;
                        i--;
                    }
                    System.out.println("El factorial de "+numero+" es: "+factorial);
                }
                break;
                case 5: {
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
                }
                break;
                case 6: {
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
                }
                break;
                case 7: {
                    Scanner scanner = new Scanner(System.in);
                    int numero = 0;
                    while (true) {
                        System.out.print("Por favor, ingrese un número del 1 al 5: ");
                        if (scanner.hasNextInt()) {
                            numero = scanner.nextInt();
                            if (numero >= 1 && numero <= 5) {
                                break;
                            } else {
                                System.out.println("El número debe estar entre 1 y 5. Intente de nuevo.");
                            }
                        } else {
                            System.out.println("Entrada no válida. Por favor, ingrese un número.");
                            scanner.next(); // Descarta la entrada no válida
                        }
                    }
                    String dia;
                    switch (numero) {
                        case 1:
                            dia = "Lunes";
                            break;
                        case 2:
                            dia = "Martes";
                            break;
                        case 3:
                            dia = "Miércoles";
                            break;
                        case 4:
                            dia = "Jueves";
                            break;
                        case 5:
                            dia = "Viernes";
                            break;
                        default:
                            dia = "Número no válido";
                            break;
                    }

                    // Mostrar el día de la semana
                    System.out.println("\nEl día correspondiente es: " + dia);
                }
                break;
                case 0:{
                    System.out.println("GRACIAS POR UTILIZAR EL PROGRAMA");
                    return;
                }
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(opcion != 0);
    }

    }