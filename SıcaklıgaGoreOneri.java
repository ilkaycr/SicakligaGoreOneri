package KosulluIfadeler;

import java.util.Scanner;

public class SıcaklıgaGoreOneri {
    public static void main(String[] args) {

        int sicaklik;

        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık değerini giriniz : ");
        sicaklik = input.nextInt();

        if (sicaklik<5){
            System.out.println("Kayak Yapabilirsiniz");
        }
        else if (5<= sicaklik && sicaklik <=15) {
            System.out.println("Sinemaya gidebilirsiniz");
        }
        else if (15 < sicaklik && sicaklik <=25 ) {
            System.out.println("Piknik yapabilirsiniz");
        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
}
