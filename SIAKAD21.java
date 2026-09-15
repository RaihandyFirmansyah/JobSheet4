import java.util.Scanner;

public class SIAKAD21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        int nim = sc.nextInt();
        System.out.print("Masukkan kelas: ");
        String kelas = sc.next();
        System.out.print("Masukkan nomor absen: ");
        int absen = sc.nextInt();

        System.out.print("Masukkan nilai kuis: ");
        double kuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        double tugas = sc.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        double ujian = sc.nextDouble();

        double bobotKuis = 0.30;
        double bobotUjian = 0.30;
        double bobotTugas = 0.40;

        double nilaiAkhir = (kuis * bobotKuis) + (ujian * bobotUjian) + (tugas * bobotTugas);

        String huruf;
        String kualifikasi;

        if (nilaiAkhir > 80) {
            huruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73) {
            huruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir > 65) {
            huruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60) {
            huruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir > 50) {
            huruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39) {
            huruf = "D";
            kualifikasi = "Kurang";
        } else {
            huruf = "E";
            kualifikasi = "Gagal";
        }

        System.out.println(
        "Mahasiswa dengan nama " + nama + " (NIM " + nim + ") kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai kuis (30%): " + (kuis * bobotKuis));
        System.out.println("Nilai ujian (30%): " + (ujian * bobotUjian));
        System.out.println("Nilai tugas (40%): " + (tugas * bobotTugas));
        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + huruf);
        System.out.println("Kualifikasi: " + kualifikasi);

        sc.close();
    }
}