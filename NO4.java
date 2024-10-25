import java.util.ArrayList;
import java.util.Scanner;

public class FoodOrder
{
    // instance variables
    private ArrayList<String> daftar_menu;
    private double totalPrice;
    private boolean isPaid;
    
    /**
     * Constructor for objects of class FoodOrder
     */
    public FoodOrder()
    {
        // initialise instance variables
        this.daftar_menu = new ArrayList<>();
        this.totalPrice = 0.0;
        this.isPaid = false;
    }

    public void addFood(String nama_makanan, double harga_makanan)
    {
        daftar_menu.add(nama_makanan);
        totalPrice += harga_makanan;
        System.out.println("Menu " + nama_makanan + " berhasil ditambahkan kedalam orderan");
    }

    public void removeFood(String nama_makanan, double harga_makanan)
    {
        if(daftar_menu.contains(nama_makanan)){
            daftar_menu.remove(nama_makanan);
            totalPrice -= harga_makanan;
            System.out.println("Menu " + nama_makanan + " berhasil dihapus dari orderan");
        }
        else{
            System.out.println("Menu " + nama_makanan + " tidak terdapat di dalam orderan");
        }
    }
    
    public void markPaid(){
        isPaid = true;
        System.out.println("Menu orderan telah dibayar");
    }
    
    public double total()
    {
        return totalPrice;
    }
    
    public void getOrderDetails()
    {
        if(!daftar_menu.isEmpty()){
            System.out.println("==============Daftar menu dalam pesanan==============");
            for(String item : daftar_menu){
                System.out.println("🍕. " + item);
            }
            System.out.println("Total harga = " + totalPrice);
            System.out.println("Status pembayaran = " + (isPaid ? "Lunas" : "Belum dibayar"));
            System.out.println("=====================================================");
        }
        else{
            System.out.println("Tidak terdapat menu di order menu");
        }
    }
    
    public static void main(String[] args)
    {
        FoodOrder orderMenu = new FoodOrder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat datang di Restoran Blalalala!!");
        System.out.println("Silahkan lakukan pemesanan dengan pilihan pilihan dibawah ini");
        System.out.println();
        int pilihan;
        
        do {
            System.out.println("1. Pesan");
            System.out.println("2. Tambahkan Pesanan");
            System.out.println("3. Hapus Pesanan yang tidak diinginkan");
            System.out.println("4. Detail Pesanan");
            System.out.println("5. Bayar");
            System.out.println("6. Selesai");
            System.out.print("> ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch(pilihan){
                case 1:
                    System.out.println("Menu yang ingin dipesan = ");
                    System.out.print("> ");
                    String makanan = scanner.nextLine();
                    System.out.println("Harga Menu yang ingin dipesan = ");
                    System.out.print("> ");
                    int harga = scanner.nextInt();
                    scanner.nextLine();
                    
                    orderMenu.addFood(makanan, harga);
                    break;
                
                case 2:
                    System.out.println("Menu yang ingin ditambah = ");
                    System.out.print("> ");
                    makanan = scanner.nextLine();
                    System.out.println("Harga Menu yang ingin ditambah = ");
                    System.out.print("> ");
                    harga = scanner.nextInt();
                    scanner.nextLine();
                    
                    orderMenu.addFood(makanan, harga);
                    break;
                    
                case 3:
                    System.out.println("Menu yang ingin dibatalkan = ");
                    System.out.print("> ");
                    makanan = scanner.nextLine();
                    System.out.println("Harga Menu yang ingin dibatalkan = ");
                    System.out.print("> ");
                    harga = scanner.nextInt();
                    scanner.nextLine();
                    
                    orderMenu.removeFood(makanan, harga);
                    break;
                    
                case 4:
                    orderMenu.getOrderDetails();
                    break;
                
                case 5:
                    System.out.println("Total pemesanan anda adalah = " + orderMenu.total());
                    orderMenu.markPaid();
                    break;
                    
                case 6:
                    System.out.println("Terimakasih!, Selamat menikmati hidangan yang kami sediakan");
                    break;

                default:
                    System.out.println("Tidak ada pilihan");
                    break;
            }
        }
        while(pilihan != 6);
    }
}
