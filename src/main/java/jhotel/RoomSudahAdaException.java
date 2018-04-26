package jhotel;
public class RoomSudahAdaException extends Exception {

    private Room room_error;

    public RoomSudahAdaException(Room room_input){
        super("Kamar dengan nomor Ruang : ");
        room_error = room_input;
    }

    public String getPesan(){

        return super.getMessage() + room_error.getNomorKamar() + " Pada " + room_error.gethotel() +" sudah terdaftar ";
    }
}
