package Business.Homeless;

import Business.Employee.*;

/**
 *
 * @author raunak
 */
public class Shelter {
   
   
    private String name;
    private int id;
    private String shelterLocation;

   

   
   
     public Shelter(int id,String name,String shelterlocation)
     {
        this.id=id;
        this.name = name;
       this.shelterLocation=shelterlocation;
     
     }

    public String getShelterLocation() {
        return shelterLocation;
    }

    public void setShelterLocation(String shelterLocation) {
        this.shelterLocation = shelterLocation;
    }

    Shelter() {
        //To change body of generated methods, choose Tools | Templates.
    }
     
   
 public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
 @Override
    public String toString() {
        return String.valueOf(this.getId());
       
    }
   
   
   
   
   
}