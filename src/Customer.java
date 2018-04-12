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
     
     public Customer(int id,String nama,int tanggal,int bulan,int tahun){
         this.id = id;
         this.nama = nama;
         dob = new Date(tahun,bulan,tanggal);
     
        }
        
     public Customer(int yourId,String yourName,GregorianCalendar time){
         yourId = id;
         yourName = nama;
         dob = new Date(time.get(Calendar.YEAR),time.get(Calendar.MONTH),time.get(Calendar.DATE));
         
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

        String print =  "\nCustomer ID    : "+id+
                        "\nName           : "+nama+
                        "\nE-Mail         : "+email+
                        "\nDate of Birth  : "+format.format(this.dob)+".\n";
        
        return print;
        }
    }
        

