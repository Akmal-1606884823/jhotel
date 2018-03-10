
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
       Pesanan Semanta = new Pesanan (0,kamar.getCustomer());
       Semanta = kamar.getPesanan();
       Semanta.setStatusDiproses(false);
       Semanta.setStatusSelesai(true);
       Semanta.setRoom(null);
       kamar.setPesanan(Semanta);
       
       roomLepasPesanan(kamar);
       
   }
   
   public void pesananDibatalkan(Pesanan pesan){
       Room Sementar = new Room (null,"A",false);
       Sementar = pesan.getRoom();
       
       pesan.setRoom(Sementar);
       
       pesan.setStatusSelesai(false);
       pesan.setStatusDiproses(false);
       pesan.setRoom(null);
       
    }
   
   public void pesananSelesai(Pesanan pesan){
       Room Semantc = new Room (null,"A",false);
       Semantc = pesan.getRoom();
       
       pesan.setRoom(Semantc);
       
       pesan.setStatusSelesai(true);
       pesan.setStatusDiproses(false);
       pesan.setRoom(null);
    
    }
 
}
