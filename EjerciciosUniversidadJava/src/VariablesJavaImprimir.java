import java.util.Scanner;

public class VariablesJavaImprimir {

	public static void main(String args[]) {

		System.out.println("Proporciona los siguientes datos");
		System.out.println("Proporciona el titulo:");
		Scanner datos = new Scanner(System.in);
		System.out.println("hola");
		var titulo = datos.nextLine();
		System.out.println("Proporciona el autor:");
		var autor = datos.nextLine();

		System.out.println(titulo + " fue escrito por " + autor);
	}

}
