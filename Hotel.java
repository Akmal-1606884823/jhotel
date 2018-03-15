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
  
  /**
   * Constructor untuk Hotel
   */
  
  public Hotel(String nama,Lokasi lokasi,int bintang){
      this.nama = nama;
      this.lokasi = lokasi;
      this.bintang = bintang;
    
    
    
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
    
  public void printData(){
      System.out.println("Hotel");
      System.out.println("");
      System.out.println("Maka nama dari Hotel :"+ nama);
      System.out.println("Maka hotel berbintang :"+ bintang);
      System.out.println("Deskripsi hotel adalah :" +lokasi.getDeskripsi());
      System.out.println("");
    }
}