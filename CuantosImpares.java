import java.util.*;

 public class CuantosImpares {
 
    public static void main(String[] args){
	 int contador=0;
	 
	 Scanner miScanner = new Scanner(System.in);
	 System.out.println("Por favor, introduce un número entero");
	 int num = miScanner.nextInt();
	 
	for (int i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
				contador++;
			}
		}
		System.out.println("Entre el 0 y el "+num+" existen "+contador+" impares.");
    }
}
