/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.OPTC_Admin;
import Business.Role.OPTC_Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author chief_kmv
 */
public class OPTC_Registry extends Organization {
    
    public OPTC_Registry(){
        super(Organization.Type.TransplantCenter.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList();
        roles.add(new OPTC_Employee());
        return roles;
    }
    
}
