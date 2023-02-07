package evaluacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListEmpleadosOrdenadoSalario {

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
		
	
				
		Collections.sort(arrayListEmpleado, new Comparator<empleado>() {
			
		

			@Override
			public int compare(empleado e1, empleado e2) {
				
				int comparacion;
				Double s1 = e1.getSalario();
				Double s2 = e2.getSalario();
				comparacion = s1.compareTo(s2);
				if(comparacion == 0) {
					comparacion = e1.compareTo(e2);
				}
				
				return comparacion;
			}
		});
				
				
				

			

			
	
		for(empleado em:arrayListEmpleado) {
			
			System.out.println(em);
		}
	}

}
