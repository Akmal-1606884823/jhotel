
/**
 * Write a description of class Room here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Room
{
    private Hotel hotel;
    private int id;
    private String nomor_kamar;
    private boolean isAvailable;
    private Customer customer;
    private double dailyTariff;
    private StatusKamar statuskamar;
    private Pesanan pesan;
    
    public Hotel gethotel(){
        return hotel;
    }
    
    public int getID(){
        return id;
    }
    
    public String getNomorKamar(){
        return nomor_kamar;
    }
    
    public boolean getStatusAvailable(){
        return isAvailable;
    }
    
    public Customer getCustomer(){
        return customer;
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
    public void setHotel(Hotel hotel){
        this.hotel = hotel;
    }
    public void setID(int id){
        this.id = id;
    }
    public void setNomorKamar(String nomor_kamar){
        this.nomor_kamar = nomor_kamar;
    }
    public void setStatusAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
    public void setCustomer(Customer customer){
        this.customer = customer;
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
    public void printData(){
        System.out.println(nomor_kamar);
        System.out.println(statuskamar);
        
        
    
    }
    
    
    
    
    
    
    
}