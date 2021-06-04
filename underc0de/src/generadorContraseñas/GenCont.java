package generadorContrase�as;

import java.util.Random; 
import java.util.Scanner; 

public class GenCont {

	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in); //Crear un nuevo objeto de la clase Scanner
	 
		 int largo, seleccion; //inicializar las variables para la selecci�n y el largo de la contrase�a
	
		 System.out.println("Hola y bienvenido");
		 System.out.println("Por favor ingrese el largo de la contrase�a y a continuaci�n presione Enter:");
		 largo = s.nextInt(); //Selecci�n del largo
		 System.out.println("Por favor haga una selecci�n: \n1. Solamente n�meros \n2. Solamente letras \n3. Alfan�merico");
		 seleccion = s.nextInt(); //Selecci�n de la clase de contrase�a
		 System.out.println(creacont(seleccion, largo)); // Llamada del m�todo para la generaci�n de la contrase�a
	 }
	 
	 private static char[] creacont(int seleccion, int largo) {
		 char[] cont = new char[largo];
		  
		 int contador = 0;
		  
		 switch (seleccion) {
		  
		   case 1: 
		    while (contador < largo) {
		     cont[contador] = intercambionumero(numeroaleatorio(10, 26));
		     contador++;
		    }
		    break;
		  
		   case 2:
		    while (contador < largo) {
		     cont[contador] = intercambionumero(numeroaleatorio(26, 0));
		     contador++;
		    }
		    break;
		  
		   case 3:
		    while (contador<largo) {
		     cont[contador] = intercambionumero(numeroaleatorio(36, 0));
		     contador++;
		    }
		    break;
		 }
		 return cont;
	 }
	 
	 private static int numeroaleatorio(int limitea, int limiteb) {
		  Random cont = new Random();
		  return cont.nextInt(limitea)+limiteb; //Creaci�n de un n�mero aleatorio
	 }
	 
	 private static char intercambionumero(int numero){ //Genera letras y n�meros a partir de los n�meros transmitidos
		  String s = "abcdefghijklmnopqrstuvwxyz0123456789"; //Definir las/los posibles letras/n�meros
		  char[] c = s.toCharArray(); //Convertir el String en Char para que pueda abordar a las letras individualmente
		  return c[numero]; //Distribuye la letra respectiva
	 }
}