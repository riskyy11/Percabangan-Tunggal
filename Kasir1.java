package perulangan;
import java.util.Scanner;
public class Kasir1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih=0,jumlah,total,grandtotal=0;
        
        do{
            System.out.println("");
            System.out.println("========================================");
            System.out.println("Aplikasi Kasir");
            System.out.println("1. Tas\n2. Sandal\n3. Sepatu");
            System.out.println("4. Selesai");
            System.out.println("----------------------------------------");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            System.out.println("----------------------------------------");
            switch(pilih){
                case 1:
                    System.out.println("Tas  : Rp100.000");
                    System.out.print("Jumlah : ");
                    jumlah = sc.nextInt();
                    System.out.println("--------------------------------------");
                    total = 100000*jumlah;
                    System.out.println("Total       = Rp"+total);
                    grandtotal = grandtotal+total;
                    System.out.println("Grand Total = Rp"+grandtotal);
                    break;
                case 2:
                    System.out.println("Sandal : Rp15.000");
                    System.out.print("Jumalah  : ");
                    jumlah = sc.nextInt();
                    System.out.println("--------------------------------------");
                    total = 15000*jumlah;
                    System.out.println("Total       = Rp"+total);
                    grandtotal = grandtotal+total;
                    System.out.println("Grand Total = Rp"+grandtotal);
                    break;
                case 3:
                    System.out.println("Sepatu : Rp120.000");
                    System.out.print("Jumlah   : ");
                    jumlah = sc.nextInt();
                    System.out.println("--------------------------------------");
                    total = 120000*jumlah;
                    System.out.println("Total       = Rp"+total);
                    grandtotal = grandtotal+total;
                    System.out.println("Grand Total = Rp"+grandtotal);
                    break;
                case 4:
                    System.out.println("Grand Total = Rp"+grandtotal);
                    System.out.println("----------Terima Kasih-----------");
                    break;
                default:System.out.println("");
            }
            
        } while(pilih!=4);
    }
}
