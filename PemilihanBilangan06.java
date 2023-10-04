import java.util.Scanner;
 
public class PemilihanBilangan06 {

    public static void main(String[] args){
        Scanner input06 = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = input06.nextInt();

        String hasil;
        hasil = (angka > 0.0 ) ? "Bilangan Positif" : "Bilangan Negatif";
        System.out.println(angka+ " adalah " + hasil );
    }


}