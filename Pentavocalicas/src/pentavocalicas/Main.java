package pentavocalicas;

import java.util.Scanner;

// https://www.aceptaelreto.com/problem/statement.php?id=300&cat=27

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Casos de prueba");
		final int CASOS_PRUEBA = sc.nextInt();
		
		String[] palabras = new String[CASOS_PRUEBA+1];
		String palabra;
		int cont = 0;
	
		while(cont < CASOS_PRUEBA+1) {
			palabra = sc.nextLine();
			palabras[cont] = palabra;
			cont++;
		}
	
		for(int i = 0; i < palabras.length; i++) {
			if(palabras[i].length() < 30 && !palabras[i].contains("e") && palabras[i].equals(palabras[i].toLowerCase())) {
				if(palabras[i].contains("a") && palabras[i].contains("e") && palabras[i].contains("i") && palabras[i].contains("o") && palabras[i].contains("u")) {
					System.out.println(palabras[i] + "SI");
				}
				else{
					System.out.println(palabras[i] + "NO");
				}
			}
			else {
				System.out.println("Existe al menos una palabra que tiene   más de 30 letras de la a a la z (todas minúsculas, sin tilde y excluída la letra ñ).");
			}
		}
		sc.close();
		
	}

}
