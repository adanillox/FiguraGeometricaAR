/**
 * 
 */
package FiguraG;

/**
 * @author Adan
 *
 */
import java.util.Scanner;
public class Figura {
private static Scanner teclado;
public static void main(String[] args) {
/* Queremos averiguar si la figura introducida es un cuadrado o un rectángulo
* y mostrar su perímetro.
*/
int base, altura;
String figura;
teclado = new Scanner(System.in);
System.out.print("Introduce la base de la figura: ");
base = teclado.nextInt();
System.out.print("Introduce la altura de la figura: ");
altura = teclado.nextInt();
tipoF.tipoFigura(base, altura);
}
/**
 * @param base
 * @param altura
 * @deprecated Use {@link tipoF#tipoFigura(int,int)} instead
 */
public static void tipoFigura(int base, int altura) {
	tipoF.tipoFigura(base, altura);
}
}
