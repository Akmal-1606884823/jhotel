package controller.jhotel;

import jhotel.*;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HotelController {

    @RequestMapping("getlist/")
    public ArrayList<Hotel> hotelsList(){
        return DatabaseHotel.getHotelDatabase();
    }
    @RequestMapping("getlist/id")
    public Hotel getHotel(@RequestParam int id_hotel){
        return DatabaseHotel.getHotelDatabase().get(id);
    }
}
