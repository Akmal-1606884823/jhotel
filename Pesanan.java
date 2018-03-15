/**
 *   Class Pesanan.
 *
 * @author Akmal
 * @version 1.2
 * @since 1-3-18
 */

public class Pesanan
{
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isdiproses;
    private boolean isselesai;
    private Room kamar;
   
    
    /**
     * Constructor untuk Pesanan
     */
    public Pesanan (Customer pelanggan, Room kamar){
        biaya = kamar.getDailyTariff() * jumlahHari;
        this.pelanggan = pelanggan;
        this.kamar = kamar;
       
          
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
    
    public void setRoom(Room kamar){
        this.kamar = kamar;
    }
    
    public void printData(){
         System.out.println("Pesanan");
         System.out.println("");
         System.out.println("Nama Pelanggan : " + pelanggan.getNama());
         System.out.println("Jumlah Harinya : " + jumlahHari);
         System.out.println("Biayanya : " + biaya);
         System.out.println("Status Diprosesnya : " + isdiproses);
         System.out.println("Status Selesainya : " + isselesai);
         System.out.println("");
         
        
    }
}
