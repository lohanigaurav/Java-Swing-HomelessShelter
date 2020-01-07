/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {
    private String name1;
    private String message;
    private UserAccount sender;
    private UserAccount receiver;

    private String name;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private String id;
    private int age;
    private String location;
    private String gender;

   
    
     private boolean cloth;
      private boolean treatment;
       private boolean food;
        private boolean criminal;
       
        private String jacket;
        private String thermal;
        private String bottomWear;
        private String topWear;

  private String clothCost;
      
         private String breakfast;
        private String lunch;
        private String snacks;
        private String dinner;
         private String foodCost;
         private String testtype;
         
   private String totalCost;
    private String shelterLocation;
    private int labbill;
    private int doctorbill;
    private String claimed;

    public String getClaimed() {
        return claimed;
    }

    public void setClaimed(String claimed) {
        this.claimed = claimed;
    }

    public int getLabbill() {
        return labbill;
    }

    public void setLabbill(int labbill) {
        this.labbill = labbill;
    }

    public int getDoctorbill() {
        return doctorbill;
    }

    public void setDoctorbill(int doctorbill) {
        this.doctorbill = doctorbill;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(String totalCost) {
        this.totalCost = totalCost;
    }

    public String getShelterLocation() {
        return shelterLocation;
    }

    public void setShelterLocation(String shelterLocation) {
        this.shelterLocation = shelterLocation;
    }
         

    public String getTesttype() {
        return testtype;
    }

    public void setTesttype(String testtype) {
        this.testtype = testtype;
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
            public String getClothCost() {
        return clothCost;
    }

    public void setClothCost(String clothCost) {
        this.clothCost = clothCost;
    }
       
    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getLunch() {
        return lunch;
    }

    public void setLunch(String lunch) {
        this.lunch = lunch;
    }

    public String getSnacks() {
        return snacks;
    }

    public void setSnacks(String snacks) {
        this.snacks = snacks;
    }

    public String getDinner() {
        return dinner;
    }

    public void setDinner(String dinner) {
        this.dinner = dinner;
    }
       

    public String getJacket() {
        return jacket;
    }

    public void setJacket(String jacket) {
        this.jacket = jacket;
    }

    public String getThermal() {
        return thermal;
    }

    public void setThermal(String thermal) {
        this.thermal = thermal;
    }

    public String getBottomWear() {
        return bottomWear;
    }

    public void setBottomWear(String bottomWear) {
        this.bottomWear = bottomWear;
    }

    public String getTopWear() {
        return topWear;
    }

    public void setTopWear(String topWear) {
        this.topWear = topWear;
    }

   
    public String getFoodCost() {
        return foodCost;
    }

    public void setFoodCost(String foodCost) {
        this.foodCost = foodCost;
    }
        
    public boolean getCloth() {
        return cloth;
    }

    public void setCloth(boolean cloth) {
        this.cloth = cloth;
    }

    public boolean getTreatment() {
        return treatment;
    }

    public void setTreatment(boolean treatment) {
        this.treatment = treatment;
    }

    public boolean getFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean getCriminal() {
        return criminal;
    }

    public void setCriminal(boolean criminal) {
        this.criminal = criminal;
    }
   
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
     public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
     
 @Override
    public String toString() {
        return this.getId(); 
        
    }
    
    
    
    
    
}
