import java.util.Scanner;

/*
 *Programa para visualizar en pantalla el resultado 
 * de la suma y la resta de dos números.
 */
public class Main {

	public static void main (String args[]) {

		int numero1, numero2, resultadoSuma, resultadoResta, resultadoDivision, resultadoMultiplicacion;
		Arithmetic operaciones = new Arithmetic(); // Crear una instancia/objeto de la clase -operaciones(variable)-
		
		Scanner sc = new Scanner(System.in); // Objeto sc
		System.out.print("\ningresa un número: ");
		numero1 = sc.nextInt();

		System.out.print("ingresa otro número: ");
		numero2 = sc.nextInt();

		resultadoSuma = operaciones.sum(numero1, numero2);
		resultadoResta = operaciones.rest(numero1, numero2);
		resultadoDivision = operaciones.div(numero1, numero2);
		resultadoMultiplicacion = operaciones.multiply(numero1, numero2);

		System.out.println("\nEl resultado de la SUMA es: " + resultadoSuma);
		System.out.println("\nEl resultado de la RESTA es: " + resultadoResta);
		System.out.println("\nEl resultado de la DIVISION es: " + resultadoDivision);
		System.out.println("\nEl resultado de la MULTIPLICACION es: " + resultadoMultiplicacion);
	
		System.out.println("\n\nEGUN ONA IZAN!!\n");
	}
}
