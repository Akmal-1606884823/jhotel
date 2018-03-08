
/**
 * Write a description of class Administrasi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Administrasi
{
   public void pesananDitugaskan(Pesanan pesan,Room kamar){
       pesan.setStatusSelesai(false);
       pesan.setStatusDiproses(true);
       pesan.setRoom(kamar);
       
       roomAmbilPesanan(pesan,kamar);
       
    }
   
   public void roomAmbilPesanan(Pesanan pesan,Room kamar){
       kamar.setStatusKamar(StatusKamar.Booked);
       kamar.setPesanan(pesan);
       
    }
   
   public void roomLepasPesanan(Room kamar){
       kamar.setStatusKamar(StatusKamar.Vacant);
       kamar.setPesanan(null);
    
    }
   
   public void pesananDibatalkan(Room kamar){
       Pesanan Sem = kamar.getPesanan();
       Sem.setStatusDiproses(false);
       Sem.setRoom(null);
       kamar.setPesanan(Sem);
       
       roomLepasPesanan(kamar);
    
    }
   
   public void pesananSelesai(Room kamar){
       Pesanan Sem = kamar.getPesanan();
       Sem.setStatusSelesai(true);
       Sem.setStatusDiproses(false);
       Sem.setRoom(null);
       kamar.setPesanan(Sem);
       
       roomLepasPesanan(kamar);
       
   }
   
   public void pesananDibatalkan(Pesanan pesan){
       Room Sem = pesan.getRoom();
       roomLepasPesanan(Sem);
       pesan.setRoom(Sem);
       
       pesan.setStatusSelesai(false);
       pesan.setStatusDiproses(false);
       pesan.setRoom(null);
       
    }
   
   public void pesananSelesai(Pesanan pesan){
       Room Sem = pesan.getRoom();
       roomLepasPesanan(Sem);
       pesan.setRoom(Sem);
       
       pesan.setStatusSelesai(true);
       pesan.setStatusDiproses(false);
       pesan.setRoom(null);
    
    }
 
}
