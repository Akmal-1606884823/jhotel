package jhotel;
/**
 *   Class DatabasePesanan.
 *
 * @author Akmal
 * @version 1.2
 * @since 1-3-18
 */

import java.util.ArrayList;
import java.util.Scanner;

public class DatabasePesanan
{
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<>();
    private static int LAST_PESANAN_ID = 0;
    
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
                throw new PesananSudahAdaException(baru);
            }
        }
            PESANAN_DATABASE.add(baru);
            LAST_PESANAN_ID = baru.getID();
            return true;
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
             if(PESANAN_DATABASE.get(i).getRoom() == kamar && PESANAN_DATABASE.get(i).getStatusAktif()){
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

    public static  boolean removePesanan(Pesanan pesan){
        if (pesan.getStatusDiproses())
        {
            Administrasi.pesananDibatalkan(pesan);
        }
        return PESANAN_DATABASE.remove(pesan);
    }

    public static boolean removePesanan(Customer pelanggan) throws PesananTidakDitemukanException
    {
        boolean test = false;

        for (Pesanan var : PESANAN_DATABASE)
        {
            if (var.getPelanggan().equals(pelanggan))
            {
                test = true;
            }
        }

        if (test)
        {
            PESANAN_DATABASE.remove(pelanggan.getid());
            return true;

        }

        throw new PesananTidakDitemukanException(pelanggan);
    }

    
    /**
     * Menunjukkan pesanan
     * @return Untuk menambah pesanan
     * @param cust untuk menerima informasi customer
     */


}
