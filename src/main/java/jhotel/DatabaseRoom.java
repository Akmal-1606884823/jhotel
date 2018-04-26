package jhotel;
/**
 * Write a description of class DatabaseRoom here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class DatabaseRoom
{
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<Room> ();
    
    public static ArrayList<Room> getRoomDatabase(){
        return ROOM_DATABASE;
    }
    
    public static boolean addRoom(Room baru) throws RoomSudahAdaException{
        if(baru.gethotel() != null){
            int i;
            int w = 0;
            for(i=0;i<ROOM_DATABASE.size();i++){
                if(ROOM_DATABASE.get(i).getNomorKamar().equals(baru.getNomorKamar())){
                    w++;
                }
            }
            if(w == 0){
            ROOM_DATABASE.add(baru);
            return true;
            }
        }
        throw new RoomSudahAdaException(baru);

    }
    
    public static Room getRoom(Hotel hotel,String nomor_kamar){
        int i;
        int w = 0;
        for(i=0;i<ROOM_DATABASE.size();i++){
            if(ROOM_DATABASE.get(i).getNomorKamar().equals(nomor_kamar)){
                    return ROOM_DATABASE.get(i);
             }
         }
        return null;
    }
    
    public static ArrayList<Room> getRoomFromHotel(Hotel hotel){
        ArrayList<Room> listhotel = new ArrayList<Room>(); 
        int i;
        int w = 0;
        for(i=0;i<ROOM_DATABASE.size();i++){
            if(ROOM_DATABASE.get(i).gethotel().equals(hotel)){
                    listhotel.add(ROOM_DATABASE.get(i));
             }
         }
         return listhotel;
    }
    
    public static ArrayList<Room> getVacantRooms(){
       ArrayList<Room> list_vacant = new ArrayList<Room>(); 
        int i;
        for(i=0;i<ROOM_DATABASE.size();i++){
            if(ROOM_DATABASE.get(i).getStatusKamar().equals("Vacant")){
                    list_vacant.add(ROOM_DATABASE.get(i));
             }
         }
        return list_vacant;
    }
    
    public static boolean removeRoom(Hotel hotel,String nomor_kamar)throws RoomTidakDitemukanException{
        int i;
        Administrasi a = new Administrasi();
        for(i=0;i<ROOM_DATABASE.size();i++){
            if(ROOM_DATABASE.get(i).getNomorKamar().equals(nomor_kamar)){
                    a.pesananDibatalkan(ROOM_DATABASE.get(i));
                    ROOM_DATABASE.remove(i);
                    return true;
             }
         }
         throw new RoomTidakDitemukanException(hotel,nomor_kamar);

    }
 
}
