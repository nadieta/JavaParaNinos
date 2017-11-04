import java.io.Console;

public class MyPassTest{

   public static void main (String args[]){
     
      Console cnsl = null;
     
     cnsl = System.console();
   
	System.out.println("Please Enter Password");
    char[] passString = cnsl.readPassword();
    String pass = new String(passString );
	
	}
	
}  
