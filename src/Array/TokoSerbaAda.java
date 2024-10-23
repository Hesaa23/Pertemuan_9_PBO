package Array;
import java.util.Scanner;
public class TokoSerbaAda {
    public static void main(String[] args) {
        String[][] barang = {
            {"a001", "Buku"},
            {"a002", "Pensil"},
            {"a003", "Pulpen" }
        };
        int[] harga = {3000, 4000, 5000};
        int totalBayar = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Item Barang\t:");
        int jmlBarang = input.nextInt();
        String[][] pembelian = new String[jmlBarang][5];
        int[][] hargaPembelian = new int[jmlBarang][5];
        for (int i = 0; i <jmlBarang; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode\t\t:");
            String kode = input.next();
            System.out.print("Masukkan Jumlah beli\t:");
            int jmlBeli = input.nextInt();
            for (int j = 0; j < barang.length; j++) {
                if (barang[j][0].equals(kode)){
                    pembelian[i][0] = kode;
                    pembelian[i][1] = barang[j][1];
                    hargaPembelian[i][0] = harga[j];
                    hargaPembelian[i][1] = jmlBeli;
                    hargaPembelian[i][2] = harga[j] * jmlBeli;
                    totalBayar += hargaPembelian[i][2];
                    break;
                }
            }   
        }
        System.out.println("TOKO SERBA ADA");
        System.out.println("********************");
        System.out.println("No\tKode\tNama Barang\tHarga\tJumlah Beli\tJumlah Bayar");
        System.out.println("================================================================");
        for (int i = 0; i < pembelian.length; i++) {
            System.out.println((i + 1)+"\t" + pembelian[i][0]+"\t"+pembelian[i][1]+"\t\t"+ hargaPembelian[i][0] +"\t\t" + hargaPembelian[i][1] +"\t" + hargaPembelian[i][2]);
            
        }
        System.out.println("=================================================================");
        System.out.println(totalBayar);
        System.out.println("=================================================================");
    }
}
