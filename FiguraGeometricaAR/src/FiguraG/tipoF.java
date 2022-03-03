/**
 * 
 */
package FiguraG;

/**
 * @author Adan
 *
 */
public class tipoF {

	/**
	 * @param base
	 * @param altura
	 */
	public static void tipoFigura(int base, int altura) {
		String figura;
		if (base==altura) {
		figura="cuadrado";
		}else
		{figura="rectángulo";
		}
		int perimetro = 2 * base + 2 * altura;
		System.out.println("La figura es un "+ figura + " y su perímetro es: " + perimetro);
	}

}
