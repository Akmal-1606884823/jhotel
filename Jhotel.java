public class Jhotel
{
    public void main(String[] args){
        
        Lokasi nLok = new Lokasi (12,32,"Pantai");
        Hotel nHot = new Hotel ("Akm",nLok,2);
        Customer nCus = new Customer (13,"Akma");
        Pesanan nPes = new Pesanan (45,nCus);
        Room nRoo = new Room (nHot,"12A",true);
        nRoo.setPesanan(nPes);
        nRoo.setCustomer(nCus);
        nPes.setTipeKamar(TipeKamar.Double);
        
        Administrasi nAdm = new Administrasi ();
        
        System.out.println("Sebelum method 1");
        nPes.printData();
        nRoo.printData();
        
        nAdm.pesananDitugaskan(nPes,nRoo);
        
        System.out.println("");
        
        System.out.println("Setelah Method 1");
        
        nPes.printData();
        nRoo.printData();
        
        System.out.println("");
        System.out.println("");
      
        
        
        nLok.setX(12);
        nLok.setY(32);
        nLok.setDeskripsi("Pantai");
        
        nHot.setNama("Akm");
        nHot.setLokasi(nLok);
        nHot.setBintang(2);
        
        nCus.setID(13);
        nCus.setNama("Akma");
        
        nPes.setBiaya(45);
        nPes.setPelanggan(nCus);
        
        nRoo.setHotel(nHot);
        nRoo.setNomorKamar("12A");
        nRoo.setStatusAvailable(true);
        
        nRoo.setPesanan(nPes);
        nRoo.setCustomer(nCus);
        nPes.setTipeKamar(TipeKamar.Double);
        
        
        
        
        System.out.println("Sebelum method 2");
        nPes.printData();
        nRoo.printData();
        
        nAdm.pesananDibatalkan(nRoo);
        
        System.out.println("");
        
        System.out.println("Setelah Method 2");
        
        nPes.printData();
        nRoo.printData();
        
        System.out.println("");
        System.out.println("");
        
        
        nLok.setX(12);
        nLok.setY(32);
        nLok.setDeskripsi("Pantai");
        
        nHot.setNama("Akm");
        nHot.setLokasi(nLok);
        nHot.setBintang(2);
        
        nCus.setID(13);
        nCus.setNama("Akma");
        
        nPes.setBiaya(45);
        nPes.setPelanggan(nCus);
        
        nRoo.setHotel(nHot);
        nRoo.setNomorKamar("12A");
        nRoo.setStatusAvailable(true);
        
        nRoo.setPesanan(nPes);
        nRoo.setCustomer(nCus);
        nPes.setTipeKamar(TipeKamar.Double);
        
        
        System.out.println("Sebelum method 3");
        nPes.printData();
        nRoo.printData();
        
        nAdm.pesananSelesai(nRoo);
        
        System.out.println("");
        
        System.out.println("Setelah Method 3");
        
        nPes.printData();
        nRoo.printData();
        
        System.out.println("");
        System.out.println("");
        
        
        nLok.setX(12);
        nLok.setY(32);
        nLok.setDeskripsi("Pantai");
        
        nHot.setNama("Akm");
        nHot.setLokasi(nLok);
        nHot.setBintang(2);
        
        nCus.setID(13);
        nCus.setNama("Akma");
        
        nPes.setBiaya(45);
        nPes.setPelanggan(nCus);
        
        nRoo.setHotel(nHot);
        nRoo.setNomorKamar("12A");
        nRoo.setStatusAvailable(true);
        
        nRoo.setPesanan(nPes);
        nRoo.setCustomer(nCus);
        nPes.setTipeKamar(TipeKamar.Double);
        
        
        
        System.out.println("Sebelum method 4");
        nPes.printData();
        nRoo.printData();
        
        nAdm.pesananDibatalkan(nPes);
        
        System.out.println("");
        
        System.out.println("Setelah Method 4");
        
        nPes.printData();
        nRoo.printData();
        
        System.out.println("");
        System.out.println("");
        
        
        nLok.setX(12);
        nLok.setY(32);
        nLok.setDeskripsi("Pantai");
        
        nHot.setNama("Akm");
        nHot.setLokasi(nLok);
        nHot.setBintang(2);
        
        nCus.setID(13);
        nCus.setNama("Akma");
        
        nPes.setBiaya(45);
        nPes.setPelanggan(nCus);
        
        nRoo.setHotel(nHot);
        nRoo.setNomorKamar("12A");
        nRoo.setStatusAvailable(true);
        
        nRoo.setPesanan(nPes);
        nRoo.setCustomer(nCus);
        nPes.setTipeKamar(TipeKamar.Double);
        
        
        System.out.println("Sebelum method 5");
        nPes.printData();
        nRoo.printData();
        
        nAdm.pesananSelesai(nPes);
        
        System.out.println("");
        
        System.out.println("Setelah Method 5");
        
        nPes.printData();
        nRoo.printData();
        
        
    }
    public Jhotel(){
    
    
    
    }
 
}
