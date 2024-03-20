package org.example;

import java.util.ArrayList;
import java.util.Scanner;

class Admin {
    public static void loginAsAdmin(ArrayList<Student> students) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Admin Menu =====");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Tampilkan Mahasiswa Terdaftar");
        System.out.println("3. Keluar");
        System.out.print("Pilih opsi (1-3): ");
        int userInput = scanner.nextInt();

        switch (userInput) {
            case 1:
                addStudent(students);
                break;
            case 2:
                displayRegisteredStudents(students);
                break;
            case 3:
                System.out.println("Keluar dari akun admin...");
                break;
            default:
                System.out.println("Input tidak valid. Silakan coba lagi.");
        }

        scanner.close(); // Menutup objek Scanner setelah selesai menggunakan
    }

    public static void addStudent(ArrayList<Student> students) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nama mahasiswa: ");
            String name = scanner.nextLine();
            System.out.print("Masukkan fakultas mahasiswa: ");
            String faculty = scanner.nextLine();
            System.out.print("Masukkan NIM mahasiswa: ");
            String nim = scanner.nextLine();
            System.out.print("Masukkan program studi mahasiswa: ");
            String program = scanner.nextLine();

            students.add(new Student(name, faculty, nim, program));
        }
        System.out.println("Mahasiswa berhasil ditambahkan!");
    }

    public static void displayRegisteredStudents(ArrayList<Student> students) {
        System.out.println("\n===== Mahasiswa Terdaftar =====");
        System.out.printf("%-20s %-20s %-15s %-20s\n", "Nama", "Fakultas", "NIM", "Program Studi");
        for (Student student : students) {
            System.out.printf("%-20s %-20s %-15s %-20s\n", student.getName(), student.getFaculty(), student.getNim(), student.getProgram());
        }
    }
}

class Book {
    private String id;
    private String title;
    private String author;
    private String category;
    private int stock;

    public Book(String id, String title, String author, String category, int stock) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}