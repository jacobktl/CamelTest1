
package com.widgetvendor.widgetorderform;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-11-18T14:23:05.386+05:30
 * Generated source version: 3.1.10
 */

@WebFault(name = "numInventory", targetNamespace = "http://www.w3.org/2001/XMLSchema")
public class BadSize extends Exception {
    
    private int numInventory;

    public BadSize() {
        super();
    }
    
    public BadSize(String message) {
        super(message);
    }
    
    public BadSize(String message, Throwable cause) {
        super(message, cause);
    }

    public BadSize(String message, int numInventory) {
        super(message);
        this.numInventory = numInventory;
    }

    public BadSize(String message, int numInventory, Throwable cause) {
        super(message, cause);
        this.numInventory = numInventory;
    }

    public int getFaultInfo() {
        return this.numInventory;
    }
}