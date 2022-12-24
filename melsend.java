import java.io.FileWriter;

public class melsend extends ojol{
    private String nama;
    private double jarak,berat,biaya;

    melsend(String nama1, double jarak1, double berat1){
        this.nama = nama1;
        this.jarak = jarak1;
        this.berat = berat1;
    }

    public double send(){
        biaya = (berat*2000)+(jarak*1000)+2000;
        return biaya;
    }

    void displaymelsend(){
        try {
            System.out.println("Nama barang  : " + nama);
            System.out.println("Berat barang : " + berat + " kg");
            System.out.println("Jarak barang : " + jarak + " km");
            System.out.println("Biaya barang : " + send());

            FileWriter f = new FileWriter("struk.php");
            f.write("================================");
            f.write("         \nStruk Pembayaran");
            f.write("\n================================");
            f.write("\nJenis barang  : " + nama);
            f.write("\nBerat barang  : " + berat + " kg");
            f.write("\nJarak jemput  : " + jarak + " km");
            f.write("\n\nTotal biaya barang : Rp. " + send());
            f.close();
        }
        catch (Exception e){
            System.out.println("Data tidak ada");
        }
        finally {
            System.out.println("Struk telah di cetak");
        }

    }

}
