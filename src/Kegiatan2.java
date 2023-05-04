import java.util.InputMismatchException;
import java.util.Scanner;

public class Kegiatan2 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        Scanner scanner = new Scanner(System.in);
        String data;
        int choice;
        do {
            System.out.println("""
                    Menu Manajemen Karyawan\s
                     1. Masukkan Pegawai
                     2. Keluarkan Pegawai
                     3. Pegawai Terakhir
                     4. Keluar""");
            System.out.print("Pilihan anda: ");
            try{
                choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> {
                        scanner.nextLine();
                        System.out.print("Masukkan Pegawai (Nama , Umur, Status Pegawai): ");
                        data = scanner.nextLine();
                        queue.enqueue(data);
                    }
                    case 2 -> {
                        System.out.print("Keluaran Pegawai teratas: ");
                        if (!queue.isEmpty()) {
                            queue.dequeue();
                        } else {
                            System.out.println("List kosong");
                        }
                    }
                    case 3 -> {
                        System.out.print("Pegawai teratas: ");
                        if (!queue.isEmpty()) {
                            Node topNode = queue.peek();
                            System.out.println(topNode.name + ", " + topNode.age + ", " + topNode.occupation);
                        } else {
                            System.out.println("List kosong");
                        }
                    }
                    case 4 -> System.out.println("Terima kasih telah menggunakan layanan kami");
                    default -> System.out.println("Pilihan tidak valid");
                }
            }catch (InputMismatchException e){
                System.out.println("Error : " + e);
                scanner.nextLine();
                choice = 0;
            }
        } while (choice != 4);
    }
}