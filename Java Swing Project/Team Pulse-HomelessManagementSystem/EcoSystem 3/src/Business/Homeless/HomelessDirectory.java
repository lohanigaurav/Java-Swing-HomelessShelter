/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Homeless;

import Business.Homeless.Homeless;
import java.util.ArrayList;

/**
 *
 * @author viee
 */
public class HomelessDirectory {
    
    private ArrayList<Homeless> homelessList;

    public HomelessDirectory() {
        homelessList = new ArrayList();
        
        
        
         
        Homeless Person1 = new Homeless(1,"Rijul Marwaha",25,"Boylston Street","Male",false,true,true,false);
        Homeless Person2 = new Homeless(2,"Sanjam Chabra",20,"Boylston Street","Male",true,false,true,true);
        Homeless Person3 = new Homeless(3,"Garima Sisodia",19,"Quincy","Female",true,true,false,false);
        Homeless Person4 = new Homeless(4,"David Patel",45,"Waltham","Male",true,true,false,false);
        Homeless Person5 = new Homeless(5,"Vidhi Singh",26,"Park Drive","Female",false,true,true,true);
        Homeless Person6 = new Homeless(6,"Rachit Agrawal",44,"Boylston Street","Male",true,false,true,true);
        Homeless Person7 = new Homeless(7,"Devina Jaiswal",12,"Quincy","Female",false,true,false,true);
        Homeless Person8 = new Homeless(8,"Gaurav Lohani",23,"Waltham","Male",false,true,true,false);
        Homeless Person9 = new Homeless(9,"Nandita Pathardikar",15,"Saugus","Female",true,false,true,false);
        Homeless Person10 = new Homeless(10,"Shubhi Agrawal",21,"Boylston Street","Female",true,true,false,true);
        Homeless Person11 = new Homeless(11,"Aditya Kumar Dixit",18,"Brookline","Male",true,false,true,true);
        Homeless Person12 = new Homeless(12,"Sumit Nema",50,"Fenway","Male",false,true,false,false);
        Homeless Person13 = new Homeless(13,"Martin Jaiswal",62,"High Street","Male",false,true,true,true);
        Homeless Person14 = new Homeless(14,"Martina Singh",80,"Fenway","Female",true,false,true,false);
        Homeless Person15 = new Homeless(15,"Roshan Sodhi",47,"Boylston Street","Male",true,false,false,true);
        Homeless Person16 = new Homeless(16,"Prashant Shivhare",21,"Waltham","Male",true,true,true,false);
        Homeless Person17 = new Homeless(17,"Yash Purohit",22,"Park Drive","Male",true,true,false,true);
        Homeless Person18 = new Homeless(18,"Vandana Pathak",52,"Saugus","Female",true,true,true,false);
        Homeless Person19 = new Homeless(19,"Tanvi Tembhurne",26,"Brookline","Female",false,true,true,true);
        Homeless Person20 = new Homeless(20,"Prashant Singh",28,"Quincy","Male",true,false,true,true);
        Homeless Person21 = new Homeless(21,"Nitin Mittal",24,"Boylston Street","Male",true,true,false,true);
        Homeless Person22 = new Homeless(22,"Hitashu Kanjani",21,"Park Drive","Male",true,true,true,false);
        Homeless Person23 = new Homeless(23,"Anjali Chandani",22,"Brookline","Female",false,true,false,false);
        Homeless Person24 = new Homeless(24,"Arushi Sharma", 25,"Waltham","Female",true,false,true,false);
        Homeless Person25 = new Homeless(25,"Smith Singh",19,"Quincy","Male",false,true,true,true);
        
         
        homelessList.add(Person1);                                                  //Adding cab to catalog
        homelessList.add(Person2);
        homelessList.add(Person3);
        homelessList.add(Person4);
        homelessList.add(Person5);
        homelessList.add(Person6);
        homelessList.add(Person7);
        homelessList.add(Person8);
        homelessList.add(Person9);
        homelessList.add(Person10);
        homelessList.add(Person11);
        homelessList.add(Person12);
        homelessList.add(Person13);
        homelessList.add(Person14);
        homelessList.add(Person15);
        homelessList.add(Person16);
        homelessList.add(Person17);
        homelessList.add(Person18);
        homelessList.add(Person19);
        homelessList.add(Person20);
        homelessList.add(Person21);
        homelessList.add(Person22);
        homelessList.add(Person23);
        homelessList.add(Person24);
        homelessList.add(Person25);
        
    }

    public ArrayList<Homeless> getHomelessList() {
        return homelessList;
    }

    
    public Homeless createHomeless(){
        Homeless homeless = new Homeless();
        homelessList.add(homeless);
        return homeless;
    }
    
    
    
    public void deleteHomeless(Homeless homeless)
    {
        homelessList.remove(homeless);
    }
    
    
}
