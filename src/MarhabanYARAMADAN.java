import java.util.Scanner;

public class MarhabanYARAMADAN {
    public static void main(String[] args) {
        String nama;
        String tanggal;
        int jumlahData;
        String[] kodeBarang = new String[10];
        int[] jumlahBarang = new int[10];
        String namaBarang;
        int hargaBarang;
        int[] totalHarga = new int[10];
        int pendapatan = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("\t\t\tPT.ADIL MAKMUR\t\t\t");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.print("Masukan Nama Petugas    : ");
        nama = input.nextLine();
        System.out.print("Tanggal   : ");
        tanggal = input.nextLine();
        System.out.print("Jumlah Data Yang Akan Dimasukan : ");
        jumlahData = input.nextInt();


        System.out.println("--------------------------------------");
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Kode Barang : ");
            kodeBarang[i] = input.next();
            System.out.print("Jumlah Barang  : ");
            jumlahBarang[i] = input.nextInt();
            System.out.println("---------------------");
            System.out.println("");
        }
        System.out.print("\n");

        System.out.println("\t\t\t\t\t\t\t\t\tPT.ADIL MAKMUR");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Nama Pelanggan      : " + nama);
        System.out.println("Tanggal             : " + tanggal);
        System.out.println("Jumlah Data         : " + jumlahData);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("NO\tKODE BARANG\t\tNAMA BARANG\t\tHARGA BARANG\t\tJUMLAH BARANG\t\tTOTAL HARGA");
        System.out.println("-----------------------------------------------------------------------------------------");

        for (int i = 0; i < jumlahData; i++) {
            switch (kodeBarang[i]) {
                case "P001":
                    namaBarang = "Printer";
                    hargaBarang = 700000;
                    totalHarga[i] = hargaBarang * jumlahBarang[i];
                    System.out.println((i + 1) + "\t" + kodeBarang[i] + "\t\t\t" + namaBarang + "\t\t\tRp. " + hargaBarang + "\t\t\t" + jumlahBarang[i] + "\t\t\t\t\tRp. " + totalHarga[i]);
                    break;
                case "M001":
                    namaBarang = "Motherboard";
                    hargaBarang = 950000;
                    totalHarga[i] = hargaBarang * jumlahBarang[i];
                    System.out.println((i + 1) + "\t" + kodeBarang[i] + "\t\t\t" + namaBarang + "\t\tRp. " + hargaBarang + "\t\t\t" + jumlahBarang[i] + "\t\t\t\t\tRp. " + totalHarga[i]);
                    break;
                case "V001":
                    namaBarang = "VGA Card";
                    hargaBarang = 75000;
                    totalHarga[i] = hargaBarang * jumlahBarang[i];
                    System.out.println((i + 1) + "\t" + kodeBarang[i] + "\t\t\t" + namaBarang + "\t\tRp. " + hargaBarang + "\t\t\t" + jumlahBarang[i] + "\t\t\t\t\tRp. " + totalHarga[i]);
                    break;
                default:
                    namaBarang = "Salah";
                    hargaBarang = 0;
                    totalHarga[i] = 0;
                    System.out.println((i + 1) + "\t" + kodeBarang[i] + "\t\t\t" + namaBarang + "\t\t\tRp. " + hargaBarang + "\t\t\t\t" + jumlahBarang[i] + "\t\t\t\t\tRp. " + totalHarga[i]);
                    break;
            }
        }

        for (int i = 0; i < jumlahData; i++) {
            pendapatan += totalHarga[i];
        }
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Total Pendapatan Pada tanggal " + tanggal + " adalah sebesar Rp. " + pendapatan);


    }
}