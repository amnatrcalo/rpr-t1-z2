package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static int SumaCifara (int n){
        int suma=0;
        do{
            int zadnjacifra=n%10;
            suma+=zadnjacifra;
            n/=10;
        }while(n!=0);
        return suma;
    }

    public static void main(String[] args) {
	Scanner ulaz=new Scanner(System.in);
        System.out.println("Unesi broj n: ");
        int n=ulaz.nextInt();
        System.out.println("Brojevi djeljivi sa sumom svojih cifara su: ");
        for(int i=1; i<=n; i++){
            if(i%SumaCifara(i)==0) System.out.println(i);
        }
    }
}
