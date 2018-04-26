package controller.jhotel;

import jhotel.*;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PesananController {

    @RequestMapping("getPesanan")
    public Pesanan pesananCust(int id_customer){
        Pesanan pesan = DatabasePesanan.getPesanan(id_customer);
        return pesan;
    }
    @RequestMapping("getPesanan")
    public Pesanan pesananCust(int id_pesanan){
        Pesanan pesan = DatabasePesanan.getPesanan(id_pesanan);
        return pesan;
    }
    @RequestMapping("buatPesanan")
    public Pesanan buatPesanan(int jumlah_hari,int id_customer,int id_hotel,String nomor_kamar){
        Pesanan pesan = DatabasePesanan.addPesanan(new Pesanan(jhotel.DatabaseCustomer.getCustomer(id_customer),DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel),jumlah_hari)));
        DatabasePesanan.getPesanan(DatabasePesanan.getLastPesananID());
        return pesan;
    }

    @RequestMapping("batalPesanan")
    public Pesanan batalkanPesanan(int id_pesanan){
        Pesanan pesan = DatabasePesanan.getPesanan(id_pesanan);
        Administrasi.PesananDibatalkan(DatabasePesanan.getPesanan(id_pesanan));
        return pesan;
    }

    @RequestMapping("selesaiPesanan")
    public Pesanan selesaikanPesanan(int id_pesanan){
        Pesanan pesan = DatabasePesanan.getPesanan(id_pesanan);
        Administrasi.pesananSelesai(DatabasePesanan.getPesanan(id_pesanan));
        return pesan;
    }


}
