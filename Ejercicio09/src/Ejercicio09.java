import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) throws Exception {
        int antiguedad;
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el año de la antiguedad del empleado: ");
        antiguedad=lt.nextInt();
        if (antiguedad == 0) {
            System.out.println("El empleado recibira 0 de bono:");
        }else if(antiguedad == 1) {
            System.out.println("El empleado recibira s/100 de bono:");
        }else if(antiguedad == 2) {
            System.out.println("El empleado recibira s/200 de bono:");
        }else if(antiguedad == 3) {
            System.out.println("El empleado recibira s/300 de bono:");
        }else if(antiguedad == 4) {
            System.out.println("El empleado recibira s/400 de bono:");
        }else if(antiguedad == 5) {
            System.out.println("El empleado recibira s/500 de bono:");
        }else if(antiguedad > 5) {
            System.out.println("El empleado recibira s/1000 de bono:");           
        } else {
            
        }
        
        

    
    }
}
