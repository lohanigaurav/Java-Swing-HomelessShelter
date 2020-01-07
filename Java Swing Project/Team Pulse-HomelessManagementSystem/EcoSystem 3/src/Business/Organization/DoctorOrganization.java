/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.NGOSupervisorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author viee
 */
public class DoctorOrganization extends Organization{

    DoctorOrganization() {
        
        super(Organization.Type.Doctor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }
      //To change body of generated methods, choose Tools | Templates.
    }
    

