import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
        int antiguedad;
        double sueldo, bono;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese la antiguedad: ");
        antiguedad = in.nextInt();
        System.out.print("Ingrese el sueldo: ");
        sueldo = in.nextDouble();
    
        if(antiguedad > 4 || sueldo <2000){
          bono = sueldo *0.25;
        }else{
          bono = sueldo * 0.20;
        }

        System.out.print("Te corresponde: " + bono);
    }
}
