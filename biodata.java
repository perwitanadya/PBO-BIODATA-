import java.util.Scanner;

public class biodata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Siapa nama anda?: ");
        String nama = input.nextLine();

        System.out.print("Prodi anda?: ");
        String prodi = input.nextLine();

        System.out.print("Berapa umur anda?: ");
        int umur = input.nextInt();

        System.out.print("Anda Angkatan?: ");
        int angkatan = input.nextInt();

        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Umur: " + umur);
        System.out.println("Angkatan: " + angkatan);

        if (umur > 18) {
            System.out.println("Tergolong Dewasa");
        } else {
            System.out.println("Tergolong Muda");
        }

        if (umur > 22 && angkatan > 2025) {
            System.out.println("Anda Mahasiswa In Danger");
        } else {
            System.out.println("Anda Mahasiswa Aman");
        }

        input.close();
    }
}