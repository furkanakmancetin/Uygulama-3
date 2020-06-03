
package finaluyg2;

import java.util.Scanner;

public class Islem extends carpmaIslemi
{
    public static void main(String[] args) 
    {
        Scanner girdi=new Scanner (System.in);
        Islem carpma=new Islem();
        
        System.out.print("Lütfen ilk sayıyı giriniz..:");
        int a=girdi.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz..:");
        int b=girdi.nextInt();
        
        System.out.print("Sonuç..:");
        carpma.carpma(a, b);
    }
}
