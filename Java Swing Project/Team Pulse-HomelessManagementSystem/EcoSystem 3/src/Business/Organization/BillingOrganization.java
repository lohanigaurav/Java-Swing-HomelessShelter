/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.BillingRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author gloha
 */
public class BillingOrganization extends Organization {
   BillingOrganization() {
        
        super(Organization.Type.Billing.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BillingRole());
        return roles;
    } 
}
