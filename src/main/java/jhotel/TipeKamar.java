package jhotel;
/**
 * Enumeration class TipeKamar - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum TipeKamar
{
    Single("Single"),Double("Double"),Premium("Premium");
    
    private String tipekamar;
    
    TipeKamar(String tipekamar) {
        this.tipekamar = tipekamar;
    
    }
    
    public String toString(){
        return tipekamar;
    
    } 
    
}
