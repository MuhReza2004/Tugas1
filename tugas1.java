// Nama: MUH. Reza
// NIM:    13020220070
// KELAS: A2

public class tugas1 {

    public class Main {
        public static void main(String[] args) {
            if (args.length != 1) {
                System.err.println("Usage: java Main <total_detik>");
                System.exit(1);
            }

            int totalDetik = Integer.parseInt(args[0]);

            int detikSekarang = totalDetik % 60;
            int totalMenit = totalDetik / 60;
            int menitSekarang = totalMenit % 60;
            int totalJam = totalMenit / 60;
            int jamSekarang = totalJam % 24;

            System.out.printf("Waktu saat ini: %02d:%02d:%02d%n", jamSekarang, menitSekarang, detikSekarang);
        }
    }

}
