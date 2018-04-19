/**
 *   Class DatabaseCustomer.
 *
 * @author Akmal
 * @version 1.2
 * @since 1-3-18
 */
import java.util.*;
public class DatabaseCustomer
{
   private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<Customer>();
   private static int LAST_CUSTOMER_ID = 0;
   
   public static ArrayList<Customer> getCustomerDatabase(){
      return CUSTOMER_DATABASE;
   }
   
   public static int getLastCustomerID(){
    return LAST_CUSTOMER_ID;
   } 
   
   /**
     * Menambah Customer
     * @param baru Customer baru 
     * @return Status Customer baru
     */
   
   public static boolean addCustomer(Customer baru) throws PelangganSudahAdaException{
       int i;
       int w = 0;
        for(i=0;i<CUSTOMER_DATABASE.size();i++){
           if(CUSTOMER_DATABASE.get(i).getid() == baru.getid()  || CUSTOMER_DATABASE.get(i).getEmail().equals(baru.getEmail())){
                    w++;
                }
         }
        if(w==0){
            CUSTOMER_DATABASE.add(baru);
            LAST_CUSTOMER_ID = baru.getid();
            return true;
        } 
            try {
                return false;
            }catch (PelangganSudahAdaException)
    }
    
    /**
     * Mengambil customer
     * @param id Id dari pengguna yang akan diambil
     * @return Status penghapusan
     */
    
   public static Customer getCustomer(int id){
       int i;
        for(i=0;i<CUSTOMER_DATABASE.size();i++){
           if(CUSTOMER_DATABASE.get(i).getid() == id){
               return CUSTOMER_DATABASE.get(i);
            }
         }
       return null;
    
    }
    
    /**
     * Menunjukkan Customer database
     * @return String Menunjukkan nama customer
     */

   public static boolean removeCustomer(int id) throws PesananTidakDitemukanException{
       int i;
       DatabasePesanan dp = new DatabasePesanan();
        for(i=0;i<CUSTOMER_DATABASE.size();i++){
           if(CUSTOMER_DATABASE.get(i).getid() == id){
               dp.removePesanan(dp.getPesanan(id));
               CUSTOMER_DATABASE.remove(i);
               return true;
            }
         }
         try {
             return false;
         }catch (PesananTidakDitemukanException a){}
    }
}
