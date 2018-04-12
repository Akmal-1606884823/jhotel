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
    private ArrayList<Pesanan> PESANAN_DATABASE;
    private int LAST_PESANAN_ID;
    
    public ArrayList<Pesanan> getPesananDatabase(){
    
        return PESANAN_DATABASE;
    }
    
    public int getLastPesananID(){
        int x = PESANAN_DATABASE.size();
        int m = PESANAN_DATABASE.get(x-1).getID();
    
        return m;
    }
    
    
    /**
     * Menambah pesanan
     * @return Untuk status apakah true atau tidak
     */
    public boolean addPesanan(Pesanan baru){
        
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
            
        }
        else{
            PESANAN_DATABASE.add(baru);
            return true;
        }
        
    }
    
    public Pesanan getPesanan(int id){
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
    
    public Pesanan getPesanan(Room kamar){
       int besar = PESANAN_DATABASE.size();
       int i= 0;
       for(i=0;i<besar;i++){
             if(PESANAN_DATABASE.get(i).getRoom() == kamar){
                   return PESANAN_DATABASE.get(i);
                }
        }
        return null;
    }
    
    public Pesanan getPesananAktif(){
       int besar = PESANAN_DATABASE.size();
       int i= 0;
       for(i=0;i<besar;i++){
             if(PESANAN_DATABASE.get(i).getStatusAktif() == true){
                   return PESANAN_DATABASE.get(i);
                }
        }
        return null;
    }
    
    /**
     * Menghapus pesanan
     * @return Untuk status apakah true atau tidak
     */

    public boolean removePesanan(Pesanan pesan){
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
    
    }
    
    /**
     * Menunjukkan pesanan
     * @return Untuk menambah pesanan
     * @param cust untuk menerima informasi customer
     */

    public Pesanan getPesanan(Customer cust){
    
       return null; 
    }
    
     /**
     * Menunjukkan database pesanan
     * @return Untuk menampilkan databasepesanan
     */
    
    
    public void pesananDibatalkan (Pesanan pesan){
    

    }
}
