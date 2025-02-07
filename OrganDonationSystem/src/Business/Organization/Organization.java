/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
/**
 *
 * @author chief_kmv
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private UserAccountDirectory userAccountDirectory;
    private EmployeeDirectory employeeDirectory;
    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        TransplantCenter("Transplant Center Registry"),
        Doctor("Doctor Organization"),
        Lab("Lab Organization"),
        OrganDonor("Organ Donor Registry"),
        EmergencyServices("EmergencyServices");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value+counter;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
