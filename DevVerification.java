import java.util.Scanner;

public class DevVerification {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Ingrese su primer nombre");
        var nombre = sc.nextLine();
        System.out.println("Hola " + nombre + " ingresa tu apellido");
        var apellido = sc.nextLine();
        System.out.println("Bienvenido " + nombre+ " " + apellido + "ahora dinos el lenguaje que estudias");
        var lenguaje = sc.nextLine();
        System.out.println("Bienvenido al curso de " + lenguaje + " " + nombre + " " + apellido);
        sc.close();
    }
}
