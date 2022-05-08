import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) throws Exception {
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el monto");
    double monto = lt.nextDouble();
    if( monto >= 1 && monto <= 10){
      System.out.println("Podria regalar una tarjeta:");
      
      }else if(monto >=11 && monto <= 100) {
      System.out.println("Podria regalar un chocolate:");

      }else if(monto >=101 && monto <= 250){
      System.out.println("Podria regalar unas flores:");

      }else if(monto >=251){
      System.out.println("Podria regalar un anillo:");
      }else{
      System.out.println("Monto no valido");
      }
                
                  
                
                
           
                
            
            
        
            
    

    }
}
