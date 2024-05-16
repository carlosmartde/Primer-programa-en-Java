//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //DETERMINAR SI ES MAYOR DE EDAD O NO
        int edad;
        System.out.println("Ingrese su edad");
        edad = Integer.parseInt(System.console().readLine());
        if (edad >= 18) {
            System.out.println("Si es mayor de edad");
        }else if (edad < 18) {
            System.out.println("No es mayor de edad");
        }
    }
}