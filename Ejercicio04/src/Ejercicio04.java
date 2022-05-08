import java.util.Scanner;

public class Ejercicio04 {
    
    public static void main(String[] args) throws Exception {
    double chor1 = 5;
    double chor2 = 4;
    double chor3 = 3;
    double chor4 = 2;
    Scanner lt= new Scanner(System.in);
    System.out.println("Ingrese horas");
    double monto = lt.nextDouble();
    double horas1 = monto * 5;
    double horas2 = ((2 * 5) + (monto - 2) *4);
    double horas3 = ((2*5)+(3*4)+(monto-5)*3);
    double horas4 = ((2*5)+(3*4)+(5*3)+(monto-10)*2);
    
    
    if(monto >= 1 && monto <=2 ){
      
      System.out.println("el costo es: s/ " + horas1);
    }else if(monto >=3 && monto <= 5){   
      System.out.println("el costo es: s/ " + horas2);
    }else if(monto >= 6 && monto <=10){
      System.out.println("el costo es: s/ " + horas3);
    }else if(monto >=11){
      System.out.println("el costo es: s/ " + horas4);
    }else {
      System.out.println("Monto no valido");
    }
        
        
        





    }
}
        
