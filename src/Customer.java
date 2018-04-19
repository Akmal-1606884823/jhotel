/**
 *   Class Customer.
 *
 * @author Akmal
 * @version 1.2
 * @since 1-3-18
 */
import java.util.Date;
import java.util.Date.*;
import java.util.regex.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class Customer
{

     protected int id;
     protected String nama;
     protected String email;
     protected Date dob;
     
     /**
      * Constructor untuk Customer
      */
     
     public Customer(String nama,int tanggal,int bulan,int tahun,String ema){
         DatabaseCustomer dc = new DatabaseCustomer();
         id = dc.getLastCustomerID() + 1;
         this.nama = nama;
         dob = new Date(tahun,bulan,tanggal);
         setEmail(ema);
     
        }
        
     public Customer(String yourName,GregorianCalendar time,String ema){
         DatabaseCustomer dc = new DatabaseCustomer();
         id = dc.getLastCustomerID() + 1;
         yourName = nama;
         dob = new Date(time.get(Calendar.YEAR),time.get(Calendar.MONTH),time.get(Calendar.DATE));
         setEmail(ema);
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
        
     public String getEmail(){
        return email;
        }
        
     public void getDob(){
        
         System.out.printf("%1$s %2$tB %2$td,%2$tY","Tanggal : ",dob);
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
       
     public void setEmail(String email){
        Pattern pattern = Pattern.compile("/[a-z]{2}\\-[0-9]{3}", 5);
        Matcher matcher = pattern.matcher("aa098hkasjdh786sda sdb76ads");

        while (matcher.find())
        {
            System.out.println(matcher.group()+"");
        }
         
         this.email = email;
        }
        
     public void setDOB(Date dob){
        this.dob =dob;
        }
       
     public String toString(){
        SimpleDateFormat format = new SimpleDateFormat("dd MMMM yyyy");
        if(DatabasePesanan.getPesanan(id) != null){
        String print =  "\nCustomer ID    : "+id+
                        "\nName           : "+nama+
                        "\nE-Mail         : "+email+
                        "\nDate of Birth  : "+format.format(this.dob)+
                        "\n Booking order is in progress\n";
        return print;
       }
       else{
           String print =  "\nCustomer ID    : "+id+
                        "\nName           : "+nama+
                        "\nE-Mail         : "+email+
                        "\nDate of Birth  : "+format.format(this.dob)+
                        "\n";
           return print;
        }
    }    
}
