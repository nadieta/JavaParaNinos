import java.io.File;
import java.util.Scanner;
import java.io.PrintStream;

public class LectorArchivos{

public static void main(String []args){

try{  
  //creo la ruta
  File ruta = new File("C:/Users/Albert/Desktop/texto.txt");
  
  //PARTE 1: LEER
    //invoco al Scanner
     Scanner scanArchivo = new Scanner(ruta);
   //muestro el texto
      String frase = scanArchivo.nextLine();
      System.out.println(frase);
	  scanArchivo.close();
   
  //PARTE 2: ESCRIBIR   
  //invoco Prinststream
  PrintStream escritor = new PrintStream(ruta);
 //Escribo un texto en mi archivo
   String texto = "He conseguido escribir el archivo";
  //Escribo en el archivo
  escritor.print(texto);
  escritor.close();

  //PARTE 3: LEER OTRA VEZ
   Scanner lector = new Scanner(ruta);
   frase = lector.nextLine();
   System.out.println(frase);
   lector.close();	
	
}catch (Exception e){
   System.out.println(e);
}

}
}
