
import java.util.Random;
public class random{

  public static void main(String []args){
   //crea un nuevo objeto random
   Random random = new Random();
    
      // usando el objeto random, obtiene un numero entero 
	  //de 0 a 100 y lo guarda en la variable randomInt
      int randomInt = random.nextInt(100);
	  //lo muestra por pantalla
	  System.out.println(randomInt);  
  }
 }
