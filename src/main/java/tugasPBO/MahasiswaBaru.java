/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPBO;

/**
 *
 * @author kuraohikari
 */
class MahasiswaBaru extends Mahasiswa {
    @Override
    public void isiBiodata(String nama, int nilai) {
        System.out.println("nama: " + nama + ", nilai: " + nilai + ", pilihan jurusan: IF, asal sekolah: Primakara University");
    }

    public static void main(String[] args) {
        MahasiswaBaru mahasiswaBaru = new MahasiswaBaru();

        mahasiswaBaru.nama = "ahmad";
        mahasiswaBaru.nilai = 80;

        mahasiswaBaru.isiBiodata(mahasiswaBaru.nama, mahasiswaBaru.nilai);
        mahasiswaBaru.registrasi();
        mahasiswaBaru.testMasuk();
    }
}
