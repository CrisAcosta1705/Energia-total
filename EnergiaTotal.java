package EnergiaTotal;
import java.util.Scanner;
public class EnergiaTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tc = new Scanner(System.in);
		
		double m; // masa en kg
		double v; // velocidad en m/s
		double h; // altura en metros
		double g; // constante de gravedad en m/s^2

		System.out.println("Ingrese el valor de la Masa");
		m = tc.nextInt();
		
		System.out.println("Ingrese el valor de la Velocidad");
		v = tc.nextInt();
		
		System.out.println("Ingrese el valor de la Altura");
		h = tc.nextInt();
		
		System.out.println("Ingrese el valor de la Gravedad");
		g = tc.nextInt();
		
		double ET = m/2 * (v*v + 2*g*h);

		System.out.println("La energía total del cuerpo es: " + ET + "J");
	}

}
