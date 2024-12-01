package tugasAkhirPemdasIhsan;

import java.util.Arrays;
import java.util.Scanner;

public class tugasAkhirFootball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] Positions = { "GK", "LB", "LCB", "RCB", "RB", "CDM", "CM", "CAM", "LW", "ST", "RW" };

        // Data pemain dalam array 2D (berdasarkan posisi)
        String[][] GK = {
                { "Kurnia Meiga", "100", "available" },
                { "Maarten Paes", "97", "available" },
                { "Andritany", "94", "available" },
                { "Markus Horison", "94", "available" },
                { "I Made Wirawan", "93", "available" },
                { "Hendro Kartiko", "92", "available" },
                { "Ernando Ari", "90", "available" },
                { "Nadeo Argawinata", "90", "available" },
        };
        String[][] LB = {
                { "Calvin Verdonk", "98", "available" },
                { "Shayne Pattynama", "96", "available" },
                { "Pratama Arhan", "95", "available" },
                { "Rezaldi Hehanusa", "93", "available" },
                { "Edo Febriansyah", "90", "available" },
        };
        String[][] LCB = {
                { "Jay Idzes", "98", "available" },
                { "Elkan Baggott", "96", "available" },
                { "Rizky Ridho", "96", "available" },
                { "Jordi Amat", "94", "available" },
                { "Hansamu Yama", "93", "available" },
                { "Victor Igbonefo", "90", "available" },
                { "Muhammad Ferrari", "90", "available" },
        };
        String[][] RCB = {
                { "Mees Hilgers", "97", "available" },
                { "Kevin Diks", "96", "available" },
                { "Justin Hubner", "95", "available" },
                { "Hamka Hamzah", "93", "available" },
                { "Fachrudin Aryanto", "92", "available" },
                { "Maman Abdurrahman", "91", "available" },
                { "Jens Raven", "90", "available" },
        };
        String[][] RB = {
                { "Ismed Sofyan", "97", "available" },
                { "Sandy Walsh", "96", "available" },
                { "Eliano Reijnders", "94", "available" },
                { "Asnawi Mangkualam", "93", "available" },
                { "Putu Gede", "90", "available" },
        };
        String[][] CDM = {
                { "Thom Haye", "98", "available" },
                { "Nathan Tjoe A On", "95", "available" },
                { "Zulfiandi", "94", "available" },
                { "Marc Klok", "94", "available" },
                { "Rachmat Irianto", "93", "available" },
                { "Toni Sucipto", "92", "available" },
                { "Alfeandra Dewangga", "90", "available" },
        };
        String[][] CM = {
                { "Bima Sakti", "97", "available" },
                { "Firman Utina", "96", "available" },
                { "Ivar Jenner", "95", "available" },
                { "Ponaryo Astaman", "94", "available" },
                { "Evan Dimas", "93", "available" },
                { "Syahrian Abimanyu", "90", "available" },
        };
        String[][] CAM = {
                { "Marselino Ferdinan", "97", "available" },
                { "Stefano Lilipaly", "95", "available" },
                { "Septian David", "94", "available" },
                { "Witan Sulaeman", "93", "available" },
                { "Ricky Kambuaya", "92", "available" },
                { "Todd Ferre", "90", "available" },
        };
        String[][] LW = {
                { "Irfan Bachdim", "96", "available" },
                { "Rafael Struick", "95", "available" },
                { "Okto Maniani", "93", "available" },
                { "Greg Nwokolo", "92", "available" },
                { "Osvaldo Haay", "91", "available" },
                { "Novri Setiawan", "90", "available" },
        };
        String[][] ST = {
                { "Boaz Salossa", "99", "available" },
                { "Bambang Pamungkas", "99", "available" },
                { "Kurniawan Dwi Cahyo", "98", "available" },
                { "Budi Sudarsono", "98", "available" },
                { "Christian Gonzales", "97", "available" },
                { "Oratmangoen", "95", "available" },
                { "Beto Goncalves", "94", "available" },
                { "Titus Bonai", "93", "available" },
                { "Ferdinan Sinaga", "92", "available" },
                { "Ramadhan Sananta", "92", "available" },
                { "Ezra Walian", "91", "available" },
                { "Hokky Caraka", "90", "available" },
                { "Arkhan Kaka", "90", "available" },
        };
        String[][] RW = {
                { "Andik Vermansyah", "96", "available" },
                { "Saddil Ramdani", "95", "available" },
                { "Egy Maulana Vikri", "94", "available" },
                { "Yakob Sayuri", "94", "available" },
                { "Febri Hariyadi", "93", "available" },
                { "Riko Simanjuntak", "92", "available" },
                { "Irfan Jaya", "91", "available" },
        };

        System.out.println("=== Selamat Datang di Draft Pick Timnas Indonesia! ===\n");
        System.out.println("Ketik \"Yes\" untuk memulai permainan");
        System.out.println("Ketik \"No\" untuk membatalkan permainan");

        while (true) { // Loop akan terus berjalan sampai kondisi di-break
            String confirmation = scan.next();
            if (confirmation.equalsIgnoreCase("yes")) {
                System.out.print("Permainan dimulai, Selamat bermain!");
                break; // Keluar dari loop
            } else if (confirmation.equalsIgnoreCase("no")) {
                System.out.println("Terima kasih, sampai jumpa di permainan lain!");
                scan.close();
                return; // Keluar dari loop
            } else {
                System.out.println("Konfirmasi anda salah, coba ketik ulang.");
            }
        }

        while (true) {
            int randomNumberGK = (int) (Math.random() * GK.length);
            int randomNumberLB = (int) (Math.random() * LB.length);
            int randomNumberLCB = (int) (Math.random() * LCB.length);
            int randomNumberRCB = (int) (Math.random() * RCB.length);
            int randomNumberRB = (int) (Math.random() * RB.length);
            int randomNumberCDM = (int) (Math.random() * CDM.length);
            int randomNumberCM = (int) (Math.random() * CM.length);
            int randomNumberCAM = (int) (Math.random() * CAM.length);
            int randomNumberLW = (int) (Math.random() * LW.length);
            int randomNumberST = (int) (Math.random() * ST.length);
            int randomNumberRW = (int) (Math.random() * RW.length);

            System.out.println();
            if (choosenPosition(GK))
                System.out.println("GK: " + GK[randomNumberGK][0]);
            if (choosenPosition(LB))
                System.out.println("LB: " + LB[randomNumberLB][0]);
            if (choosenPosition(LCB))
                System.out.println("LCB: " + LCB[randomNumberLCB][0]);
            if (choosenPosition(RCB))
                System.out.println("RCB " + RCB[randomNumberRCB][0]);
            if (choosenPosition(RB))
                System.out.println("RB: " + RB[randomNumberRB][0]);
            if (choosenPosition(CDM))
                System.out.println("CDM: " + CDM[randomNumberCDM][0]);
            if (choosenPosition(CM))
                System.out.println("CM: " + CM[randomNumberCM][0]);
            if (choosenPosition(CAM))
                System.out.println("CAM: " + CAM[randomNumberCAM][0]);
            if (choosenPosition(LW))
                System.out.println("LW: " + LW[randomNumberLW][0]);
            if (choosenPosition(ST))
                System.out.println("ST: " + ST[randomNumberST][0]);
            if (choosenPosition(RW))
                System.out.println("RW: " + RW[randomNumberRW][0]);
            System.out.println("\nPilihlah satu pemain dengan mengetikkan posisinya");

            String userPick;
            while (true) {
                userPick = scan.next().toUpperCase();
                if (Arrays.asList(Positions).contains(userPick)) {
                    break;
                } else {
                    System.out.println("\nPosisi tidak tersedia, silakan pilih kembali");
                }
            }

            switch (userPick) {
                case "GK":
                    if (choosenPosition(GK))
                        GK[randomNumberGK][2] = "unavailable";
                    else
                        System.out.print("Posisi sudah dipilih, coba ketik posisi lain");
                    break;
                case "LB":
                    if (choosenPosition(LB))
                        LB[randomNumberLB][2] = "unavailable";
                    else
                        System.out.print("Posisi sudah dipilih, coba ketik posisi lain");
                    break;
                case "LCB":
                    if (choosenPosition(LCB))
                        LCB[randomNumberLCB][2] = "unavailable";
                    else
                        System.out.print("Posisi sudah dipilih, coba ketik posisi lain");
                    break;
                case "RCB":
                    if (choosenPosition(RCB))
                        RCB[randomNumberRCB][2] = "unavailable";
                    else
                        System.out.print("Posisi sudah dipilih, coba ketik posisi lain");
                    break;
                case "RB":
                    if (choosenPosition(RB))
                        RB[randomNumberRB][2] = "unavailable";
                    else
                        System.out.print("Posisi sudah dipilih, coba ketik posisi lain");
                    break;
                case "CDM":
                    if (choosenPosition(CDM))
                        CDM[randomNumberCDM][2] = "unavailable";
                    else
                        System.out.print("Posisi sudah dipilih, coba ketik posisi lain");
                    break;
                case "CM":
                    if (choosenPosition(CM))
                        CM[randomNumberCM][2] = "unavailable";
                    else
                        System.out.print("Posisi sudah dipilih, coba ketik posisi lain");
                    break;
                case "CAM":
                    if (choosenPosition(CAM))
                        CAM[randomNumberCAM][2] = "unavailable";
                    else
                        System.out.print("Posisi sudah dipilih, coba ketik posisi lain");
                    break;
                case "LW":
                    if (choosenPosition(LW))
                        LW[randomNumberLW][2] = "unavailable";
                    else
                        System.out.print("Posisi sudah dipilih, coba ketik posisi lain");
                    break;
                case "ST":
                    if (choosenPosition(ST))
                        ST[randomNumberST][2] = "unavailable";
                    else
                        System.out.print("Posisi sudah dipilih, coba ketik posisi lain");
                    break;
                case "RW":
                    if (choosenPosition(RW))
                        RW[randomNumberRW][2] = "unavailable";
                    else
                        System.out.print("Posisi sudah dipilih, coba ketik posisi lain");
                    break;
                default:
                    System.out.print("\nPosisi tidak tersedia, silakan pilih kembali");
                    break;
            }

            // dari available ke unavailable pakai (!)
            if (!choosenPosition(GK) && !choosenPosition(LB) && !choosenPosition(LCB) && !choosenPosition(RCB)
                    && !choosenPosition(RB) && !choosenPosition(CDM) && !choosenPosition(CM) && !choosenPosition(CAM)
                    && !choosenPosition(LW) && !choosenPosition(ST) && !choosenPosition(RW)) {

                int totalKekuatanTim = (getKekuatanPemain(GK) + getKekuatanPemain(LB) + getKekuatanPemain(LCB) +
                        getKekuatanPemain(RCB) + getKekuatanPemain(RB) + getKekuatanPemain(CDM) + getKekuatanPemain(CM)
                        + getKekuatanPemain(CAM) + getKekuatanPemain(LW) + getKekuatanPemain(ST)
                        + getKekuatanPemain(RW));

                System.out.println("GK: " + getPilihanPemain(GK));
                System.out.println("LB: " + getPilihanPemain(LB));
                System.out.println("LCB: " + getPilihanPemain(LCB));
                System.out.println("RCB: " + getPilihanPemain(RCB));
                System.out.println("RB: " + getPilihanPemain(RB));
                System.out.println("CDM: " + getPilihanPemain(CDM));
                System.out.println("CM: " + getPilihanPemain(CM));
                System.out.println("CAM: " + getPilihanPemain(CAM));
                System.out.println("LW: " + getPilihanPemain(LW));
                System.out.println("ST: " + getPilihanPemain(ST));
                System.out.println("RW: " + getPilihanPemain(RW));

                double OVR = totalKekuatanTim / 11;
                String prestasi;
                if (OVR > 97) {
                    prestasi = "Timnas Indonesia menjuarai Piala Dunia";
                } else if (OVR > 96) {
                    prestasi = "Timnas Indonesia lolos Piala Dunia namun terhenti di Fase Grup";
                } else if (OVR > 95) {
                    prestasi = "Timnas Indonesia menjuarai AFC Nations League";
                } else if (OVR > 94) {
                    prestasi = "Timnas Indonesia terhenti di Semi-Final AFC Nations League";
                } else if (OVR > 93) {
                    prestasi = "Timnas Indonesia menjuarai AFF CUP";
                } else {
                    prestasi = "Timnas Indonesia tidak mendapat prestasi apa pun";
                    break;
                }
                System.out.printf("\nKekuatan Tim: %.2f", OVR);
                System.out.println("\nPrestasi: " + prestasi);
            }
        }
        scan.close();
    }

    public static int getKekuatanPemain(String[][] arr) {
        int kekuatan = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][2].equals("unavailable")) {
                kekuatan = Integer.parseInt(arr[i][1]);
                break;
            }
        }
        return kekuatan;
    }

    public static String getPilihanPemain(String[][] arr) {
        String pemain = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][2].equals("unavailable")) {
                pemain = arr[i][0];
                break;
            }
        }
        return pemain;
    }

    public static boolean choosenPosition(String[][] arr) {
        boolean positionAvailable = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][2].equals("unavailable")) {
                positionAvailable = false;
                break;
            }
        }
        return positionAvailable;
    }
}