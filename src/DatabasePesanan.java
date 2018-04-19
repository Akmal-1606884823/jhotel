/**
 *   Class DatabasePesanan.
 *
 * @author Akmal
 * @version 1.2
 * @since 1-3-18
 */
import java.util.*;
public class DatabasePesanan
{
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<Pesanan> ();
    private static int LAST_PESANAN_ID;
    
    public static ArrayList<Pesanan> getPesananDatabase(){
    
        return PESANAN_DATABASE;
    }
    
    public static int getLastPesananID(){
        return LAST_PESANAN_ID;
    }
    
    
    /**
     * Menambah pesanan
     * @return Untuk status apakah true atau tidak
     */
    public static  boolean addPesanan(Pesanan baru) throws PesananSudahAdaException{
        
        int besar = PESANAN_DATABASE.size();
        int i= 0;
        int w= 0;
        for(i=0;i<besar;i++){
            
            if(PESANAN_DATABASE.get(i).getStatusAktif() == true){
               if(PESANAN_DATABASE.get(i).getID() == baru.getID()){
                   w++;
                }
            }
        }
        if(w>0){
            return false;
            throw new PesananSudahAdaException(baru);
        }
        else{
            PESANAN_DATABASE.add(baru);
            LAST_PESANAN_ID = baru.getID();
            return true;
        }
        
    }
    
    public static Pesanan getPesanan(int id){
       int besar = PESANAN_DATABASE.size();
       int i= 0;
       int w= 0;
       for(i=0;i<besar;i++){
             if(PESANAN_DATABASE.get(i).getID() == id){
                   return PESANAN_DATABASE.get(i);
                }
        }
        return null;
    }
    
    public static Pesanan getPesanan(Room kamar){
       int besar = PESANAN_DATABASE.size();
       int i= 0;
       for(i=0;i<besar;i++){
             if(PESANAN_DATABASE.get(i).getRoom() == kamar){
                   return PESANAN_DATABASE.get(i);
                }
        }
        return null;
    }
    
    public static Pesanan getPesananAktif(Customer pelanggan){
       int besar = PESANAN_DATABASE.size();
       int i= 0;
       for(i=0;i<besar;i++){
             if(PESANAN_DATABASE.get(i).getStatusAktif() && PESANAN_DATABASE.get(i).getPelanggan().equals(pelanggan)){
                   return PESANAN_DATABASE.get(i);
                }
        }
        return null;
    }
    
    /**
     * Menghapus pesanan
     * @return Untuk status apakah true atau tidak
     */

    public static  boolean removePesanan(Pesanan pesan) throws PesananTidakDitemukanException{
       int i= 0;
       for(i=0;i<PESANAN_DATABASE.size();i++){
             if(PESANAN_DATABASE.get(i).equals(pesan)){
                   if(PESANAN_DATABASE.get(i).getRoom() != null){
                       Administrasi a = new Administrasi();
                       a.pesananDibatalkan(PESANAN_DATABASE.get(i).getRoom());
                       PESANAN_DATABASE.remove(i);
                       return true;
                    }
                   else if(PESANAN_DATABASE.get(i).getStatusAktif() == true){
                       PESANAN_DATABASE.get(i).setStatusAktif(false);
                       PESANAN_DATABASE.remove(i);
                       return true;
                    }
                }
        }
    
        return false;
        throw new PesananTidakDitemukanException(pesan.getPelanggan());
    }
    
    /**
     * Menunjukkan pesanan
     * @return Untuk menambah pesanan
     * @param cust untuk menerima informasi customer
     */


}
