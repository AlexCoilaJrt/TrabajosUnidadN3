import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese horas");
    double monto = sc.nextDouble();
    double desc1 = (monto * 10)/100;
    double desc2 = (monto * 12)/100;
    double desc3 = (monto * 15)/100;
    
    if(monto >= 1 && monto <=100 ){
      System.out.println("el costo es: " + (monto-desc1));
    }else if(monto >=101 && monto <= 200){   
      System.out.println("el costo es: "+(monto-desc2));
    }else if(monto >= 200){
      System.out.println("el costo es: "+(monto-desc3));
   
     } else{
         System.out.println("Monto no valido:");
     }




    }
}
