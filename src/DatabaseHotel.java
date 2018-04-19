
/**
 * Write a description of class DatabaseHotel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class DatabaseHotel
{
   private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<Hotel> ();
   private static int LAST_HOTEL_ID = 0;
   
   public static ArrayList<Hotel> getHotelDatabase(){
      return HOTEL_DATABASE;
   }
    
   public static int getLastHotelID(){
    return LAST_HOTEL_ID;
   }

   public static boolean addHotel(Hotel baru) throws HotelSudahAdaException{
       int besar = HOTEL_DATABASE.size();
       int i= 0;
       int w= 0;
       
       for(i=0;i<besar;i++){
           
               if(HOTEL_DATABASE.get(i).getID() == (baru.getID()) || HOTEL_DATABASE.get(i).getLokasi().equals(baru.getLokasi())){
                   w++;
                }
        }
       if (w>0){
           return false;
           throw new HotelSudahAdaException(baru);
        }
       else{
       HOTEL_DATABASE.add(baru);
       LAST_HOTEL_ID = baru.getID();
       return true ;
      }
    }
    
   public static Hotel getHotel(int id){
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
    
   public static boolean removeHotel(int id)throws HotelTidakDitemukanException{
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
       throw new HotelTidakDitemukanException(id);
    }
   
   
}
