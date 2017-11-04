import java.util.Scanner;
import java.io.*;

public class MiHucha {

  public static void main (String []args){
     String contrasena; 
     int totalAhorrado = 0;
     String pideContrasena = "Introduce tu clave para poder operar y pulsa Enter";
     String contrasenaOK = "::::Bienvenido a tu hucha securizada.:::";
     String total = " >>> El total ahorrado es ";
     String gracias = "::: Gracias por usar la hucha electrónica. :::";
     String KO = "Contraseña incorrecta. No estás autorizado a usar esta hucha.";

	//archivo ahorros
	File ruta = new File("C:/Users/Albert/Desktop/scripts/totalAhorrado.txt");

	Scanner miScanner = new Scanner(System.in); //nuevo Scanner teclado

	System.out.println(pideContrasena); //pide la contraseña
	contrasena = miScanner.next();
	try{
	switch (contrasena) {
		case "abracadabra":
		Scanner scanTxt = new Scanner(ruta); //nuevo Scanner archivo
	    totalAhorrado = scanTxt.nextInt();
		System.out.println(contrasenaOK + "\n" + total + " " + totalAhorrado);
		//pregunta al usuario
		System.out.println("Indica la cantidad a ingresar, por favor");
		//crea una variable en la que guardar la cantidad a ingresar
		int ingreso = miScanner.nextInt();
		if (ingreso > 0) {
			totalAhorrado = totalAhorrado+ingreso;
			//invoco Prinststream
            PrintStream escritor = new PrintStream(ruta);
			escritor.print(totalAhorrado);
			escritor.close();
		} else {
			System.out.println("El importe debe ser mayor que 0.");
			System.out.println("No se ha realizado el ingreso.");
		}
	      //muestra al usuario el total actual
		System.out.println(total + " " + totalAhorrado+ "\n" + gracias);
		scanTxt.close();
		break;
		default:
		System.out.println (KO);
		break;
       }
	}catch(Exception e){
		System.out.println(e);
	}
		
	
   }
   
}
