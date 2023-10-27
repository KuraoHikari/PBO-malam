/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PraUTS;

/**
 *
 * @author kuraohikari
 */
public class MainAnime {

    public static void main(String[] args) {
        Protagonis protagonis = new Protagonis("Naruto Uzumaki", 17, "Laki-laki", "Naruto adalah seorang ninja dengan tujuan menjadi Hokage. Dia memiliki kemampuan Rasengan.", "Kunai, Shuriken", "Menjadi Hokage, Melindungi teman-temannya", "Rasengan");
        Antagonis antagonis = new Antagonis("Madara Uchiha", 47, "Laki-laki", "Madara adalah antagonis utama dalam cerita. Dia memiliki motif jahat untuk menguasai dunia.", "Sharingan, Susanoo", "Menguasai dunia shinobi", "Kalah Melawan Hashirama");
        Support pendukung = new Support("Sakura Haruno", 17, "Perempuan", "Sakura adalah seorang ninja medis yang mendukung Naruto. Dia hobi membaca buku.", "Ninja Medis", "Membaca buku, Merawat tanaman", "optimis, beban mc");
        UniqueCreature makhlukFantastis = new UniqueCreature("Kurama", 1000, "Tidak berlaku", "Kurama adalah makhluk rubah berekor sembilan yang menjadi mitos dalam cerita. Dia adalah Bijuu dari Naruto.", "Rubah berekor sembilan", "Kekuatan chakra yang luar biasa", "Alam semesta Naruto");

        System.out.println("Karakter Anime:");
        tampilkanKarakter(protagonis);
        tampilkanAbility(protagonis);

        tampilkanKarakter(antagonis);
        tampilkanAbility(antagonis);

        tampilkanKarakter(pendukung);
        tampilkanAbility(pendukung);

        tampilkanKarakter(makhlukFantastis);
        tampilkanAbility(makhlukFantastis);
    }

    public static void tampilkanKarakter(AnimeCharacter karakter) {
        System.out.println("Nama: " + karakter.getName());
        System.out.println("Usia: " + karakter.getAge() + " tahun");
        System.out.println("Jenis Kelamin: " + karakter.getGenre());
        System.out.println("Deskripsi: " + karakter.getDescription());
        karakter.Interaction();
        System.out.println();
    }

    public static void tampilkanAbility(AnimeCharacter karakter) {
        if (karakter instanceof Protagonis) {
            Protagonis protagonis = (Protagonis) karakter;
            System.out.println("Kemampuan Khusus: " + protagonis.getAbility());
        } else if (karakter instanceof Antagonis) {
            Antagonis antagonis = (Antagonis) karakter;
            System.out.println("Kekuatan Jahat: " + antagonis.getDarkAbility());
        }else if (karakter instanceof Support) {
            Support support = (Support) karakter;
            System.out.println("bantuan yang diberikan: " + support.getCharacters());
        }else if (karakter instanceof UniqueCreature) {
            UniqueCreature uniqueCreature = (UniqueCreature) karakter;
            System.out.println("tempat tinggalnya : " + uniqueCreature.getLifeIn());
        }
        // Tambahkan kondisi lain jika ada kemampuan atau atribut khusus untuk kelas lain.
        System.out.println();
    }
}
