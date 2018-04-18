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
   private ArrayList<Customer> CUSTOMER_DATABASE; 
   private int LAST_CUSTOMER_ID = 0;
   
   public ArrayList<Customer> getCustomerDatabase(){
      return CUSTOMER_DATABASE;
   }
   
   public int getLastCustomerID(){
    int x = CUSTOMER_DATABASE.size();
    int m = CUSTOMER_DATABASE.get(x-1).getid();
    
    return m;
   } 
   
   /**
     * Menambah Customer
     * @param baru Customer baru 
     * @return Status Customer baru
     */
   
   public boolean addCustomer(Customer baru){
       int i;
       int w = 0;
        for(i=0;i<CUSTOMER_DATABASE.size();i++){
           if(CUSTOMER_DATABASE.get(i).getid() == baru.getid()){
                    w++;
                }
         }
        if(w==0){
            CUSTOMER_DATABASE.add(baru);
            LAST_CUSTOMER_ID = baru.getid();
            return true;
        } 
       
       return false;
    
    }
    
    /**
     * Mengambil customer
     * @param id Id dari pengguna yang akan diambil
     * @return Status penghapusan
     */
    
   public Customer getCustomer(int id){
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

   public boolean removeCustomer(int id){
       int i;
       DatabasePesanan dp = new DatabasePesanan();
        for(i=0;i<CUSTOMER_DATABASE.size();i++){
           if(CUSTOMER_DATABASE.get(i).getid() == id){
               dp.removePesanan(dp.getPesanan(id));
               CUSTOMER_DATABASE.remove(i);
               return true;
            }
         }
       return false ;
    }
}
