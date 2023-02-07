package evaluacion2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListCadenasMenu {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		ArrayList<String> arrayStrings = new ArrayList<String>();
		int opc;
		boolean salir = false;
		String s;
		
		
	
		do {
			System.out.println("***MENU***");
			System.out.println("1-Añadir String");
			System.out.println("2-Buscar String");
			System.out.println("3-Borrar String");
			System.out.println("4-Listar String");
			System.out.println("5-Salir");
				
			opc = sc.nextInt();
			
			System.out.println();

			switch(opc) {
			case 1:
				
				 sc.nextLine();
				System.out.println("***1-Añadir String***");
				System.out.println("Introduce un string");
				s = sc.nextLine();
				arrayStrings.add(s);
				System.out.println("***Añadido con exito***");
			
				System.out.println();

				break;
			case 2:
			
				 sc.nextLine();
				System.out.println("***2-Buscar String***");
				System.out.println("Introduce un string");
				s = sc.nextLine();
				int posicion = arrayStrings.indexOf(s);
				if(posicion >=0) {
					System.out.println("El string " + s + " se encuentra en la posicion " + posicion );
				}else {
					System.out.println("El string no se encuentra en el array");

				}
				
				System.out.println();

				 break;
			case 3:
				 sc.nextLine();

				System.out.println("***3-Borrar String***");
				System.out.println("Introduce un string");
				s = sc.nextLine();
				if(arrayStrings.remove(s)) {
					System.out.println("El string " + s + " ha sido borrado");
				}else {
					System.out.println("El string " + s + "no se ha podido borrar");
				}
				
				System.out.println();

				
				break;
			case 4:
				 sc.nextLine();

				System.out.println("***4-Listar String***");
				for(String st:arrayStrings) {
					System.out.print(st + ",");
				}
				
				System.out.println();
				System.out.println();


				break;
			case 5:
				System.out.println("Saliendo...");
				System.exit(0);
				
			
		}
		}while(opc != 5);
		


		
		
	}

}
