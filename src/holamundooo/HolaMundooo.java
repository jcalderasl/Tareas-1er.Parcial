
package holamundooo;
import java.util.*;
/**
 *
 * @author PC
 */
public class HolaMundooo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double conversion=0.0;
                int Quetzal;
                int opcion =0;
                String nom;
                Scanner entrada=new Scanner(System.in);//Para guardar los datos
    System.out.println("Ingrese su Nombre");
    nom = entrada.next();//next para entrada de datos
    System.out.println("Introduce la cantidad de Quetzales a convertir");
    Quetzal=entrada.nextInt();
    
    System.out.println("A que Moneda Quieres convertir?");
    System.out.println("1)Dolares");
    System.out.println("2)Euros");
    System.out.println("3)Yuanes");
    System.out.println("4)Salir");
    System.out.println("INGRESE OPCION");
    opcion=entrada.nextInt();
    
    if(opcion==1)
    { 
        conversion = Quetzal*7.75;
        System.out.println("La cantidad en Dolares es de:"+conversion);
    }
    if(opcion==2)
    { 
        conversion = Quetzal*9.15;
        System.out.println("La cantidad en Euros es de:"+conversion);
    }
    if(opcion==3)
    { 
        conversion = Quetzal*1.20;
        System.out.println("La cantidad en Yuanes es de:"+conversion);
    }
    if(opcion==4)
    { 
        System.out.println("Cerrado...");
    }
    if(opcion>4 || opcion <1)
    { 
        System.out.println("Opcion Incorrecta vuelve a intentar");
    }
    
    
    }
    
}
