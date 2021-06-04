package descendente;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(ordenar(1234456));
	}
	
	public static int ordenar(final int num) {
		String strNum = num + "";
		char[] digitos = new char[strNum.length()];
		for(int i = 0; i < strNum.length(); i++) {
			digitos[i] = strNum.charAt(i);
		}
		char c;
		for(int i = 0; i < digitos.length; i++) {
			for(int j = 0; j < digitos.length - 1; j++) {
				if(digitos[j] < digitos[j+1]) {
					c = digitos[j];
					digitos[j] = digitos[j+1];
					digitos[j+1] = c;
				}
			}
		}
		strNum = String.valueOf(digitos);
		return Integer.parseInt(strNum);
	}
}
