import java.util.Scanner;

public class ScannerJaimito{

     public static void main(String []args){
         
         int totalAhorrado = 0;
		 String collar = null;
         
        System.out.println("El total ahorrado es " + totalAhorrado);
        
        //pregunta al usuario
        System.out.println("Indica la cantidad a ingresar, por favor");
        
        //abre nuevo Scanner
        Scanner miScanner = new Scanner(System.in);
        
        //crea una variable en la que guardar la cantidad a ingresar
        String miCollar = miScanner.nextLine();
		collar = miCollar;
        
        //muestra al usuario el total actual
        System.out.println("El total ahorrado es " + totalAhorrado + ". El valor del collar es " + collar +". Gracias por su ingreso.");
		
   
}
}