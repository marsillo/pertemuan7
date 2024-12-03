package pertemuan2;

public class LA2_pertemuan2 {

    // Atribut hewan
    private String nama;
    private int energi;

    // Konstruktor
    public LA2_pertemuan2(String nama, int energiAwal) {
        this.nama = nama;
        this.energi = energiAwal;
    }

    // Metode berjalan mengurangi energi 5
    public void berjalan() {
        if (energi >= 5) {
            energi -= 5;
            System.out.println(nama + " berjalan, energi berkurang menjadi: " + energi);
        } else {
            System.out.println(nama + " terlalu lelah untuk berjalan.");
        }
    }

    // Metode makan menambah energi 4
    public void makan() {
        energi += 4;
        System.out.println(nama + " makan, energi bertambah menjadi: " + energi);
    }

    // Metode main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek hewan
        LA2_pertemuan2 hewan = new LA2_pertemuan2("Kucing", 10);

        // Aktivitas hewan
        hewan.berjalan();
        hewan.makan();
        hewan.berjalan();
        hewan.berjalan();
    }
}