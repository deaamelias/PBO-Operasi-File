import java.io.FileWriter;
public class melfood extends ojol{
    private String makanan;
    private int harga;
    private int total;
    private int ongkir = 2000;

    melfood(String makanan1, int harga1){
        this.makanan = makanan1;
        this.harga = harga1;
    }


    public double food(){
        total = harga + ongkir;
        return total;
    }

    void displaymelfood(){
        try {
            System.out.println("Anda memilih : " + makanan);
            System.out.println("Total order : " + food());
            System.out.println("Silakan tunggu driver anda menjemput makanan :)");

            FileWriter f = new FileWriter("struk.php");
            f.write("================================");
            f.write("         \nStruk Pembayaran");
            f.write("\n================================");
            f.write("\nTransaction Detail");
            f.write("\n" + makanan + "    Rp." + harga);
            f.write("\nTotal bayar      : Rp. " + food());
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
