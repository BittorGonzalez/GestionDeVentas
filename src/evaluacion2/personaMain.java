package evaluacion2;

import java.util.Scanner;

public class personaMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		persona p1 = new persona();
		fecha f1 = new fecha(3,6,2032);
		
		persona p3 = new persona("67584F", "Avelino", "Ramirez", f1);
		
		System.out.println(p3);
		
		fecha f2 = new fecha(4,6,2003);
		
		p3.setFechanacimiento(f2);
		
		System.out.println(p3);
		
		System.out.println(p3.getDni());
		
		System.out.println(p1);

	
		
		p1.leer(sc);
		
		System.out.println(p1);
	}

}
