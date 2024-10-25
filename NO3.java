import java.util.*;
public class ParkingTicketMachine
{
    // instance variables - replace the example below with your own
    private int balance;
    private int ticketPrice = 5000;
    private int ticketTime;

    /**
     * Constructor for objects of class ParkingTicketMachine
     */
    public ParkingTicketMachine(int balance)
    {
        // initialise instance variables
        if (balance > 0){
            this.balance = balance;  // gunakan this untuk menginisialisasi variabel instance
            this.ticketTime = 0;
        }
        else{
            System.out.println("Jumlah uang dan waktu harus bilangan positif");
        }
    }

    /**
     * Method to insert money
     *
     * @param  amount  jumlah uang yang akan dimasukkan
     */
    public void insertMoney(int amount)
    {
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Uang dengan nominal " + amount + " berhasil ditambahkan ke saldo");
            System.out.println("Saldo sekarang adalah " + balance);
        }
        else{
            System.out.println("Uang yang dimasukkan harus bilangan bulat positif");
        }
    }
    
    public void issueTicket (){
        if(balance >= ticketPrice){
            ticketTime = balance / ticketPrice;
            balance = balance%ticketPrice;
            System.out.println("##################");
            System.out.println("# The Parking Ticket Line");
            System.out.println("# Ticket");
            System.out.println("# " + ticketPrice + " rupiah/jam");
            System.out.println("# Ticket untuk " + ticketTime + " jam");
            System.out.println("##################");
            System.out.println();
        }
        else{
            System.out.println("Saldo tidak cukup");
        }
    }
    
    public int getTimePurchased(){
        return ticketTime;
    }
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat datang di Parking Ticket Machine!!");
        System.out.println("Harga ticket perjam adalah Rp5000");
        System.out.println("Tuliskan jumlah uang yang akan dimasukkan kedalam ticket machine");
        System.out.print("> ");
        int balance = scanner.nextInt();
        scanner.nextLine();
        
        int pilihan;
        ParkingTicketMachine parkingTicket = new ParkingTicketMachine(balance);
        do {
            System.out.println("1. Tambahkan Saldo");
            System.out.println("2. Beli Tiket dan Tampilkan ticket");
            System.out.println("3. Tampilkan jumlah jam parkir yang telah dibeli");
            System.out.println("4. Quit");
            System.out.print("> ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch(pilihan){
                case 1:
                    System.out.println("Jumlah saldo yang ingin ditambahkan = ");
                    System.out.print("> ");
                    int amount = scanner.nextInt();
                    scanner.nextLine();
                    parkingTicket.insertMoney(amount);
                    break;
                
                case 2:
                    parkingTicket.issueTicket();
                    break;
                    
                case 3:
                    System.out.println("Jumlah jam parkir yang telah dibeli adalah " + parkingTicket.getTimePurchased());
                    break;
                    
                case 4:
                    System.out.println("Terimakasih!, sampai jumpa kembali");
                    break;
                
                default:
                    System.out.println("Tidak ada pilihan");
                    break;
            }
        }
        while(pilihan != 4);
    }
}
