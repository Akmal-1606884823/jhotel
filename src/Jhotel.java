public class Jhotel
{
    public static void main(String[] args){

        DatabaseCustomer.addCustomer(new Customer("A",2,3,2003,"Akm@w.com"));
        DatabaseCustomer.addCustomer(new Customer("B",2,4,2003,"Akm@w.com"));
        DatabaseCustomer.addCustomer(new Customer("B",2,4,2003,"Akm@w.com"));

        DatabaseHotel.addHotel(new Hotel("N",new Lokasi(3,2,"HG"),87));
        DatabaseHotel.addHotel(new Hotel("ty",new Lokasi(4,2,"hh"),33));
        DatabaseHotel.addHotel(new Hotel("N",new Lokasi(3,2,"HG"),87));
        DatabaseHotel.addHotel(new Hotel("N",new Lokasi(3,2,"HG"),82));

        DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1),"12",true,StatusKamar.Vacant));
        DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2), "34", StatusKamar.Vacant));
        DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1),"12",true,StatusKamar.Vacant));
        DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2), "34", StatusKamar.Vacant));

        DatabasePesanan.addPesanan(new Pesanan(DatabaseCustomer.getCustomer(1),2.3));
        DatabasePesanan.addPesanan(new Pesanan(DatabaseCustomer.getCustomer(2),3.3));
        DatabasePesanan.addPesanan(new Pesanan(DatabaseCustomer.getCustomer(1),2.3));

        for (Customer pelanggan : DatabaseCustomer.getCustomerDatabase()){
            System.out.println(pelanggan);
        }

        for(Hotel hote : DatabaseHotel.getHotelDatabase()){
            System.out.println(hote);
        }
        for(Room roo : DatabaseRoom.getRoomDatabase()){
            System.out.println(roo);
        }
        for(Pesanan pes : DatabasePesanan.getPesananDatabase()){
            System.out.println(pes);
        }

        Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(1),DatabaseRoom.getRoom(DatabaseHotel.getHotel(1),"12"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(2),DatabaseRoom.getRoom(DatabaseHotel.getHotel(2),"34"));

        for(Pesanan pes : DatabasePesanan.getPesananDatabase()){
            System.out.println(pes);
        }

    }
    public Jhotel(){
    
    
    
    }
 
}
