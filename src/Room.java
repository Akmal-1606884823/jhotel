
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
    protected double dailyTariff;
    private StatusKamar statuskamar;
    private Pesanan pesan;
    
    public Room (Hotel hotel,String nomor_kamar,StatusKamar statuskamar){
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.statuskamar = statuskamar;
        
    
    
    }
    
    public Hotel gethotel(){
        return hotel;
    }
    
    public String getNomorKamar(){
        return nomor_kamar;
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
        if(true){
            String print = "\nNama Hotel : "+hotel.getNama()+
                           "\nTipe Kamar : "+getTipeKamar()+
                           "\nHarga : "+dailyTariff+
                           "\nStatus Kamar : "+statuskamar+".\n";
                           
            return print;
        }
        else{
             String print = "\nNama Hotel : "+hotel.getNama()+
                            "\nTipe Kamar : "+getTipeKamar()+
                            "\nHarga : "+dailyTariff+
                            "\nStatus Kamar : "+statuskamar+
                            "\nPelanggan"+pesan+".\n";
                            
             return print;
        }
    }
    
}