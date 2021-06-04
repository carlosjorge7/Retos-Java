package aceptaElReto;

import java.util.Scanner;

// https://www.aceptaelreto.com/problem/statement.php?id=151&cat=14

public class Identidad {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Tamaño de la matriz");
		int filas = sc.nextInt();
		int[][] matriz = new int[filas][filas];
		
		cargarMatriz(matriz);
		if(esIdentidad(matriz)) {
			imprimirMatriz(matriz);
			System.out.println("Identidad");
		}
		else {
			imprimirMatriz(matriz);
			System.out.println("No es identidad");
		}
		
		while(filas != 0) {
			System.out.println("Tamaño de la matriz");
			filas = sc.nextInt();
			matriz = new int[filas][filas];
			
			cargarMatriz(matriz);
			if(esIdentidad(matriz)) {
				imprimirMatriz(matriz);
				System.out.println("Identidad");
			}
			else {
				imprimirMatriz(matriz);
				System.out.println("No es identidad");
			}
		}
		System.out.println("Fin");
		
	}
	
	private static void cargarMatriz(int[][] matriz) {
		System.out.println("Datos de la matriz");
		// Cargamos la matriz
		for(int i = 0; i < matriz.length; i++) {
			for( int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
	}
	
	private static void imprimirMatriz(int[][] matriz) {
		for(int i = 0; i < matriz.length; i++) {
			for( int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
	}
	
	private static boolean esIdentidad(int[][] matriz) {
		boolean identidad = true;
		for(int i = 0; i < matriz.length; i++) {
			for( int j = 0; j < matriz[0].length; j++) {
				if(i == j) {
					if(matriz[i][j] != 1) {
						 identidad = false;
					}
				}
				else {
					if(matriz[i][j] != 0) {
						identidad = false;
					}
				}
			}
		}
		return identidad;
	}

}
