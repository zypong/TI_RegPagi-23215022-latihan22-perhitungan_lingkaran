/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;
import java.util.Scanner;
/**
 *NAMA  : IMZY ZULIJAR SETIAWAN
 *NIM   : 23215022
 *PRODI : TEKNIK INFORMATIKA
 * 
 * progam ini untuk mnghitung luas,keliling,diameter dan jari2 lingkaran
 */
public class perhitungan_lingakaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("======Perhitungan Lingkaran=====");
            System.out.print("Masukkan nilai diameter lingkaran: ");
            String diameterInput = input.nextLine();

            try {
                double diameter = Double.parseDouble(diameterInput);
                if (diameter <= 0) {
                    System.out.println("Nilai Diameter Tidak Sesuai");
                    continue;
                }

                double jariJari = diameter / 2;
                double luas = Math.PI * Math.pow(jariJari, 2);
                double keliling = 2 * Math.PI * jariJari;

                System.out.println("======Hasil Perhitungan Lingkaran=====");
                System.out.println("Jari-jari Lingkaran = " + jariJari + " cm");
                System.out.println("Luas Lingkaran = " + luas + " cm");
                System.out.println("Keliling Lingkaran = " + keliling + " cm");
                System.out.println("BUILD SUCCESSFUL (total time:  seconds)");
                break; 
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diameter Tidak Sesuai");
            }
        }
        input.close();
    }
}
