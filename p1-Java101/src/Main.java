import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, alfa;
        double pi = 3.14, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        r = input.nextInt();

        System.out.print("Açıyı giriniz: ");
        alfa = input.nextInt();

        alan = pi * r * r * alfa / 360;

        System.out.println("Dairenin alanı : " + alan);
    }
}
