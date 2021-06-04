package camelcase;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(toCamelCase("the-stealth-warrior"));
		System.out.println(toCamelCase("The_Stealth_Warrior"));
	}
	
	private static String toCamelCase(String s){
		StringBuilder item = new StringBuilder();
	    for(int i = 0; i < s.length(); i++){
	      if(s.charAt(i) == '-' || s.charAt(i) == '_'){
	    	  if(Character.toString(s.charAt(i+1)).toUpperCase() != Character.toString(s.charAt(i+1))) {
	    		  item.append(Character.toString(s.charAt(i+1)).toUpperCase());
	    	  }
	    	  item.append("");
	      }
	      else{
	    	  item.append(s.charAt(i));
	      }
	    }
	    return item.toString();
	 }

}
