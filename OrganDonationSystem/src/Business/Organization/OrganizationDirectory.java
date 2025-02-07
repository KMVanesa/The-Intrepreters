/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author chief_kmv
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.EmergencyServices.getValue())){
            organization = new EmergencyServicesOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.TransplantCenter.getValue())){
            organization = new OPTC_Registry();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.OrganDonor.getValue())){
            organization = new UNOS_Registry();
            organizationList.add(organization);
        }
        return organization;
    }
    
}
