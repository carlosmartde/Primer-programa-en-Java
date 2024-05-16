//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
        float a,b;
        System.out.println("Ingrese el primer numero: ");
        a = Float.parseFloat(System.console().readLine());
        System.out.println("Ingrese el segundo numero: ");
        b = Float.parseFloat(System.console().readLine());
        if(a>b){
            System.out.println(a+" Es mayor que "+b);
        }else {
            System.out.println(b+"Es mayor que "+a);
        }
    }
}