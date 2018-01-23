//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.01.23 at 12:46:18 PM MSK 
//


package ru.lumberjackcode.vacls.server.applicationparams;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxThreadPoolNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OpenCvPath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemParams", propOrder = {
    "maxThreadPoolNumber",
    "openCvPath"
})
public class SystemParams {

    @XmlElement(defaultValue = "1")
    protected int maxThreadPoolNumber;
    @XmlElement(name = "OpenCvPath", required = true)
    protected String openCvPath;

    /**
     * Gets the value of the maxThreadPoolNumber property.
     * 
     */
    public int getMaxThreadPoolNumber() {
        return maxThreadPoolNumber;
    }

    /**
     * Sets the value of the maxThreadPoolNumber property.
     * 
     */
    public void setMaxThreadPoolNumber(int value) {
        this.maxThreadPoolNumber = value;
    }

    /**
     * Gets the value of the openCvPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenCvPath() {
        return openCvPath;
    }

    /**
     * Sets the value of the openCvPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenCvPath(String value) {
        this.openCvPath = value;
    }

}
