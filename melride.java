import java.io.FileWriter;
public class melride extends ojol{
    private String lokasi;
    private String tujuan;
    private int biaya;
    private int total, jarak;
    private int ongkir = 2000;


    melride(String lokasi1, String tujuan1, int biaya1, int jarak1){
        this.lokasi = lokasi1;
        this.tujuan = tujuan1;
        this.biaya = biaya1;
        this.jarak = jarak1;
    }

    public double ride(){
        total = (biaya*jarak) + ongkir;
        return total;
    }

    void displaymelride(){
        try {
            System.out.println("Lokasi anda   : " + lokasi);
            System.out.println("Lokasi tujuan : " + tujuan);
            System.out.println("Biaya order   : " + ride());
            System.out.println("Silakan tunggu driver anda menjemput :)");

            FileWriter f = new FileWriter("struk.php");
            f.write("================================");
            f.write("\n       Struk Pembayaran");
            f.write("\n================================");
            f.write("\nDetail Perjalanan");
            f.write("\nLokasi jemput   : " + lokasi);
            f.write("\nLokasi tujuan   : " + tujuan);
            f.write("\n\nDetail Pembayaran");
            f.write("\nBiaya order     : Rp. " + ride());
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
