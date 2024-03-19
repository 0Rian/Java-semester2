import java.util.Scanner;

public class codelap1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama, jeniskelamin;
        int tahunlahir,tahunsekarang;

        System.out.print("Nama                           : ");
        nama = input.nextLine();
        System.out.print("Jenis Kelamin (L/p)            : ");
        jeniskelamin = input.nextLine();

        System.out.println("Tanggal Lahir                : ");
        tahunlahir = input.nextInt();
        System.out.println("Tanggal Sekarang             : ");
        tahunsekarang = input.nextInt();

        System.out.println("===================================");
        System.out.println("Nama               :"+nama);
        System.out.println("Jenis Kelamin      :"+jeniskelamin);
        System.out.println("Umur               :"+(tahunsekarang-tahunlahir));


    }
}
