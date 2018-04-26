package jhotel;
/**
 * Write a description of class Administrasi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Administrasi
{
   public static void pesananDitugaskan(Pesanan pesan,Room kamar) {
       if (kamar.getStatusKamar().equals(StatusKamar.Vacant)){
           pesan.setStatusSelesai(false);
           pesan.setStatusDiproses(true);
           pesan.setRoom(kamar);
           roomAmbilPesanan(pesan,kamar);
   }
       else{
           pesan.setStatusAktif(false);

       }
    }
   
   public static void roomAmbilPesanan(Pesanan pesan,Room kamar){
       kamar.setStatusKamar(StatusKamar.Booked);
       
    }
   
   public static void roomLepasPesanan(Room kamar){
       kamar.setStatusKamar(StatusKamar.Vacant);
    
    }
   
   public static void pesananDibatalkan(Room kamar){
       DatabasePesanan.getPesanan(kamar.gethotel().getID()).setStatusSelesai(false);
       DatabasePesanan.getPesanan(kamar.gethotel().getID()).setStatusDiproses(false);
       DatabasePesanan.getPesanan(kamar.gethotel().getID()).setStatusAktif(false);
       
       roomLepasPesanan(kamar);
    
    }
   
   public static void pesananSelesai(Room kamar){
       DatabasePesanan.getPesanan(kamar.gethotel().getID()).setStatusDiproses(false);
       DatabasePesanan.getPesanan(kamar.gethotel().getID()).setStatusSelesai(true);
       DatabasePesanan.getPesanan(kamar.gethotel().getID()).setStatusAktif(false);
       
       roomLepasPesanan(kamar);
       
   }
   
   public static void pesananDibatalkan(Pesanan pesan){
       roomLepasPesanan(pesan.getRoom());
       
       pesan.setStatusSelesai(false);
       pesan.setStatusDiproses(false);
       pesan.setRoom(null);
       
    }
   
   public static void pesananSelesai(Pesanan pesan){
       roomLepasPesanan(pesan.getRoom());
       
       pesan.setStatusSelesai(true);
       pesan.setStatusDiproses(false);
    
    }
 
}
