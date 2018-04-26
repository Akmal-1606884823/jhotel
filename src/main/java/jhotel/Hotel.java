package jhotel;
/**
 *   Class Hotel.
 *
 * @author Akmal
 * @version 1.2
 * @since 1-3-18
 */

public class Hotel
{
  private String nama;
  private Lokasi lokasi;
  private int bintang;
  private int id;
  
  /**
   * Constructor untuk Hotel
   */
  
  public Hotel(String nama,Lokasi lokasi,int bintang){
      DatabaseHotel dh = new DatabaseHotel();
      id = dh.getLastHotelID() + 1;
      this.nama = nama;
      this.lokasi = lokasi;
      this.bintang = bintang;
      
    
    
    
    }
    
  public int getID(){
    return id;
    } 
    
    /**
     * Menunjukkan bintang
     * @return Menunjukkan nilai bintang
     */
  public int getBintang(){
    
      return bintang;
    }
    
    /**
     * Menunjukkan nama
     * @return Menampilkan nama
     */
    
  public String getNama(){
    
      return nama;
    }
    /**
     * Menunjukkan lokasi
     * @return Menunjukkan nilai lokasi
     */
  public Lokasi getLokasi(){
    
      return lokasi;
    }
    
  public void setID(int id){
    this.id = id;
    }  
    
    /**
     * Menetapkan nama
     * @param nama menetapkan nama
     */
    
  public void setNama(String nama){
    
      this.nama = nama;
    }
    
    /**
     * Menetapkan Lokasi
     * @param lokasi menetapkan lokasi
     */
    
  public void setLokasi(Lokasi lokasi){
    
      this.lokasi = lokasi;
    
    }
    
    /**
     * Menetapkan bintang
     * @param bintang menetapkan nilai bintang
     */
    
  public void setBintang(int bintang){
    
      this.bintang = bintang;
    
    }
    
  public String toString(){
      String print = "\nNama dari Hotel adalah : "+nama+
                     "\nHotel berbintang : "+bintang+
                     "\nDeskripsi hotel adalah : "+lokasi.getDeskripsi()+".\n";
      
      return print; 
    }
}