package jhotel;

import javax.xml.crypto.Data;
import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jhotel
{
    public static void main(String[] args){
        Lokasi loo = new Lokasi(23,14,"NN");
        try{
        DatabaseHotel.addHotel(new Hotel("A",loo, 5));
        DatabaseHotel.addHotel(new Hotel("B",loo, 5));
        DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1),"12"));
        DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(1),"13"));
        DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(2),"23"));
	}
	catch(Exception e)
	{}
        SpringApplication.run(Jhotel.class, args);

    }
    public Jhotel(){
    
    }
 
}
