/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.os;

/**
 *
 * @author Denalda
 */
public class FCFSclass {
    
        public int noOfProcesses;
	public int brustTime;
 
        
public FCFSclass() {}

    public FCFSclass(int noOfProcesses, int brustTime) {
        this.noOfProcesses = noOfProcesses;
        this.brustTime = brustTime;
    }

    public int getNoOfProcesses() {
        return noOfProcesses;
    }

    public void setNoOfProcesses(int noOfProcesses) {
        this.noOfProcesses = noOfProcesses;
    }

    public int getBrustTime() {
        return brustTime;
    }

    public void setBrustTime(int brustTime) {
        this.brustTime = brustTime;
    }
        
}
