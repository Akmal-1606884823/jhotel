package controller.jhotel;

import jhotel.*;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RoomController {

    @RequestMapping("/getlist")
    public ArrayList<Room> vacantRooms(){
        return DatabaseRoom.getVacantRooms();
    }
    @RequestMapping("getroom/id")
    public Hotel getRoom(@RequestParam int id , @RequestParam String nomor_kamar){
        return DatabaseRoom.getRoom(id,nomor_kamar);
    }

}
