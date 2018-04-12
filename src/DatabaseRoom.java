
/**
 * Write a description of class DatabaseRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class DatabaseRoom
{
    private ArrayList<Room> ROOM_DATABASE;
    
    public ArrayList<Room> getRoomDatabase(){
        return ROOM_DATABASE;
    }
    
    public boolean addRoom(Room baru){
        if(baru.gethotel() != null){
            int i;
            int w = 0;
            for(i=0;i<ROOM_DATABASE.size();i++){
                if(ROOM_DATABASE.get(i).getNomorKamar()==baru.getNomorKamar()){
                    w++;
                }
            }
            if(w == 0){
            ROOM_DATABASE.add(baru);
            return true;
            }
        }
        return false;
    }
    
    public Room getRoom(Hotel hotel,String nomor_kamar){
        int i;
        int w = 0;
        for(i=0;i<ROOM_DATABASE.size();i++){
            if(ROOM_DATABASE.get(i).getNomorKamar()==nomor_kamar){
                    return ROOM_DATABASE.get(i);
             }
         }
        return null;
    }
    
    public ArrayList<Room> getRoomFromHotel(Hotel hotel){
        ArrayList<Room> listhotel = new ArrayList<Room>(); 
        int i;
        int w = 0;
        for(i=0;i<ROOM_DATABASE.size();i++){
            if(ROOM_DATABASE.get(i).gethotel()==hotel){
                    listhotel.add(ROOM_DATABASE.get(i));
             }
         }
         return listhotel;
    }
    
    public ArrayList<Room> getVacantRooms(){
       
        return ROOM_DATABASE;
    }
    
    public boolean removeRoom(Hotel hotel,String nomor_kamar){
        
        return false;
    }
 
}
