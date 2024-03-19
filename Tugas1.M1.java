package org.Modul1;
import java.util.Scanner;


public class T1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Nim  ;
        String Username = "Admin";
        String Password = "Admin";

            System.out.println("===== LIBRARY SYSTEM =====");
            System.out.println("Daftar Pilihan :");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit ");
            System.out.print("Masukan Pilihan Anda(1-3):");

            int pilihan = input.nextInt();


            switch (pilihan) {
                case 1:
                    System.out.print("Masukan  Nim Anda:");
                    Nim = input.next();

                    if (Nim.length() == 15) {
                        System.out.println("Successful Login as Student");
                    } else {
                        System.out.println("User Not Found");
                    }
                    break;
                case 2:
                    System.out.print("Masukan Nama Anda: ");
                    Username = input.next();
                    System.out.print("\nMasukan Password Anda :\n");
                    Password = input.next();

                    if (Username.equals("Admin") && Password.equals("Admin")) {
                        System.out.println("Successful Login as Student");
                    } else {
                        System.out.println("User Not Found");
                    }

                    break;
                case 3:

                        System.out.print("Thanks for your time ");
                    break;

                default:
                    System.out.println("Pilihan Tidak Ditemukan ");


            }



    }
}







