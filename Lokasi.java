/**
 *   Class Lokasi.
 *
 * @author Akmal
 * @version 1.2
 * @since 1-3-18
 */

public class Lokasi
{
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;
    
   /**
    * Constructor untuk Lokasi
    */
    public Lokasi(float x_coord,float y_coord,String deskripsiLokasi){
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi;
    
    
    
    
    }
    
    /**
     * Menunjukkan nilai X
     * @return Untuk menunjukkan X
     */
    
    public float getX (){
    
        return x_coord;
    }
    
    /**
    * Menunjukkan nilai y
    * @return Untuk menunjukkan Y
    */
    
    public float getY(){
    
        return y_coord;
    }
    
    /**
    * Menunjukkan deskripsi
    * @return Untuk menunjukkan Deskripsi
    */
    public String getDeskripsi(){
        
        return deskripsiLokasi;
    
    }
    /**
    * Menetapkan nilai x
    * @param x_coord Untuk menetapkan X
    */
    public void setX(float x_coord){
    
        this.x_coord = x_coord;
    }
    /**
    * Menetapkan nilai Y
    * @param y_coord Untuk menetapkan Y
    */
    public void setY(float y_coord){
    
        this.y_coord = y_coord;
    
    }
    
    /**
    * Menetapkan Deskripsi lokasi
    * @param deskripsiLokasi Untuk menetapkan deskripsi
    */
    
    public void setDeskripsi(String  deskripsiLokasi){
    
        this.deskripsiLokasi = deskripsiLokasi;
    
    }
    
    public String toString(){
        return " Deskripsi Lokasi :"+deskripsiLokasi+" Koordinat X :"+x_coord+" Koordinat Y : "+y_coord;
    }
   
}
