import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) throws Exception {
        double htra = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese horas semana");
        double horas = sc.nextDouble();

        double total = horas * htra;
        double horasext = (horas * htra)*2;
        if(horas <= 40){
      
        System.out.println("el sueldo es: " + total);
        }else {
        System.out.println("el sueldo es: " + horasext);
        }


       
            
        

        
                
         








    }
}
