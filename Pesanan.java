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
    private Customer pelanggan;
    private String nama_pelanggan;
    private TipeKamar tipe_kamar;
    private boolean isdiproses;
    private boolean isselesai;
    private Room kamar;
   
    
    /**
     * Constructor untuk Pesanan
     */
    public Pesanan (double biaya,Customer pelanggan){
        this.biaya = biaya;
        this.pelanggan = pelanggan;
        
        nama_pelanggan = pelanggan.getNama();
        
    
    
    }
    
    /**
     * Menunjukkan biaya
     * @return Untuk mengassign biaya
     */

    public double getBiaya (){
    
        return biaya;
    }
    
    /**
     * Menunjukkan pelanggan
     * @return Untuk menambah pesanan dari pelanggan
     */
    public Customer getPelanggan(){

    
        return pelanggan;
    }
    
    /**
     * Menunjukkan nama
     * @return Untuk menampilkan nama
     */
    public String getNamaPelanggan(){
    
       return nama_pelanggan;
    
    }
    
    public TipeKamar getTipeKamar(){
        return tipe_kamar;
    
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
    public void setBiaya (double biaya){
        
        this.biaya = biaya;
           
    }
    
    /**
     * Menetapkan pelanggan
     * @param baru untuk menambah customer baru
     */
    public void setPelanggan(Customer baru){
        
        pelanggan = baru;
        
    }
    
    public void setNamaPelanggan(String nama_pelanggan){
        
        this.nama_pelanggan = nama_pelanggan;
    
    }
    
    public void setTipeKamar(TipeKamar tipe_kamar){
    
        this.tipe_kamar = tipe_kamar;
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
         System.out.println("Nama Pelanggan : " +  nama_pelanggan);
         System.out.println("Tipe kamar : " + tipe_kamar);
         System.out.println("Status Diprosesnya : " + isdiproses);
         System.out.println("Status Selesainya : " + isselesai);
         System.out.println("");
         
        
    }
}
