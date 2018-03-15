/**
 *   Class Customer.
 *
 * @author Akmal
 * @version 1.2
 * @since 1-3-18
 */

public class Customer
{

     protected int id;
     protected String nama;
     
     /**
      * Constructor untuk Customer
      */
     
     public Customer(int id,String nama){
         this.id = id;
         this.nama = nama;
         
     
        }
        
        /**
         * Menunjukkan Id
         * @return Untuk menampilkan id
         */   
        
     public int getid(){

        return id;
        
        }
        
        /**
         * Menunjukkan nama
         * @return Untuk menampilkan nama 
         */   
        

     public String getNama(){

        
        return nama;
        }
        
        /**
         * Menetapkan Id
         * @param id Untuk menetapkan id
         */   
    
     public void setID(int id){
        
         this.id = id;

       }
    
        /**
         * Menetapkan nama
         * @param nama Untuk menetapkan nama
         */  
      
     public void setNama(String nama){
        
        this.nama = nama;
       }
       
     public void printData(){
         System.out.println("Customer");
         System.out.println("");
         System.out.println("Maka nama Customer : "+nama);
         System.out.println("Maka ID customer adalah : "+id);
         System.out.println("");
    
     }
    }
        

