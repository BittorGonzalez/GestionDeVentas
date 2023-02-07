package evaluacion2;

import java.util.Scanner;

public class fecha implements Comparable<fecha>{


	// defino la clase Fecha
	// propiedades
	private int dia;
	private int mes;
	private int año;
	
	// constructor por defecto
	public fecha(){
		this.dia = 1;
		this.mes = 1;
		this.año = 2021;
	}
	// constructor copia
	public fecha(fecha f){
		this.dia = f.dia;
		this.mes = f.mes;
		this.año = f.año;
	}
	// constructores personalizados
	public fecha(int d,int m, int a){
		// compruebo el valor del dia
		if (d >= 1 && d <= 31) {
			// si es un dia valido
			this.dia = d;
		}
		else {
			// si NO es un dia valido
			// muestro un mensaje de Error
			System.out.println("El valor de dia NO es vñlido. Se ha puesto 1 como dia");
			// pongo 1 al dia
			this.dia = 1;
		}
		// compruebo el valor del mes
		if (m >= 1 && m <= 12) {
			// si es un mes valido
			this.mes = m;
		}
		else {
			// si NO es un mes valido
			// muestro un mensaje de Error
			System.out.println("El valor de mes NO es vñlido. Se ha puesto 1 como mes");
			// pongo 1 al mes
			this.mes = 1;
		}
		// compruebo el valor del año
		if (a != 0) {
			// si es un año valido
			this.año = a;
		}
		else {
			// si NO es un año valido
			// muestro un mensaje de Error
			System.out.println("El valor de año NO es vñlido. Se ha puesto 2021 como año");
			// pongo 2021 al año
			this.año = 2021;
		}
	}
	
	// Getters and Setters
	public int getDia() {
		return dia;
	}
	public void setDia(int d) {
		// compruebo el valor del dia
		if (d >= 1 && d <= 31) {
			// si es un dia valido
			this.dia = d;
		}
		else {
			// si NO es un dia valido
			// muestro un mensaje de Error
			System.out.println("El valor de dia NO es vñlido y NO se ha modificado");
		}
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int m) {
		// compruebo el valor del mes
		if (m >= 1 && m <= 12) {
			// si es un mes valido
			this.mes = m;
		}
		else {
			// si NO es un mes valido
			// muestro un mensaje de Error
			System.out.println("El valor de mes NO es vñlido y NO se ha modificado");
		}
	}
	public int getAño() {
		return año;
	}
	public void setAño(int a) {
		// compruebo el valor del año
		if (a != 0) {
			// si es un año valido
			this.año = a;
		}
		else {
			// si NO es un año valido
			// muestro un mensaje de Error
			System.out.println("El valor de año NO es vñlido y NO se ha modificado");
			}
	}
	// toString
	@Override
	public String toString() {
		return (dia + "/" + mes + "/" + año);
	}
	// hashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + año;
		result = prime * result + dia;
		result = prime * result + mes;
		return result;
	}
	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			// si es el mismo objeto
			return true;
		if (obj == null)
			// si obj no estñ creado
			return false;
		if (getClass() != obj.getClass())
			// si los objetos NO son de la misma clase
			return false;
		// comparo el valor de las Propiedades
		fecha other = (fecha) obj;
		if (año != other.año)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}
	
	// compareTo
	public int compareTo(fecha other) {
		// comparo el valor de las Propiedades
		if(this.año > other.año) {
			// si el año es mayor
			return (1);
		}
		else if (this.año < other.año) {
			// si el año es menor
			return (-1);
		}
		else {
			// si el año es igual
			if (this.mes > other.mes) {
				// si el mes es mayor
				return (1);
			}
			else if (this.mes < other.mes) {
				// si el mes es menor
				return (-1);
			}
			else {
				// el año y el mes son iguales
				if (this.dia > other.dia) {
					// si el dia es mayor
					return (1);
				}
				else if (this.dia < other.dia) {
					// si el dia es menor
					return (-1);
				}
			}
		}
		// si las fechas son iguales
		return 0;
	}
	
	//metodo leer
	public void leer(Scanner sc){
		// lee por teclado las propiedades
		// leo dia
		System.out.println("Dia: ");
		int d = sc.nextInt();
		while (d < 1 || d > 31) {
			System.out.println("El valor de dia NO es valido");
			System.out.println("Dia: ");
			d = sc.nextInt();
		}
		this.dia = d;
		
		// leo mes
		System.out.println("Mes: ");
		int m = sc.nextInt();
		while (m < 1 || m > 12) {
			System.out.println("El valor de mes NO es valido");
			System.out.println("Mes: ");
			m = sc.nextInt();
		}
		this.mes = m;
		
		// leo año
				System.out.println("Año: ");
				int a = sc.nextInt();
				while (a == 0) {
					System.out.println("El valor de año NO es valido");
					System.out.println("Año: ");
					a = sc.nextInt();
				}
				this.año = a;
		}
}
