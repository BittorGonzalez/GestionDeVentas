package evaluacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEmpleadosOrdenado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		ArrayList<empleado> arrayListEmpleado = new ArrayList<>();
		
		
		empleado e = new empleado();
		
		char continuar;
		do {
			System.out.println("***Introduce un nuevo empleado***");
			e.leer(sc);
			arrayListEmpleado.add(new empleado(e));
			sc.nextLine();
			System.out.println("Quieres continuar (s/n)");
			continuar = sc.nextLine().toLowerCase().charAt(0);
		}while(continuar == 's');
		
		Collections.sort(arrayListEmpleado);

		for(empleado em:arrayListEmpleado) {
			
			System.out.println(em);
		}
	}

}
