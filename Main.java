import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String user = "deamelyaa";
        int pass = 1234;

        class user {
            String username;
            String alamat;
            String no_hp;

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }
            public String getAlamat() {
                return alamat;
            }

            public void setAlamat(String alamat) {
                this.alamat = alamat;
            }

            public String getNo_hp() {
                return no_hp;
            }

            public void setNo_hp(String no_hp) {
                this.no_hp = no_hp;
            }
        }

        user Dea = new user();
        Dea.setUsername("Dea Amelia S.");
        Dea.setAlamat("Jl. Imogiri Timur");
        Dea.setNo_hp("08123456789");

        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("          LOGIN APLIKASI");
        System.out.println("               MELMA");
        System.out.println("================================");
        System.out.print("Masukkan username : ");
        String username = input.nextLine();
        System.out.print("Masukkan password : ");
        int password = input.nextInt();

        int menu;

        if(username.equals(user) && password==pass){
            System.out.println("\nNama   : " + Dea.getUsername());
            System.out.println("Alamat : " + Dea.getAlamat());
            System.out.println("No. Hp : " + Dea.getNo_hp());
            do {
                System.out.println("\nMENU");
                System.out.println("1. Food");
                System.out.println("2. Ride");
                System.out.println("3. Send");
                System.out.println("0. Exit");
                System.out.print("\nMasukkan pilihan : ");
                menu = input.nextInt();

                switch(menu){
                    case 1:
                        System.out.println("\n GRAB FOOD");
                        System.out.println("1. Ayam Geprek           Rp. 14.000");
                        System.out.println("2. Nasi Goreng           Rp. 14.000");
                        System.out.println("3. Bakso                 Rp. 10.000");
                        System.out.println("4. Soto Ayam             Rp. 7.000");
                        System.out.println("5. Nasi Ayam Rica-Rica   Rp. 14.000");
                        System.out.print("\n Masukkan pilihan : ");
                        int menu1=input.nextInt();

                        if(menu1 == 1){
                            melfood pil1 = new melfood("Ayam Geprek", 14000);
                            pil1.displaymelfood();
                            break;
                        } else if (menu1 == 2) {
                            melfood pil2 = new melfood("Nasi Goreng", 14000);
                            pil2.displaymelfood();
                            break;
                        } else if (menu1 == 3) {
                            melfood pil3 = new melfood("Bakso", 10000);
                            pil3.displaymelfood();
                            break;
                        }
                        else if (menu1 == 4){
                            melfood pil4 = new melfood("Soto Ayam", 7000);
                            pil4.displaymelfood();
                            break;
                        } else if (menu1 == 5) {
                            melfood pil5 = new melfood("Nasi Ayam Rica-Rica", 14000);
                            pil5.displaymelfood();
                            break;
                        }
                        break;

                    case 2:
                        System.out.println("\n GRAB RIDE");
                        System.out.println("1. Bantul - Sleman");
                        System.out.println("2. Bantul - Gunung Kidul");
                        System.out.println("3. Bantul - Kulon Progo");
                        System.out.println("4. Bantul - Kota Yogyakarta");
                        System.out.println("5. Sleman - Gunung Kidul");
                        System.out.println("6. Sleman - Kulon Progo");
                        System.out.println("7. Sleman - Kota Yogyakarta");
                        System.out.println("8. Gunung Kidul - Kulon Progo");
                        System.out.println("9. Gunung Kidul - Kota Yogyakarta");
                        System.out.println("10. Kulon Progo - Kota Yogyakarta");
                        System.out.print("\n Masukkan pilihan : ");
                        int menu2=input.nextInt();
                        switch (menu2){
                            case 1:
                                melride pil1 = new melride("Bantul", "Sleman", 2000, 22);
                                pil1.displaymelride();
                                break;
                            case 2:
                                melride pil2 = new melride("Bantul", "Gunung Kidul", 2000, 50 );
                                pil2.displaymelride();
                                break;
                            case 3:
                                melride pil3 = new melride("Bantul", "Kulon Progo", 2000, 30);
                                pil3.displaymelride();
                                break;
                            case 4:
                                melride pil4 = new melride("Bantul", "Kota Yogyakarta", 2000, 12);
                                pil4.displaymelride();
                                break;
                            case 5:
                                melride pil5 = new melride("Sleman", "Gunung Kidul", 2000, 56);
                                pil5.displaymelride();
                                break;
                            case 6:
                                melride pil6 = new melride("Sleman", "Kulon Progo", 2000, 37);
                                pil6.displaymelride();
                                break;
                            case 7:
                                melride pil7 = new melride("Sleman", "Kota Yogyakarta", 2000, 13);
                                pil7.displaymelride();
                                break;
                            case 8:
                                melride pil8 = new melride("Gunung Kidul", "Kulon Progo", 2000, 78);
                                pil8.displaymelride();
                                break;
                            case 9:
                                melride pil9 = new melride("Gunung Kidul", "Kota Yogyakarta", 2000, 49);
                                pil9.displaymelride();
                                break;
                            case 10:
                                melride pil10 = new melride("Kulon Progo", "Kota Yogyakarta", 2000, 28);
                                pil10.displaymelride();
                                break;
                        }
                        break;

                    case 3:
                        System.out.println("\n GRAB SEND");
                        System.out.println("1. Bahan kain");
                        System.out.println("2. Bahan kaca");
                        System.out.println("3. Bahan plastik");
                        System.out.print("\n Masukkan pilihan : ");
                        int menu3=input.nextInt();

                        switch (menu3){
                            case 1:
                                melsend pil1 = new melsend("Bahan kain", 5.3, 1.2);
                                pil1.displaymelsend();
                                break;
                            case 2:
                                melsend pil2 = new melsend("Bahan kaca", 12.8, 21.9);
                                pil2.displaymelsend();
                                break;
                            case 3:
                                melsend pil3 = new melsend("Bahan plastik", 4.7, 7.9);
                                pil3.displaymelsend();
                                break;
                        }
                        break;
                }
            } while (menu != 0);

        }
        else {
            System.out.println("\n Username atau password anda salah");
        }
    }
}
