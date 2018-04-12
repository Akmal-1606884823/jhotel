
/**
 * Write a description of class PremiumRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumRoom extends Room
{
    private double DISCOUNT = 0.3;
    private static final TipeKamar TIPE_KAMAR = TipeKamar.Premium;
    
    public PremiumRoom(Hotel hotel,String nomor_kamar,StatusKamar status_kamar){
        super(hotel,nomor_kamar,status_kamar);
    }
    
    public TipeKamar getTipeKamar(){
        return TIPE_KAMAR;
    }
    
    public double getDiscount(){
        return DISCOUNT;
    
    }
    
    public void setDailyTariff(double dailytariff){
        setDailyTariff(dailytariff*(1-DISCOUNT));
    }
   
}
