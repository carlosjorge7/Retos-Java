package generadorContraseñas;

import java.util.Random; 
import java.util.Scanner; 

public class GenCont {

	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in); //Crear un nuevo objeto de la clase Scanner
	 
		 int largo, seleccion; //inicializar las variables para la selección y el largo de la contraseña
	
		 System.out.println("Hola y bienvenido");
		 System.out.println("Por favor ingrese el largo de la contraseña y a continuación presione Enter:");
		 largo = s.nextInt(); //Selección del largo
		 System.out.println("Por favor haga una selección: \n1. Solamente números \n2. Solamente letras \n3. Alfanúmerico");
		 seleccion = s.nextInt(); //Selección de la clase de contraseña
		 System.out.println(creacont(seleccion, largo)); // Llamada del método para la generación de la contraseña
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
		  return cont.nextInt(limitea)+limiteb; //Creación de un número aleatorio
	 }
	 
	 private static char intercambionumero(int numero){ //Genera letras y números a partir de los números transmitidos
		  String s = "abcdefghijklmnopqrstuvwxyz0123456789"; //Definir las/los posibles letras/números
		  char[] c = s.toCharArray(); //Convertir el String en Char para que pueda abordar a las letras individualmente
		  return c[numero]; //Distribuye la letra respectiva
	 }
}