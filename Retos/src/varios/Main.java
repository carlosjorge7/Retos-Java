package varios;

public class Main {

	public static void main(String[] args) {
		System.out.println(findUniq(new double[]{ 7, 1, 1, 1, 1, 1 })); // => 2
		System.out.println(findUniq(new double[]{ 1, 1, 1, 2, 1, 1 })); // => 2
		System.out.println(findUniq(new double[]{ 0, 0, 0.55, 0, 0 })); // => 0.55
		
		System.out.println(solution("abc", "bc")); // true
		System.out.println(solution("Hola mundo", "do")); // true
		System.out.println(solution("Hola mundo", "xx")); // true
		System.out.println(solution("abc", "c")); // returns false);
	}
	
	public static double findUniq(double arr[]) {
		double d = 0;
		for(int i = 1; i < arr.length; i++) {
			if(arr[0] != arr[i]) {
				d = arr[i];
			}
		}
		return d;
    }
	
	public static boolean solution(String str, String ending) {
		String strFinal = str.substring(str.length() - ending.length(), str.length());
		return strFinal.equals(ending);
	}
	
	
	
	
}
