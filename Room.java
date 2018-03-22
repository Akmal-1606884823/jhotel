
/**
 * Write a description of class Room here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Room
{
    private Hotel hotel;
    private String nomor_kamar;
    private boolean isAvailable;
    protected double dailyTariff;
    private StatusKamar statuskamar;
    private Pesanan pesan;
    
    public Room (Hotel hotel,String nomor_kamar,boolean isAvailable,StatusKamar statuskamar){
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.isAvailable = isAvailable;
        this.statuskamar = statuskamar;
        
    
    
    }
    
    public Hotel gethotel(){
        return hotel;
    }
    
    public String getNomorKamar(){
        return nomor_kamar;
    }
    
    public boolean getStatusAvailable(){
        return isAvailable;
    }
    
    public double getDailyTariff(){
        return dailyTariff;
    }
    public StatusKamar getStatusKamar(){
        return statuskamar;
    }
    public Pesanan getPesanan(){
        return pesan;
    }
    
    public abstract TipeKamar getTipeKamar();
    
    public void setHotel(Hotel hotel){
        this.hotel = hotel;
    }
    
    public void setNomorKamar(String nomor_kamar){
        this.nomor_kamar = nomor_kamar;
    }
    public void setStatusAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    public void setDailyTariff(double dailytariff){
        this.dailyTariff = dailytariff;
    }
    public void setStatusKamar(StatusKamar status_kamar){
        status_kamar = statuskamar;
    
    }
    public void setPesanan(Pesanan pesan){
        this.pesan = pesan;
    }
    
    public String toString(){
        if(isAvailable == true){
            return "Nama Hotel : "+hotel.getNama()+"Tipe Kamar : "+getTipeKamar()+"Harga  : "+dailyTariff+"Status Kamar : "+statuskamar;
            
            
        }
        else{
             return "Nama Hotel : "+hotel.getNama()+"Tipe Kamar : "+getTipeKamar()+"Harga  : "+dailyTariff+"Status Kamar : "+statuskamar+"Pelanggan : "+pesan;
        }
    }
    
}
