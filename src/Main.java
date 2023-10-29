import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Penyelenggara eo1 = new Penyelenggara();
        Perusahaan pt1 = new Perusahaan();
        Admin admin1 = new Admin();
        Event e1 =new Event();
        while (true) {   
            System.out.println("====================== Menu Login =========================\n"
                                 + "===========================================================\n"
                                 + "1. Login\n"
                                 + "2. SignUp\n"
                                 + "3. Keluar\n"
                                 + "Pilih opsi (1/2): ");
            int a = s.nextInt();
            
            //login
            if (a == 1) {
                while (true) {   
                    System.out.println("====================== Pilih Login =========================\n"
                                 + "===========================================================\n"
                                 + "1. Login EO\n"
                                 + "2. Login PT\n"
                                 + "3. Keluar\n"
                                 + "Pilih opsi (1/2/3): ");
                    int c = s.nextInt();
                    //log in EO
                    if (c == 1) {  
                        while (true) {                            
                            System.out.print("Masukan username\t:");
                            String username = s.next();
                            System.out.print("Masukan password\t:");
                            String password = s.next();
                            if (eo1.login(username, password)) {
                                while (true) {         
                                    System.out.println("====================== Pilih Login =========================\n"
                                                                + "===========================================================\n"
                                                                + "1. Isi Even\n"
                                                                + "2. Set Sponsor\n"
                                                                + "3. Cek mou\n"
                                                                + "4. Keluar\n"
                                                                + "Pilih opsi (1/2/3): ");
                                    int d = s.nextInt();
                                    if (d == 1) {
                                        String namaAcara = s.next();
                                        String periode = s.next();

                                        eo1.isiEvent(e1, namaAcara, periode);
                                    } else if (d == 2) {
                                        String proposal = s.next();
                                         eo1.setSponsor(pt1, proposal);
                                    } else if (d == 3) {
                                        eo1.cekMou();
                                    } else if (d==4) {
                                        break;
                                    } else{
                                        System.out.println("Masukan angka yang benar");
                                    }
                                }
                            } else{
                                System.out.println("Masukan username dan password yang benar");
                                System.out.println("Ketik 1 untuk keluar atau selain 1 untuk ulang: ");
                                int a1 = s.nextInt();
                                if (a1 == 1) {
                                    break;
                                }
                            }
                        }
                    } else if (c == 2) {
                        //login PT
                        while (true) {                            
                            System.out.print("Masukan username\t:");
                            String username = s.next();
                            System.out.print("Masukan password\t:");
                            String password = s.next();
                            if (pt1.login(username, password)) {
                                while (true) {        
                                    System.out.println("====================== Pilih Login =========================\n"
                                                                + "===========================================================\n"
                                                                + "1. Isi Even\n"
                                                                + "2. Set Sponsor\n"
                                                                + "3. Cek mou\n"
                                                                + "4. Keluar\n"
                                                                + "Pilih opsi (1/2/3): ");
                                    int d = s.nextInt();
                                    if (d ==1) {
                                        pt1.cekAcara();
                                    } else if (d == 2) {
                                        String mou = s.next();
                                        pt1.formPerjanjian(mou);
                                    } else if (d == 3) {
                                        break;
                                    } else{
                                        System.out.println("Masukan angka yang benar");
                                    }
                                }
                            } else{
                                System.out.println("Masukan username dan password yang benar");
                                System.out.println("Ketik 1 untuk keluar atau selain 1 untuk ulang: ");
                                int a1 = s.nextInt();
                                if (a1 == 1) {
                                    break;
                                }
                            }
                        }
                    } else if (c == 3) {
                        break;
                    }  else{
                        System.out.println("Masukan angka yang benar");
                    }
                }
            //signup    
            } else if (a == 2) {
                while (true) {               
                    System.out.println("====================== Menu SignUp =========================\n"
                                 + "===========================================================\n"
                                 + "1. SignUp EO\n"
                                 + "2. SignUp PT\n"
                                 + "3. Keluar"
                                 + "Pilih opsi (1/2/3): ");
                    int b = s.nextInt();
                    //signup EO
                    if (b == 1) {
                        System.out.print("nama\t\t: ");
                        String nama = s.next();
                        System.out.print("institusi\t: ");
                        String institusi = s.next();;
                        System.out.print("username\t: ");
                        String username = s.next();
                        System.out.print("password\t: ");
                        String password = s.next();
                        System.out.print("email\t\t: ");
                        String email = s.next();
                        eo1.setEmail(email);
                        eo1.setPassword(password);
                        eo1.setUsername(username);
                        eo1.setPassword(password);
                        eo1.setNama(nama);
                        eo1.setInstitusi(institusi);
                        break;
                    //signup PT
                    } else if(b == 2){
                        System.out.print("NamaPT\t\t: ");
                        String namaPt = s.next();
                        System.out.print("Nama CP\t\t: ");
                        String namaCp = s.next();
                        System.out.print("alamat\t\t: ");
                        String alamat = s.next();
                        System.out.print("username\t: ");
                        String username = s.next();
                        System.out.print("password\t: ");
                        String password = s.next();
                        System.out.print("email\t\t: ");
                        String email = s.next();
                        pt1.setUsername(username);
                        pt1.setPassword(password);
                        pt1.setEmail(email);
                        pt1.setNamaCp(namaCp);
                        pt1.setNamaPt(namaPt);
                        pt1.setAlamat(alamat);
                        break;
                    } else if (b == 3) {
                        break;
                    }  else{
                        System.out.println("Masukan angka yang benar");
                    }
                }
            } else if (a == 3) {
                break;
            } else{
                System.out.println("Masukan nomor yang sesuai");
            }
        }
    }
}
