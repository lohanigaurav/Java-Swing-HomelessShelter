/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Homeless;

import Business.Employee.*;

/**
 *
 * @author raunak
 */
public class Homeless {
    
    
    private String name;
    private int age;
    private String location;
    private String gender;
    private boolean clothingRequired;
    private boolean treatmentRequired;
    private boolean foodRequired;
    private boolean criminalRecord;
    private int id;

   

    
    
     public Homeless(int id,String name, int age, String location, String gender,
             boolean clothingRequired,boolean treatmentRequired,boolean foodRequired,boolean criminalRecord) 
     {
        this.id=id;
        this.name = name;
        this.age = age;
        this.location = location;
        this.gender = gender;
        this.clothingRequired = clothingRequired;
        this.treatmentRequired = treatmentRequired;
        this.foodRequired = foodRequired;
        this.criminalRecord = criminalRecord;
     
     }

    Homeless() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isClothingRequired() {
        return clothingRequired;
    }

    public void setClothingRequired(boolean clothingRequired) {
        this.clothingRequired = clothingRequired;
    }

    public boolean isTreatmentRequired() {
        return treatmentRequired;
    }

    public void setTreatmentRequired(boolean treatmentRequired) {
        this.treatmentRequired = treatmentRequired;
    }

    public boolean isFoodRequired() {
        return foodRequired;
    }

    public void setFoodRequired(boolean foodRequired) {
        this.foodRequired = foodRequired;
    }

    public boolean isCriminalRecord() {
        return criminalRecord;
    }

    public void setCriminalRecord(boolean criminalRecord) {
        this.criminalRecord = criminalRecord;
    }
    
 @Override
    public String toString() {
        return String.valueOf(this.getId()); 
        
    }
    
   
   
    
    
}
