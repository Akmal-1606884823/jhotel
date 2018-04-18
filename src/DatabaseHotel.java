
/**
 * Write a description of class DatabaseHotel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class DatabaseHotel
{
   private ArrayList<Hotel> HOTEL_DATABASE; 
   private int LAST_HOTEL_ID;
   
   public ArrayList<Hotel> getHotelDatabase(){
      return HOTEL_DATABASE;
   }
    
   public int getLastHotelID(){
    int x = HOTEL_DATABASE.size();
    int m = HOTEL_DATABASE.get(x-1).getID();
    
    return m;
   } 
   public boolean addHotel(Hotel baru){
       int besar = HOTEL_DATABASE.size();
       int i= 0;
       int w= 0;
       
       for(i=0;i<besar;i++){
           
               if(HOTEL_DATABASE.get(i).getID() == (baru.getID())){
                   w++;
                }
        }
       if (w>0){
           return false;
        }
       else{
       HOTEL_DATABASE.add(baru);
       LAST_HOTEL_ID = baru.getID();
       return true ;
      }
    }
    
   public Hotel getHotel(int id){
       int besar = HOTEL_DATABASE.size();
       int i= 0;
       int w= 0;
       
       for(i=0;i<besar;i++){
           if(HOTEL_DATABASE.get(i).getID() == id){
               return HOTEL_DATABASE.get(i);
            }
        }
        return null;
   }
    
   public boolean removeHotel(int id){
       DatabaseRoom dr = new DatabaseRoom();
       int besar = HOTEL_DATABASE.size();
       int i= 0;
       int w= 0;
       int bdathot = dr.getRoomFromHotel(getHotel(id)).size();
       for(i=0;i<besar;i++){
           if(HOTEL_DATABASE.get(i).getID() == id){
              for(w=0;w<bdathot;w++){
                
                  dr.removeRoom(HOTEL_DATABASE.get(i),dr.getRoomFromHotel(getHotel(id)).get(w).getNomorKamar());
                  return true;
              }
              
            }
        }
       
       return false;
    }
   
   
}
