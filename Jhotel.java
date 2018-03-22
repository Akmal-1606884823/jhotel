public class Jhotel
{
    public void main(String[] args){
        /*
        Lokasi l = new Lokasi (12,13,"Pantai");
        Hotel h = new Hotel ("akmal",l,12);
        Customer c = new Customer (15,"Alaska");
        Room s = new SingleRoom(h,"45",true,StatusKamar.Vacant);
        Pesanan p = new Pesanan (c,s);
        Administrasi a = new Administrasi();
        
        l.printData();
        c.printData();
        h.printData();
        
        a.pesananDitugaskan(p,s);
        
        s.printData();
        p.printData();
        
        if(s instanceof DoubleRoom){
            System.out.println("Benar Double Room");
        }
        
        else if (s instanceof SingleRoom){
            System.out.println("Salah, Bukan Double Room");
        }
        
        
        Room w = new DoubleRoom(h,"98",true,StatusKamar.Booked);
        w.setDailyTariff(15);
        Pesanan wa = new Pesanan (c,s);
        wa.setJumlahHari(12);
        
        
        a.pesananDitugaskan(wa,w);
        wa.setBiaya();
        
        w.printData();
        wa.printData();
        
        if(w instanceof DoubleRoom){
            System.out.println("Benar Double Room");
        }
        
        else if (w instanceof SingleRoom){
            System.out.println("Salah, Bukan Double Room");
        }
        */
       Lokasi lok = new Lokasi(12,23,"Pantai");
       Hotel ho = new Hotel("ak",lok,2);
       Room ro = new SingleRoom(ho,"23",true,StatusKamar.Booked);
       Customer cus = new Customer(12,"ka",11,22,2011);
       Pesanan pes = new Pesanan(cus,ro);
       
       System.out.println(cus);
       System.out.println(ro);
       System.out.println(pes);
       
       
       

    }
    public Jhotel(){
    
    
    
    }
 
}
