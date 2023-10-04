import java.util.Scanner;

public class PemilihanOperator06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil = 0;
        char operator;

        angka1 = sc.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angka2 = sc.nextDouble();
        System.out.print("Masukkan operator (+ - * /): ");
        operator = sc.next().charAt(0);


        if (operator == '+' ) {
            hasil = angka1 + angka2;
            System.out.println(angka1+ "+" +angka2+" = " +hasil);
        } else if (operator == '-' ){
            hasil = angka1 - angka2;
            System.out.println(angka1+ "*" +angka2+" = " +hasil);
        } else if (operator == '*'){
            hasil = angka1 * angka2;
            System.out.println(angka1+ "*" +angka2+" = " +hasil);
        } else if (operator == '/'){
            hasil = angka1 / angka2;
            System.out.println(angka1+ "/" +angka2+ " = " +hasil);
        }
    }
}
