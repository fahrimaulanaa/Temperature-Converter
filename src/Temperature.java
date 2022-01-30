import java.util.Scanner;
public class Temperature {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Selamat Datang Di Converter Suhu Sederhana");

        //Input suhu awal, hanya dapat memasukkan bilangan bulat
        System.out.println("Masukkan Suhu: ");
        int val = sc.nextInt();
        System.out.println();

        //Input untuk menentukan mau di convert ke suhu apa
        System.out.println("Celcius ke Fahrenheit (Ketik 1)");
        System.out.println("Fahrenheit ke Celcius (Ketik 2)");
        System.out.println("Fahrenheit ke Kelvin (Ketik 3)");
        System.out.println("Kelvin ke Fahrenheit (Ketik 4)");
        System.out.println("Kelvin ke Celcius (Ketik 5)");
        System.out.println("Celcius ke Kelvin");
        int pilihan = sc.nextInt();

        //Switch case untuk menghitung
        switch (pilihan){
            case 1:
                System.out.print(val + " Celcius adalah ");
                System.out.println(val * 9/5 + 32 + " Fahrenheit");
                break;

            case 2:
                System.out.print(val + " Fahrenheit adalah ");
                System.out.println((val - 32) * 5/9 + " Celcius");
                break;

            case 3:
        }

    }
}
