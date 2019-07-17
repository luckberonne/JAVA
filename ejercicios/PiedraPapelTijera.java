package ejercicios;

import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {
	private static Scanner teclado;
	private static int menue = 0;
	public static int opcione = 0;
	public static String elecciones1 = "";
	public static String elecciones2 = "";
	public static int eleccione1 = 0;
	public static int eleccione2 = 0;
	public static String jugadore1 = "";
	public static String jugadore2 = "";

	
	
	
	public static void limpiar(int lineas) {
		for (int i = 0; i < lineas; i++) {
			System.out.println("");
		}
	}
	
	static String reconvertir(int eleccione2) {
		if (1==eleccione2) {
			elecciones2 = "Piedra";
		}
		if (2==eleccione2) {
			elecciones2 = "Papel";
		}
		if (3==eleccione2) {
			elecciones2 = "Tijera";
		}
		return elecciones2;
	}

	static void convertir1(String elecciones1) {
		if ("PIEDRA".equals(elecciones1)) {
			eleccione1 = 1;
		}
		if ("PAPEL".equals(elecciones1)) {
			eleccione1 = 2;
		}
		if ("TIJERA".equals(elecciones1)) {
			eleccione1 = 3;
		}
	}

	static void convertir2(String elecciones2) {
		if ("PIEDRA".equals(elecciones2)) {
			eleccione2 = 1;
		}
		if ("PAPEL".equals(elecciones2)) {
			eleccione2 = 2;
		}
		if ("TIJERA".equals(elecciones2)) {
			eleccione2 = 3;
		}
	}

	static void calcularGanador(int eleccione1, int eleccione2) {
		System.out.println("");
		if (eleccione1 == eleccione2) {
			System.out.println("Empataron " + jugadore1 + " Y " + jugadore2);
		} else {
			switch (eleccione1) {
			case 1:
				switch (eleccione2) {
				case 2:
					System.out.println("Perdio " + jugadore1 + " y Gano " + jugadore2);
					break;
				case 3:
					System.out.println("Gano " + jugadore1 + " y Perdio " + jugadore2);
					break;
				}
				break;
			case 2:
				switch (eleccione2) {
				case 1:
					System.out.println("Gano " + jugadore1 + " y Perdio " + jugadore2);
					break;
				case 3:
					System.out.println("Perdio " + jugadore1 + " y Gano " + jugadore2);
					break;
				}
				break;
			case 3:
				switch (eleccione2) {
				case 1:
					System.out.println("Perdio " + jugadore1 + " y Gano " + jugadore2);
					break;
				case 2:
					System.out.println("Gano " + jugadore1 + " y Perdio " + jugadore2);
					break; 
				}
				break;

			}
		}
	}

	public static void main(String[] ar) {
		
		Random random = new Random();
		teclado = new Scanner(System.in);
		
		while (menue != 1) {
		
			System.out.println("1- JUGAR!!!");
			System.out.println("2- Instrucciones");
			System.out.println("3- Salir");
			menue = teclado.nextInt();
			
			switch (menue) {
			case 1:
				System.out.println("1- Contra CPU");
				System.out.println("2- Contra otro Jugadore");
				opcione = teclado.nextInt();
			
				switch (opcione) {
				case 1:
					System.out.println("Ingrese su nombre: ");
					jugadore1 = teclado.next();
					jugadore1 = jugadore1.toUpperCase();
					jugadore2 = "CPU";

					System.out.println("Ingrese su Elección " + jugadore1
							+ ": ");

					elecciones1 = teclado.next();
					elecciones1 = elecciones1.toUpperCase();

					convertir1(elecciones1);
					
					System.out.println("");
					eleccione2 = random.nextInt(3) + 1;
					System.out.println(jugadore2 + " elige " + reconvertir(eleccione2));

					calcularGanador(eleccione1, eleccione2);
					break;
				case 2:
					System.out.println("Ingrese el nombre del jugadore 1: ");
					jugadore1 = teclado.next();
					jugadore1 = jugadore1.toUpperCase();

					System.out.println("Ingrese su Elección " + jugadore1
							+ ": ");

					elecciones1 = teclado.next();
					elecciones1 = elecciones1.toUpperCase();

					convertir1(elecciones1);

					limpiar(20);

					System.out.println("Ingrese el nombre del jugadore 2: ");
					jugadore2 = teclado.next();
					jugadore2 = jugadore2.toUpperCase();

					System.out.println("Ingrese su Elección " + jugadore2
							+ ": ");

					elecciones2 = teclado.next();
					elecciones2 = elecciones2.toUpperCase();

					convertir2(elecciones2);
					
					
					limpiar(20);


					calcularGanador(eleccione1, eleccione2);
					
					break;
				}
				break;
			case 2:
				System.out.println("La piedra aplasta la tijera. (Gana la piedra.)");
                                System.out.println("La tijera corta el papel. (Gana la tijera.)");
                                System.out.println("El papel envuelve la piedra. (Gana el papel.)");
    			System.out.println("");
    			System.out.println("");

				break;
			case 3:
				System.out.println("Saliendo");
				System.exit(0);
			}
		}
	}
}
