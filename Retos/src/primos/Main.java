package primos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	
        Scanner sc = new Scanner(System.in);
        
        //Cardinal[] cardinales = new Cardinal[10];
        int[] primeraMuestra = new int[10];
        int pm = 0;
        
        ArrayList<Integer> list1 = getIntervalPrimos(0, 100);
        System.out.println(list1 + "Cardinal:" + cardinal(list1));
        primeraMuestra[pm] = cardinal(list1);
        pm++;
        
        ArrayList<Integer> list2 = getIntervalPrimos(100, 200);
        System.out.println(list2 + "Cardinal:" + cardinal(list2));
        primeraMuestra[pm] = cardinal(list2);
        pm++;
        
        ArrayList<Integer> list3 = getIntervalPrimos(200, 300);
        System.out.println(list3 + "Cardinal:" + cardinal(list3));
        primeraMuestra[pm] = cardinal(list3);
        pm++;
        
        ArrayList<Integer> list4 = getIntervalPrimos(300, 400);
        System.out.println(list4 + "Cardinal:" + cardinal(list4));
        primeraMuestra[pm] = cardinal(list4);
        pm++;
        
        ArrayList<Integer> list5 = getIntervalPrimos(400, 500);
        System.out.println(list5 + "Cardinal:" + cardinal(list5));
        primeraMuestra[pm] = cardinal(list5);
        pm++;
        
        ArrayList<Integer> list6 = getIntervalPrimos(500, 600);
        System.out.println(list6 + "Cardinal:" + cardinal(list6));
        primeraMuestra[pm] = cardinal(list6);
        pm++;
        
        ArrayList<Integer> list7 = getIntervalPrimos(600, 700);
        System.out.println(list7 + "Cardinal:" + cardinal(list7));
        primeraMuestra[pm] = cardinal(list7);
        pm++;
        
        
        ArrayList<Integer> list8 = getIntervalPrimos(700, 800);
        System.out.println(list8 + "Cardinal:" + cardinal(list8));
        primeraMuestra[pm] = cardinal(list8);
        pm++;
        
        
        ArrayList<Integer> list9 = getIntervalPrimos(800, 900);
        System.out.println(list9 + "Cardinal:" + cardinal(list9));
        primeraMuestra[pm] = cardinal(list9);
        pm++;
        
        ArrayList<Integer> list10 = getIntervalPrimos(900, 1000);
        System.out.println(list10 + "Cardinal:" + cardinal(list10));
        primeraMuestra[pm] = cardinal(list10);
        pm++;
        
        System.out.println("Cardinales muestra 1");
        for(int p: primeraMuestra) {
        	System.out.print(p + ", ");
        }
        System.out.println();
        
        // 
        //Cardinal[] cardinales = new Cardinal[10];
        int[] segundaMuestra = new int[10];
        int sm = 0;
        
        ArrayList<Integer> list11 = getIntervalPrimos(1000, 1100);
        System.out.println(list11 + "Cardinal:" + cardinal(list11));
        segundaMuestra[sm] = cardinal(list11);
        sm++;
        
        ArrayList<Integer> list12 = getIntervalPrimos(1100, 1200);
        System.out.println(list12 + "Cardinal:" + cardinal(list12));
        segundaMuestra[sm] = cardinal(list12);
        sm++;
        
        ArrayList<Integer> list13 = getIntervalPrimos(1200, 1300);
        System.out.println(list13 + "Cardinal:" + cardinal(list13));
        segundaMuestra[sm] = cardinal(list13);
        sm++;
        
        ArrayList<Integer> list14 = getIntervalPrimos(1300, 1400);
        System.out.println(list14 + "Cardinal:" + cardinal(list14));
        segundaMuestra[sm] = cardinal(list14);
        sm++;
        
        ArrayList<Integer> list15 = getIntervalPrimos(1400, 1500);
        System.out.println(list15 + "Cardinal:" + cardinal(list15));
        segundaMuestra[sm] = cardinal(list15);
        sm++;
        
        ArrayList<Integer> list16 = getIntervalPrimos(1500, 1600);
        System.out.println(list16 + "Cardinal:" + cardinal(list16));
        segundaMuestra[sm] = cardinal(list16);
        sm++;
        
        ArrayList<Integer> list17 = getIntervalPrimos(1600, 1700);
        System.out.println(list17 + "Cardinal:" + cardinal(list17));
        segundaMuestra[sm] = cardinal(list17);
        sm++;
        
        
        ArrayList<Integer> list18 = getIntervalPrimos(1700, 1800);
        System.out.println(list18 + "Cardinal:" + cardinal(list18));
        segundaMuestra[sm] = cardinal(list18);
        sm++;
        
        
        ArrayList<Integer> list19 = getIntervalPrimos(1800, 1900);
        System.out.println(list19 + "Cardinal:" + cardinal(list19));
        segundaMuestra[sm] = cardinal(list19);
        sm++;
        
        ArrayList<Integer> list20 = getIntervalPrimos(1900, 2000);
        System.out.println(list20 + "Cardinal:" + cardinal(list20));
        segundaMuestra[sm] = cardinal(list20);
        sm++;
        
        System.out.println("Cardinales muestra 2");
        for(int p: segundaMuestra) {
        	System.out.print(p + ", ");
        }
        
        
        sc.close();
    }
    
    private static ArrayList<Integer> getIntervalPrimos(int inicio, int fin) {
    	ArrayList<Integer> aPrimos = new ArrayList<>();
    	for (int primo = inicio; primo <= fin; primo++){
            int contDiv = 0;
            for (int d = 1; d <= primo; d++){
                if(primo % d == 0){
                    contDiv++;
                }
            }
            if(contDiv == 2 || contDiv == 1){
                aPrimos.add(primo);
            }        
        }
    	return aPrimos;
    }
    
    private static int cardinal(ArrayList<Integer> aList) {
    	return aList.size();
    }
    
    
    
    
}