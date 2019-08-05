import java.util.Scanner;

/**
 * Programa para hallar viajes, ganancia y costo
 * 
 * @author Carlos Alvarez 
 * @version 20190803
 */
public class colectivo
{
    public static void main(String[] args)
    {
        double n,cap=50,tk=10000,cost=2000,viaj,gan,prop;
        
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("El valor del pasaje es de 10.000 CoP, existe capacidad para 50 personas");
        
        System.out.println("Cuantas personas viajan en el colectivo");
        n = Teclado.nextDouble();
        
        viaj = Math.ceil(n/cap);
        gan = n*tk;
        prop = n*cost;
                 
        System.out.println("La cantidad de viajes es " + viaj);
        System.out.println("Todos los turistas pagaron " + "$" + gan + " CoP");
        System.out.println("El conductor paga al propietario " + "$" + prop + " CoP");

    }
}
