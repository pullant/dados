import java.util.Scanner;
public class Juegodedados{
    public static void entradadedatos(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el nombre del primer jugador: ");
        String jugadoruno = scanner.next();
        System.out.println(jugadoruno);
    }

    public static void main(String[] args){
        entradadedatos();
    }
}
