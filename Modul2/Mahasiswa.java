package Modul2;

import java.lang.String;
import java.util.Scanner;

public class Mahasiswa {
    public String nama, jurusan, nim;
    static String tampiluniversitas() {
        return "Universitas Muhammadiyah Malang\n";
    }

    public void inputdata(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Mahasiswa: ");
        nama = input.nextLine();
        System.out.print("Masukkan jurusan Mahasiswa: ");
        jurusan = input.nextLine();

        int loop = 0;
        while(loop == 0){

            System.out.print("Masukkan NIM Mahasiswa: ");
            nim = input.nextLine();

            if (nim.length() !=  15) {
                System.out.println("\nNIM harus 15 Digit!\n");

            } else {

                System.out.print("\nData Mahasiswa berhasil ditambahkan\n");
                loop = 1;
            }
        }
    }
    public String tampildatamahasiswa() {
        return "Nama: " + nama + "\nJurusan:" + jurusan + "\nNIM: " + nim+"\n";
    }
}
