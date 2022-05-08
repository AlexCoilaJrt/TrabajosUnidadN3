import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) throws Exception {
        int edad1,edad2,edad3;
    String nombre1,nombre2,nombre3;
    Scanner lt=new Scanner(System.in);
    System.out.println("Escribe tu nombre: ");
    nombre1=lt.nextLine();
    System.out.println("Escribir tu edad: ");
    edad1=lt.nextInt();
    Scanner lt2=new Scanner(System.in);
    System.out.println("Escribe otro nombre: ");
    nombre2=lt2.nextLine();
    System.out.println("Escribe tu edad: ");
    edad2=lt2.nextInt();
    Scanner lt3=new Scanner(System.in);
    System.out.println("Escribe otro nombre: ");
    nombre3=lt3.nextLine();
    System.out.println("Escribe tu edad: ");
    edad3=lt3.nextInt();
    if (edad1<edad2){
    } if(edad1 < edad3){
      System.out.println("La edad menor es de:"+edad1);
      System.out.println(edad1 +"años");
      }else{
      }
    }
}
