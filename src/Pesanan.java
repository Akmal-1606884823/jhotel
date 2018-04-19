/**
 *   Class Pesanan.
 *
 * @author Akmal
 * @version 1.2
 * @since 1-3-18
 */
import java.util.Date;
import java.util.*;
public class Pesanan
{
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isdiproses;
    private boolean isselesai;
    private Room kamar;
    private Date tanggalPesan;
    private boolean isAktif = true;
    private int id;
    
    
    /**
     * Constructor untuk Pesanan
     */
    public Pesanan (Customer pelanggan,double jumlahHari){
        this.jumlahHari =jumlahHari;
        this.pelanggan = pelanggan;
        tanggalPesan = new Date();
        DatabasePesanan n = new DatabasePesanan();
        id = n.getLastPesananID() + 1; 
    }
    
    public Pesanan(GregorianCalendar time){
       
         tanggalPesan = new Date(time.get(Calendar.YEAR),time.get(Calendar.MONTH),time.get(Calendar.DATE));
    }
    
    public int getID(){
        
        return id;
    }
    
    /**
     * Menunjukkan biaya
     * @return Untuk mengassign biaya
     */

    public double getBiaya (){
        
        return biaya;
    }
    
    public double getJumlahHari(){
        
        return jumlahHari;
    
    }
    
    /**
     * Menunjukkan pelanggan
     * @return Untuk menambah pesanan dari pelanggan
     */
    public Customer getPelanggan(){

    
        return pelanggan;
    }
    
    public boolean getStatusAktif (){
    
        return isAktif;
    } 
    
    /**
     * Menunjukkan status proses
     * @return Menampilkan status apakah true or false
     */

    public boolean getStatusDiproses (){
    
        return isdiproses;
    } 
    
    /**
     * Menunjukkan status selesai
     * @return Menunjukkan status apakah selesai
     */
     public boolean getStatusSelesai (){
    
        return isselesai;
    } 
    
    public Room getRoom(){
        return kamar;
    }
    
    public Date getTanggalPesan(){
        return tanggalPesan;
    }
    
    public void setID(int id){
        this.id=id;
    }
    
    /**
     * Menetapkan nilai biaya
     * @param biaya menerima biaya untuk memasukkan pada variabel
     */
    public void setBiaya (){
        
        biaya = kamar.getDailyTariff() * jumlahHari;
           
    }
    
    public void setJumlahHari(double jumlahHari){
    
        this.jumlahHari = jumlahHari;
    
    }
    
    /**
     * Menetapkan pelanggan
     * @param baru untuk menambah customer baru
     */
    public void setPelanggan(Customer pelanggan){
        
        this.pelanggan = pelanggan;
        
    }
    
    /**
     * Menetapkan status pemrosesan
     * @param diroses Menetapkan status
     */
    public void setStatusDiproses(boolean diproses){
        
        isdiproses = diproses;
    }
    
    /**
     * Menetapkan status penyelesaian
     * @param selesai untuk menetapkan status selesai
     */
    public void setStatusSelesai(boolean selesai){
    
        isselesai = selesai;
        
    }
    
    public void setStatusAktif(boolean isAktif){
    
        this.isAktif = isAktif;
        
    }
    
    public void setRoom(Room kamar){
        this.kamar = kamar;
    }
    
    public void setTanggalPesan(Date tanggalPesan){
        this.tanggalPesan = tanggalPesan;
    }
    
    public String toString(){
        String final_status = "KOSONG";
        if(isdiproses == true && isselesai == false){
            final_status = "DIPROSES";
        }
        else if(isdiproses == false && isselesai == false){
            final_status = "KOSONG";
        }
        else if(isdiproses == false && isselesai == true){
            final_status = "fi";
        }
        else{
            final_status = "SELESAI";
        }
        String print;
        if(kamar == null){
            print = " \nDibuat oleh : " +pelanggan.getNama() +
                    "\nProses Booking untuk : -"+
                    "\nKamar Nomor : -" +
                    "\nDengan Tipe kamar yang diinginkan : -" +
                    "\nStatus : "+final_status+".\n" ;

        }
        else {
             print = " \nDibuat oleh : " + pelanggan.getNama() +
                    "\nProses Booking untuk : " + kamar.gethotel() +
                    "\nKamar Nomor : " + kamar.getNomorKamar() +
                    "\nDengan Tipe kamar yang diinginkan : " + kamar.getTipeKamar() +
                    "\nStatus : " + final_status + ".\n";
        }
        return print;
        
    }
}
